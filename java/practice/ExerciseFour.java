package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseFour {

	// Given the list of integers, find the first element of the list using Stream functions?

	public static void main(String[] args) {
		findFirst(new ArrayList<Integer>(Arrays.asList(981, 10,15,8,49,25,98,98,32,15)));
	}

	private static void findFirst(List<Integer> inputList) {
		System.out.println(inputList.stream().findFirst().get());
	}

}
