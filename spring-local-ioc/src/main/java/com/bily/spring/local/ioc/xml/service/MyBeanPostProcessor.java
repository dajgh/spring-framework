package com.bily.spring.local.ioc.xml.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author dajgh
 * @create 2020-7-5
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor(){
		System.out.println("=============MyBeanPostProcessor 初始化======================");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println();
		System.out.println("=======================before============================");
		System.out.println("===========XxService BeanPostProcessor: postProcessBeforeInitialization()=========");
		System.out.println("=======================before============================");
		System.out.println();
		return null;
	}


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println();
		System.out.println("=======================after============================");
		System.out.println("===========XxService BeanPostProcessor: postProcessAfterInitialization()=========");
		System.out.println("=======================after============================");
		System.out.println();
		return null;
	}

}
