## Problem:

```java
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		HashMap<Employee, Employee> tracker = new HashMap<>();
		List<Employee> noDupsList = new ArrayList<>();
		for(int i = 0; i < employees.size(); ++i) {
			Employee e = employees.get(i);
			if(!tracker.containsKey(e)) {
				tracker.put(e, e);
				noDupsList.add(e);
			} else {
				tracker.get(e).setVisited(true);
			}
		}
		return noDupsList;
	}
```

---

Here, we have defined our own implementation of equals and hasCode in class Employee.
So, hashCode will always generate same key-code for the object. i.e

```java
Employee e1 = new Employee("Richard", 55000);
Employee e2 = new Employee("Richard", 55000);
System.out.println(e1.hashCode()); // 1544764459
System.out.println(e2.hashCode()); // 1544764459
```

Now from the code:

- `tracker.containsKey(e)`: will check both the hashCode key and the object equals.
  - So for the same object if the HashCode is same, but the object-key is different it treats as, just a hash collision, and adds a value.  (eg: Assume we have a hashing function that generates 4digit hash key, and the key "this is test" generated hashCode: 1455 , and coincidently "some other radom string" also generated same hasCode 1455. Here hascode is same, but they key equals is different. This is just a hash collision. )

### Example: In our code

```java
HashMap<Employee, Employee> tracker = new HashMap<>();
Employee e = new Employee("Richard", 55000);

// 1st Time
tracker.containsKey(e) // false - Since this is the first time we are adding element, as tracker has no elements before
tracker.put(e, e); // 1544764459 -> reference to e

// 2nd time
tracker.containsKey(e) // true - In map we already have hashKey 1544764459, and the key "1544764459" also equals to e.
// Note: equal method checks all three attributes of key Object i.e e: (name, salary, visited) all three are equal. 
tracker.get(e).setVisited(true); // get the object with hashKey 1544764459 and modify its visited attribute.
// NOTICE HERE: WE not only change the object value, but also a key value , as we have used same object as key and value `tracker.put(e, e)`,

// 3rd time
tracker.containsKey(e) // false - we already have hashKey 1544764459, but the value of the key "1544764459" is not equal to e.
// Note: equal method checked all three attributes (name, salary, visited) but this time found out the value of visited was different.
// So now for the interpreter, this is just a HASH COLLISION.
tracker.put(e, e); // So, where the Node of same previous hashKey was (1544764459) will now point to this new Object.
// i.e { key: 1544764459, value: e, next: -> reference to this current e }

// 4th time
tracker.containsKey(e) // true - In map we already have hashKey 1544764459, and the value of the key "1544764459" also equals to e.
tracker.get(e).setVisited(true);

// 5th time
// 6th time

// .....
tracker.containsKey(e) // true. Node{key: 1544764459, ...... , next -> Node {key: 1544764459, .... }
// Even if 1st key value doesnt equals, the second will
// Since only visited attribute is mutating, and in 4th steps, we already have the combination of its value in the map.

```

Since, the HashMap uses both hashCode and equality comparisons to identify a certain key-value pair with a given key.
It calculates hasCode of employee key only once and store it inside for its need.
and the hash map internal hash will not be recalculated, as internal value mutates.
So, for same hasCode but equals is false, it interprets as hash collision, adding the elements into the same key as hash chain.

## Solution:

- Make hashCode and equals not to process mutating key.
- Avoid mutating (adding/changing) the key in map.
