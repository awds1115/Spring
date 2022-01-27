package com.human.exercise;

import java.io.IOException;
import java.rmi.AccessException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/look", method = RequestMethod.GET)
	public String look(HttpServletRequest hsr, Model model) {
		model.addAttribute("mobile", "010-5583-4032");
		model.addAttribute("address", "준빌리지 401호");
		return "look";
	}

	@RequestMapping("/view")
	public String view(HttpServletRequest hsr) {
		String nick = hsr.getParameter("nickname"); // client에서 보내진 data를 수집
		System.out.println("[" + nick + "]");
		return "redirect:/look";
	}

	@RequestMapping("/input")
	public String input(HttpServletRequest hsr, Model model) {
		return "input";
	}
	@RequestMapping("/plus")
	public String plus(HttpServletRequest hsr, Model model) {
		return "plus";
	}
	@RequestMapping("/multi")
	public String multi(HttpServletRequest hsr, Model model) {
		return "multi";
	}
	@RequestMapping("/minus")
	public String minus(HttpServletRequest hsr, Model model) {
		return "minus";
	}
	@RequestMapping("/divide")
	public String divide(HttpServletRequest hsr, Model model) {
		return "divide";
	}
	@RequestMapping("/calc")
	public String calc(HttpServletRequest hsr, Model model) {
		String jspName="";
		try {
			int x1 = Integer.parseInt(hsr.getParameter("x1"));
			int x2 = Integer.parseInt(hsr.getParameter("x2"));
			String op = hsr.getParameter("op");
			if(op.equals("+")) {
				model.addAttribute("plus",(x1+x2));
				jspName="plus";
			} else if(op.equals("*")) {
				model.addAttribute("multi",(x1*x2));
				jspName="multi";
			} else if(op.equals("-")) {
				model.addAttribute("minus",(x1-x2));
				jspName="minus";
			} else if(op.equals("/")) {
				model.addAttribute("divide",(x1/x2));
				jspName="divide";
			} else {
				model.addAttribute("op2","연산자 불명");
				jspName="error";
			}
		} catch(Exception e) {
			model.addAttribute("num","값 오류");
			jspName="error";
		}
			return jspName;
		
		
//		try {
//			int x1 = Integer.parseInt(hsr.getParameter("x1"));
//			int x2 = Integer.parseInt(hsr.getParameter("x2"));
//			int result = x1 * x2;
//
//			if (result > 20) {
//				model.addAttribute("result", result);
//				return "calc";
//			} else {
//				model.addAttribute("result", result);
//				return "input";
//			}
//
//		} catch (Exception e) {
//			model.addAttribute("result", "error");
//			return "input";
//		}

//		if(hsr.getParameter("x1")=="" || hsr.getParameter("x1")==null ||
//		   hsr.getParameter("x2")=="" || hsr.getParameter("x2")==null ||
//		   hsr.getParameter("x1").equals("")) {
//			return "input";
//		} 

	}

}
