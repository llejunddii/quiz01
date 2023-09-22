package edu.mit.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // junti으로 테스트 할때 스프링 프레임워크를 이용해서 해라
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MyLogic3Tests {
	
	@Autowired
	MyLogic3 logic;
	
	@Test
	public void test3() {
		log.info(logic.addup(1,10));
		log.info(logic.evenAddUp(1,10));
	}

}
