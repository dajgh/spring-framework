package com.bily.spring.local.ioc.anno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dajgh
 * @create 2022-3-13
 */
@Service
public class DService {
	@Autowired
	private CService cService;
}
