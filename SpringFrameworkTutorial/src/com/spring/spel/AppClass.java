package com.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class AppClass {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/spel/springconfig.xml");
		
//		SpringExpressionLanguage expressionLanguage = applicationContext.getBean("spEL",SpringExpressionLanguage.class);
//		
//		System.out.println(expressionLanguage.toString());
//		
//		SpelExpressionParser temp = new SpelExpressionParser();
//		org.springframework.expression.Expression expression = temp.parseExpression("22+10");
//		
//		System.out.println(expression.getValue());
		
		SpELStatic elStatic = applicationContext.getBean("SpELStatic",SpELStatic.class);
		
		System.out.println(elStatic.toString());
	}
}
