package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseThree {

	// How to find duplicate elements in a given integers list in java using Stream functions?

	public static void main(String[] args) {
		findDuplicates(new ArrayList<Integer>(Arrays.asList(98, 10,15,8,49,25,98,98,32,15)));
	}

	private static void findDuplicates(List<Integer> inputList) {
		inputList.stream().distinct().forEach(i -> System.out.println(i));
	}

}
