package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseNine {

	// Given a list of integers, sort all the values present in it using Stream
	// functions?

	public static void main(String[] args) {
		sort(new ArrayList<Integer>(Arrays.asList(10, 13, 14, 22, 56, 43, 789, 49, 61, 55, 37, 88, 57, 33, 22)));
	}

	private static void sort(List<Integer> inputList) {
		inputList.stream().sorted().forEach(i -> System.out.println(i));
		;
	}

}
