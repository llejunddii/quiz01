package edu.mit.logic;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Component // 스프링에서 관리되는 객체라는 어노테이션
@Log4j
public class MyLogic3 {
	
	
		
		public int addup(int num1,int num2) { // num1부터 num2까지 모두 더해서 리턴해주는 메소드
			int sum=0;
			for(int i=num1; i<=num2; i++) {
				sum+=i;
			}
			log.info("addup 실행!!!!!!!" + sum);
			return sum;
		}
		public int evenAddUp(int num1,int num2) { // num1부터 num2까지 짝수만 모두 더해서 리턴해 주는 메소드
			int sum=0;
			for(int i=num1; i<=num2; i++) {
				if(i%2==0) {
				sum+=i;
				}
			}
			
			return sum;
			
		}

}
