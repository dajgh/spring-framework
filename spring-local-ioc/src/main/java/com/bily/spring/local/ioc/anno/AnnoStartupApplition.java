package com.bily.spring.local.ioc.anno;

import com.bily.spring.local.ioc.anno.service.CService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author dajgh
 * @create 2022-3-13
 */
//@ComponentScan("com.bily.spring.local.ioc.anno")
@ComponentScan
@Configuration
public class AnnoStartupApplition {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
//				new AnnotationConfigApplicationContext(AnnoStartupApplition.class);
		new AnnotationConfigApplicationContext("com.bily.spring.local.ioc.anno");
		CService cService = applicationContext.getBean(CService.class);
		cService.hello();
		applicationContext.close();
	}
}
