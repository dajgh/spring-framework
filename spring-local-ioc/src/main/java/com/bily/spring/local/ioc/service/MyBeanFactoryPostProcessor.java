package com.bily.spring.local.ioc.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author dajgh
 * @create 2020-7-5
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor(){
		System.out.println("=========MyBeanFactoryPostProcessor 初始化==========");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("==========MyBeanFactoryPostProcessor =postProcessBeanFactory==========================");
	}
}
