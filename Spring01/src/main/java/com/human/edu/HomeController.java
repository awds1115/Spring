package com.human.edu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {                          
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */              //URL경로               //데이터 수신방식 (GET/POST)
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {   	
		return "home";    // JSP파일이름
	}
//	@RequestMapping("/login")  //경로
//	public String login(Model model) {    // 함수
//		return "login";    // 이동할jsp 
//	}       
	@RequestMapping("/login")  
	public String login(HttpServletRequest hsr,Model m) {   
//		m.addAttribute("userid",hsr.getParameter("id"));    
//		m.addAttribute("password",hsr.getParameter("pw"));  
		return "login";    
	}       
	
	
//	@RequestMapping("/login")  
//	public ModelAndView login() {  // 위의 코드와 동일한 기능을 함. 모델앤뷰
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("userid","aaa1111"); // userid="aaa1111"
//		mv.addObject("password","human123"); // password="human123" 변수생성
//		mv.setViewName("login");
//		return mv;
//	}
	@RequestMapping("/doLogin")
	public String doLogin(HttpServletRequest hsr, Model model) {
		String userid=hsr.getParameter("id");
		if(userid.equals("")) {
			return "login";
		} else {
			model.addAttribute("id",userid);
			return "home";
		}
		
	}
	@RequestMapping("/signon")
	public String signon() {
		return "signon";
	}
//	@RequestMapping("/signon_check")
//	public String signon_check(HttpServletRequest hsr, Model model) {
//		String name=hsr.getParameter("realname");
//		if(name.equals("")) {
//			return "signon";
//		} else {
//			return "login";
//		}
//	}
	@RequestMapping("/signon_check")  // 파람 을 이용해서 코드 짜는법 ( 위의 코드랑 같다 )
	public String signon_check(@RequestParam("realname") String name, Model model) {
		if(name.equals("")) { // String name=hsr.getParameter("realname"); 을 파람으로 직접 넣음 
			return "signon";
		} else {
			return "login";
		}
	}
	@RequestMapping("/logout")
	public String logout() {
		return "home";
	}
}
