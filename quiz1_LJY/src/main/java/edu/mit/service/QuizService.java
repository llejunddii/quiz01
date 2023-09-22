package edu.mit.service;

import org.springframework.stereotype.Service;

import edu.mit.dao.TwoVO;
import edu.mit.logic.MyLogic3;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor // 생성자 주입
@Service // 서비스를 하기 위한 어노테이션
@Log4j
public class QuizService {
	
	
	private MyLogic3 mylogic;
	
	// 두수를 모두 더해서 돌려주는 서비스
	public int allsum(TwoVO vo) {
		log.info("서비스 실행!!!!!!");
		
		return mylogic.addup(vo.getNum1(), vo.getNum2());
		
	}
	
	// num숫자를 DB에 등록해주는 서비스
	public int insert(TwoVO vo) {
		log.info("num1,num2 DB 저장 요청 !!!!!!!!");
		
		
		return 0;
		
	}

}
