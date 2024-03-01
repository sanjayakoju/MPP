## 1 (a)
```java

Runnable r = () →
{
    int[][] products = new int[s][t];
    for (int i = 0; i < s; i++) {
        for(int j = i + 1; j < t; j++) { 
         products[i][j] = i * j; 
        } 
    }
 }

```

Parameters: N/A  
Free Variables: s, t

## 1 (b)

```java
Comparator<String> comp = (s, t) →
 {
     if(ignoreCase == true) {
        return s.compareToIgnoreCase(t);
    } else {
        return s.compareTo(t);
    }
 }

```

Parameters: s, t  
Free Variables: ignoreCase