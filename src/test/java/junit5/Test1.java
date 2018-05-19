package junit5;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Tag;

@RunWith(JUnitPlatform.class)
public class Test1 {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	@Tag("fast")
	public void test0(){
		logger.info("running test0");
		assertEquals(2,1+1);
	}
	
	@Test
	@Tag("smoke")
	public void test1(){
		logger.info("running test1");
		assertEquals(3,1+1);
	}
	
	@Test
	@Tag("smoke")
	@Tag("feature-a")
	public void test2(){
		logger.info("running test2");
		assertEquals(4,1+1);
	}
	
	@Test
	@Tag("feature-a")
	public void test3(){
		logger.info("running test3");
		assertEquals(5,1+1);
	}
	
	@Test
	@Tag("aaa")
	public void test4(){
		logger.info("running test4");
		assertEquals(6,1+1);
	}
}
