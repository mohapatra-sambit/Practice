package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseSix {

	// Given a list of integers, find the maximum value element present in it using
	// Stream functions?

	public static void main(String[] args) {
		System.out.println(
				getMax(new ArrayList<Integer>(Arrays.asList(981, 10, 15, 8, 49, 25, 98, 98, 32, 15, 68, 1076))));
	}

	private static int getMax(List<Integer> inputList) {
		return inputList.stream().max(Integer :: compare).get();
	}

}
