package com.bily.spring.local.ioc.xml.service;

import com.bily.spring.local.ioc.xml.service.AService;

/**
 * @author dajgh
 * @create 2020-7-2
 */
public class BService {
	AService aService;

	public AService getaService() {
		return aService;
	}

	public void setaService(AService aService) {
		this.aService = aService;
	}
}
