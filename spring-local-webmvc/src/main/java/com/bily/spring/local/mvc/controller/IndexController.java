package com.bily.spring.local.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

/**
 * @author dajgh
 * @create 2020-7-10
 */
@Controller
@RequestMapping("/index")
public class IndexController {


   @RequestMapping("/handler01")
    public ModelAndView handler01(ModelAndView mv) {
        mv.addObject("date", LocalDate.now().toString());
        mv.setViewName("success");
        return mv;
    }

}
