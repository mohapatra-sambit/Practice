package practice;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciseEight {

	// Given a String, find the first repeated character in it using Stream
	// functions?

	public static void main(String[] args) {
		System.out.println(getFirstNonUniqueChar("aquickbrownfoxqickbjumpsoverthelzydog"));
	}

	private static char getFirstNonUniqueChar(String str) {
		return str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get().getKey();
	}

}
