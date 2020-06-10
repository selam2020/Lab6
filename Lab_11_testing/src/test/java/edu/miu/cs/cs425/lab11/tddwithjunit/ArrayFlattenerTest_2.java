package edu.miu.cs.cs425.lab11.tddwithjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest_2 {

	private ArrayFlattener arrayFlattener=null;
	@Before
	public void setUp() throws Exception {
		this.arrayFlattener=new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testNull() {
		Integer[][]input1= null;
		Integer[]expecteds= null;
		Integer[]actuals=arrayFlattener.flattenArray(input1);
		assertArrayEquals(expecteds, actuals);
		
	}

}
