package com.joeknowles.SpringCounter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	private int mCount = 0;
	
	@RequestMapping("/")
	public String index() {
		++mCount;
		return "index.jsp";
	}
	
	@RequestMapping("/twoCount")
	public String twocount(HttpSession session) {
		mCount += 2;
		return "twoCount.jsp";
	}	
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.setAttribute("count", mCount);
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		mCount = 0;
		session.setAttribute("count", mCount);
		return "counter.jsp";
	}
}
