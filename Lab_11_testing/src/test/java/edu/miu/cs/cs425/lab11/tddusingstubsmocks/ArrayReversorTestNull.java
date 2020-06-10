
package edu.miu.cs.cs425.lab11.tddusingstubsmocks;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab11.tddusingstubsmocks.service.IArrayFlattenerService;

public class ArrayReversorTestNull {
	
private ArrayReversor arrayReversor;
	
	private IArrayFlattenerService iArrayFlattenerService=mock(IArrayFlattenerService.class);


	

	@Before
	public void setUp() throws Exception {
		this.arrayReversor= new ArrayReversor(iArrayFlattenerService);
	}
	
	
	@Test
	public void testNull() {
		when(iArrayFlattenerService.flattenArray(null)).thenReturn(null);
		Integer[] actual=arrayReversor.arrayReversor(null);
		Integer[] expecteds=null;
		assertArrayEquals(expecteds,actual);
     	verify(iArrayFlattenerService).flattenArray(null);


	}
}
