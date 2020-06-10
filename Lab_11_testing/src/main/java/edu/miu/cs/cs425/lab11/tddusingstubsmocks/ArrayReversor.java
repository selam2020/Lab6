package edu.miu.cs.cs425.lab11.tddusingstubsmocks;

import edu.miu.cs.cs425.lab11.tddusingstubsmocks.service.IArrayFlattenerService;

public class ArrayReversor {
	public static void main(String[] args) {
		Integer[][]test= {{1,2},{3,4}};
//		arrayReversor(test );
	}
	
	private IArrayFlattenerService iArrayFlattenerService;

	public ArrayReversor(IArrayFlattenerService iArrayFlattenerService) {
		this.iArrayFlattenerService = iArrayFlattenerService;

	}

	public   Integer[] arrayReversor(Integer[][] arrays) {
		Integer[] flattened = iArrayFlattenerService.flattenArray(arrays);
		if(arrays==null) {
			return null;
		}
		
		Integer[] reversedArray = new Integer[flattened.length];
		int j = 0;
		for (int i = flattened.length - 1; i>=0; i--) {
			reversedArray[j++] = flattened[i];

		}
		return reversedArray;

	}

}
