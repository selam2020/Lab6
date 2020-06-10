package edu.miu.cs.cs425.lab11.tddwithjunit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest_1 {
private ArrayFlattener arrayFlattener=null;
	@Before
	public void setUp() throws Exception {
		this.arrayFlattener=new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		Integer[][]input1= {{1,2},{0},{4,5,9}};
		Integer[]expecteds= {1,2,0,4,5,9};
		Integer[]actuals=arrayFlattener.flattenArray(input1);
		assertArrayEquals(expecteds, actuals);
		
	}
	
}
