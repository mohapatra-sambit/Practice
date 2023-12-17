package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciseOne {

	// Given a list of integers, find out all the even numbers that exist in the
	// list using Stream functions?

	public static void main(String[] args) {
		System.out.println(printEven(
				new ArrayList<Integer>(Arrays.asList(10, 13, 14, 22, 56, 43, 789, 49, 61, 55, 37, 88, 57, 33, 22))));
	}

	private static List<Integer> printEven(List<Integer> inputList) {
		return inputList.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
	}

}
