package Collection_Task;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class tq {
public static void main(String[]args) {
	String k="Java";
	
	List<String> words = Arrays.asList(k.toLowerCase());///.split(" "));

    // Find duplicates using Streams
    Set<String> duplicates = words.stream()
        .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() > 1)
        .map(x->x.getKey())
        .collect(Collectors.toSet());

    
    System.out.println("Duplicate words: " + duplicates);
}
}
