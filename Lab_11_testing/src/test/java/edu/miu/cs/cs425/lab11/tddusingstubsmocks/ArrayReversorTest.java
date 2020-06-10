package edu.miu.cs.cs425.lab11.tddusingstubsmocks;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

//import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab11.tddusingstubsmocks.service.IArrayFlattenerService;



public class ArrayReversorTest {
	
	private ArrayReversor arrayReversor;
	
	private IArrayFlattenerService iArrayFlattenerService=mock(IArrayFlattenerService.class);


	@Before
	public void setUp() throws Exception {
		this.arrayReversor= new ArrayReversor(iArrayFlattenerService);
	}

	@After
	public void tearDown() throws Exception {
		this.arrayReversor=null;
	}

	@Test
	public void test() {
		Integer[][]arr=new Integer[][]{{1,3},{0},{4,5,9}};
		Integer[]flattened= {1,3,0,4,5,9};
		when(iArrayFlattenerService.flattenArray(arr)).thenReturn(flattened);
		Integer[] actual=arrayReversor.arrayReversor(arr);
		Integer[] expecteds={9,5,4,0,3,1};
		assertArrayEquals(expecteds,actual);
		verify(iArrayFlattenerService).flattenArray(arr);

		

}
	
		

}

	

