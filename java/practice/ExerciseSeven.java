package practice;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciseSeven {

	// Given a String, find the first non-repeated character in it using Stream
	// functions?

	public static void main(String[] args) {
		System.out.println(getFirstUniqueChar("a quick brown fox qickb jumps over the lazy dog"));
	}

	private static char getFirstUniqueChar(String str) {
		return str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
	}

}
