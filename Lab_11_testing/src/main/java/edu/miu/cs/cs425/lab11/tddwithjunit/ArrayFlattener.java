package edu.miu.cs.cs425.lab11.tddwithjunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {

	public Integer[] flattenArray(Integer[][] arrays) {
		if(arrays==null) {
			return null;
		}
		List<Integer> list = new ArrayList<>();
		for (Integer[] arr : arrays) {
			Arrays.stream(arr).forEach(list::add);
		}
		return list.stream().toArray(Integer[]::new);
	}

}
