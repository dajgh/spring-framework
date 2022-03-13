package com.bily.spring.local.ioc.xml.service;

/**
 * @author dajgh
 * @create 2020-7-2
 */

public class AService {


	private BService bService;

	public BService getbService() {
		return bService;
	}

	public void setbService(BService bService) {
		this.bService = bService;
	}

	public void sayHello(){
		System.out.println("hello~~");
	}
}
