## Problem:

```java 
List<Employee> answer = removeDuplicates(list);
``` 
Method `removeDuplicates(list)` is working as expected. 
It takes the list, puts element in tracking list "noDupsElement" and removes the duplicate element by calling __Employee equals method__.  
Which in turn checks `e.name.equals(name) && e.salary == salary;`.


> __Note:__
It invokes Employee class `public boolean equals(Employee e) { }` method.
Remember its not overriding Object class equals method, because to override equals method, it must be of the signature
```@Override public boolean equals(Object obj) { } ```

However on the comparision: 

```java
public static boolean listsAreEqual(List<Employee> l1, List<Employee> l2) {
    if(l1.size() != l2.size()) return false;
    for(Employee e : l1) {
        if(!l2.contains(e)) return false;
    }
    return true;
}
```

__Here__:
- l1 and l2 size are equal. i.e list answer and dupsRemoved, are of course of same size.
- __But__ for l2.contains(e). Here, _contains_ method is called from a list which in turn calls `public boolean contains(Object o) { }` on ArrayList.
- This implementation calls the Object class equals method i.e `this == obj`. which uses reference comparison, and is always false unless the object has same reference.
- Note: Objects created using new, will always have different reference. So we need to override the equality check, to compare their values.

```java 
Employee e1 = new Employee("Richard", 55000);
Employee e2 = new Employee("Richard", 55000);
System.out.println(e1 == e2); // false
```

## Solution:
1. __Better Approach__: Change the equals' method on Employee class to match with the Object class. 
And then make object comparison in term's of its value.

2. OR can also change the line:   (Not recommended)
- `if(!l2.contains(e)) return false;` to  
- `if(!inList(e, l2)) return false;`
