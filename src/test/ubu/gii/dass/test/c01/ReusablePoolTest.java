/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;

/**
 * @author Alvaro Villa Val y Jorge Vara Rodriguez
 * 			
 *
 */
public class ReusablePoolTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pool1 = ReusablePool.getInstance();
        ReusablePool pool2 = ReusablePool.getInstance();
        assertEquals(pool1, pool2);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		ReusablePool pool = ReusablePool.getInstance();
		try {
			Reusable reusable = pool.acquireReusable();
			assertNotNull(reusable);
		} catch (NotFreeInstanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}. 
	 */
	@Test
	public void testReleaseReusable() {
	    ReusablePool pool = ReusablePool.getInstance();
	    Reusable reusable = null;
	    try {
	        reusable = pool.acquireReusable(); // Adquirimos un objeto del pool
	        assertNotNull(reusable); // Verificamos que se haya adquirido correctamente

	        // Liberamos el objeto al pool
	        pool.releaseReusable(reusable);
	    } catch (Exception e) {
	        fail("Exception not expected: " + e.getMessage());
	    }

	    try {
	        // Intentamos adquirir un objeto del pool nuevamente
	        Reusable newReusable = pool.acquireReusable();
	        // Verificamos que sea el mismo objeto que liberamos anteriormente 
	        assertSame(reusable, newReusable);
	    } catch (Exception e) {
	        fail("Exception not expected: " + e.getMessage());
	    }
	}
	

}
