package com.bily.spring.local.ioc.service;

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
