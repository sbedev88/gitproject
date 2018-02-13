package app;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

import org.junit.*;

import org.junit.Assert.*;

public class ApplicationTest extends TestCase{
	
	Application a = new Application();
	
	@Before
	public void setUp(){
		
		
		
	}
	
	@After
	public void after(){
		
	}
	
	
	@Test
	public void testAdd(){
		
		assertEquals(10, a.addition(6, 4));
		
		
	}

}
