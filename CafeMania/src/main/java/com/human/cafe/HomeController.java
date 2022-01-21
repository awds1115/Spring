package com.human.cafe;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.human.cafe.iCafe; // 인터페이스 임포트 

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		iCafe cafe=sqlSession.getMapper(iCafe.class);
//		ArrayList<Menu> ml=cafe.getMenuList();
//		System.out.println("Menu length:"+ ml.size());
		model.addAttribute("ml",cafe.getMenuList());
		return "home";
	}
	@ResponseBody // 리턴을 했을때 그냥이동이 아닌 data를 이동시킨다.
	@RequestMapping(value="/list", method=RequestMethod.POST,
					produces="application/json; charset=utf-8")
	public String list() {
		iCafe cafe=sqlSession.getMapper(iCafe.class);
		ArrayList<Menu> ml=cafe.getMenuList();
		JSONArray ja=new JSONArray();
		//JSONObject -> JSONArray -> toString -> writer().print() 순서
		//{name:'americano',price:2000},{name:'mocca',price:3500},{name:'latte',price:3000}
		for(int i=0; i<ml.size(); i++) {
		JSONObject jo = new JSONObject();
		jo.put("code",ml.get(i).getCode());
		jo.put("name",ml.get(i).getName());
		jo.put("price",ml.get(i).getPrice());
		ja.add(jo);
		}
		return ja.toString();
	}
	@ResponseBody
	@RequestMapping(value = "/insertMenu", method= RequestMethod.POST,
			produces="application/json; charset=utf-8")
	public String insertMenu(HttpServletRequest hsr) {
		String retval="";
	try {
		String name=hsr.getParameter("name");
		int price=Integer.parseInt(hsr.getParameter("price"));
		
		iCafe cafe=sqlSession.getMapper(iCafe.class);
		cafe.insertMenu(name,price);
		retval="ok";
	} catch(Exception e) {
		retval="fail";
	}
		return retval;
}
	@ResponseBody
	@RequestMapping(value = "/updateMenu", method= RequestMethod.POST,
			produces="application/json; charset=utf-8")
	public String updateMenu(HttpServletRequest hsr) {
		String retval="";
		try {
			int code=Integer.parseInt(hsr.getParameter("code"));
			String name=hsr.getParameter("name");
			int price=Integer.parseInt(hsr.getParameter("price"));
			
			iCafe cafe=sqlSession.getMapper(iCafe.class);
			cafe.updateMenu(code,name,price);
			retval="ok";
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	@ResponseBody
	@RequestMapping(value = "/deleteMenu", method= RequestMethod.POST,
			produces="application/json; charset=utf-8")
	public String deleteMenu(HttpServletRequest hsr) {
		String retval="";
		try {
			int code=Integer.parseInt(hsr.getParameter("code"));
			
			iCafe cafe=sqlSession.getMapper(iCafe.class);
			cafe.deleteMenu(code);
			retval="ok";
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	
}
