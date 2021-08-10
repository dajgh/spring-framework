package com.bily.spring.local.ioc.service;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author dajgh
 * @create 2020-7-5
 */

public class XxService implements InitializingBean {

	public XxService() {
		System.out.println("============XxService 初始化===================");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("===========XxService InitializingBean: afterPropertiesSet()=========");
	}
}
