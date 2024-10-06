import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

    // Frequency of each character from a string

    public HashMap<Character,Integer> map = new HashMap<>();

    public Map<Character, Long> frequncyEachCharacter(String str){
        return str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

//    public Map<Map.Entry<String,Long>, Long> frequncyEachMapValue(HashMap<String,String> map){
//        return map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
//    }
}
