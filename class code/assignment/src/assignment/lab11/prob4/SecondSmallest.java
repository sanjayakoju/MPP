package assignment.lab11.prob4;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallest {

    public static <T> T secondSmallest(List<? extends Comparable> list){
        if(list==null || list.size()<=1) return null;
        return (T) list.stream().sorted().collect(Collectors.toList()).get(1);
    }
    
    

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC","BCD","DEF");
        System.out.println(""+secondSmallest(list));

        List<Integer> list1 = Arrays.asList(3,4,5,1,5,0,6);
        System.out.println(""+secondSmallest(list1));
    }
}
