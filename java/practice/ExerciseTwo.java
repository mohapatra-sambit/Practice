package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseTwo {

	// Given a list of integers, find out all the numbers starting with 1 using
	// Stream functions?

	public static void main(String[] args) {
		filterNumbersStartingWithOne(
				new ArrayList<Integer>(Arrays.asList(10, 13, 14, 22, 56, 43, 789, 49, 61, 55, 37, 88, 57, 33, 22)));
	}

	private static void filterNumbersStartingWithOne(List<Integer> inputList) {
		inputList.stream().map(i -> "" + i).filter(i -> i.startsWith("1")).forEach(i -> System.out.println(i));
	}

}
