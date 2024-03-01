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
			}
		}
		return noDupsList;
	}
``` 
---
HashMap puts the element in (key: value) by computing hasCode of provided __"key"__.
i.e 
```java 
Employee e1 = new Employee("Richard", 55000);
Employee e2 = new Employee("Richard", 55000);
System.out.println(e1.hashCode()); // 1705736037
System.out.println(e2.hashCode()); // 455659002
```
__Here:__  
- Object e1 and e2 has different reference. Which in turns computes to different hashCode i.e 1705736037 and 455659002.  
- `tracker.containsKey(e)`: will return false. Since, the key is different.  __Note: HashMap "contains()" method checks both the hasCode and object equals__
- And `tracker.put(e, e);`: puts object "e as a key" and also object "e as a value". i.e 
  - 1705736037 -> e1, and 
  - 455659002 -> e2  

    in its map. 

- Resulting the final map size as full 20. __No Duplicates were removed.__ 
- As all objects had different references and by default computed key was of different hashcode. and all objects were added to the Map.

## Solution:
We need to make sure that for the objects that are equal, if the object is provided as key, the hasCode should always computes the same value.  
i.e computation should be done with respect to its values.
So, In this way, we don't put same object twice in HashMap.
