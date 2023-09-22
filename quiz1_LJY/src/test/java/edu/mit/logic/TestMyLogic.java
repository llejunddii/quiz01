package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class TestMyLogic {
	
	@Test
	public void test1() {
		log.info(MyLogic.addup(1, 10));
	}
	
	@Test
	public void test2() {
		log.info(MyLogic.evenAddUp(1, 10));
	}
	
	

}
