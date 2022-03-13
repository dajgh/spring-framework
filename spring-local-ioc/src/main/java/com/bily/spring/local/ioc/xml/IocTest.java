package com.bily.spring.local.ioc.xml;

import com.bily.spring.local.ioc.xml.service.AService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dajgh
 * @create 2020-7-5
 */
public class IocTest {

	public static void xml() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
//		XxService xxService = applicationContext.getBean(XxService.class);
//		System.out.println("xxService = " + xxService);
		AService aService = applicationContext.getBean(AService.class);
		aService.sayHello();
		applicationContext.close();
	}

	public static void main(String[] args) {
		xml();
	}
}
