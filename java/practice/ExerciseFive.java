package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseFive {

	// Given a list of integers, find the total number of elements present in the list using Stream functions?

	public static void main(String[] args) {
		System.out.println(getSize(new ArrayList<Integer>(Arrays.asList(981,10,15,8,49,25,98,98,32,15,68))));
	}

	private static long getSize(List<Integer> inputList) {
		return inputList.stream().count();
	}

}
