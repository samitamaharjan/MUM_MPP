package lambda_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MyCode {
    public static void main (String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("james");
        list.add("john");
        list.add("samita");
        list.add("amy");
        list.add("ben");
        
        List<String> result = findStartsWithLetter(list, "j");
        // result.forEach(s -> System.out.println(s));
        result.forEach(System.out::println);
        
    }
    
    /* public static List<String> findStartsWithLetter(List<String> list, String letter){
        return list.stream()
            .filter(name -> name.startsWith(letter))
            .map(name -> name.toUpperCase())
            .collect(Collectors.toList());
    } */
    
     public static List<String> findStartsWithLetter(List<String> list, String letter){
        return list.stream()
            .filter(name -> name.startsWith(letter))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    }
}
