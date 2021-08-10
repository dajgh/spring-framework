package com.bily.spring.local.ioc.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dajgh
 * @create 2020-7-5
 */
public class IocTest {

	@Test
	public void testIoc(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
//		XxService xxService = applicationContext.getBean(XxService.class);
//		System.out.println("xxService = " + xxService);
		AService aService = applicationContext.getBean(AService.class);
		aService.sayHello();
	}
}
