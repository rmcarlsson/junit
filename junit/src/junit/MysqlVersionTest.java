/**
 * 
 */
package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author mikael
 *
 */
public class MysqlVersionTest {
	

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
	 * Test method for {@link junit.MysqlVersion#getVersion()}.
	 */
	@Test
	public void testGetVersion() {
		MysqlVersion dut = new MysqlVersion();
		
		String result = dut.getVersion();
		
		assertTrue("Mysql version missmatch", result.equals("5.5.41-0ubuntu0.12.04.1"));
	}

}
