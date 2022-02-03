package com.human.exercise;

import java.io.IOException;
import java.rmi.AccessException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class MyController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/Room")
	public String doRmList(Model model) {
		iEmp rml = sqlSession.getMapper(iEmp.class);// 인터페이스 이름 작성(iEmp)
		ArrayList<Employee> alrml = rml.getRmList();
		model.addAttribute("alRml", alrml);
		return "addRoom";
	}
	
	@RequestMapping("/addtype")
	public String typeadd(HttpServletRequest hsr) {
		return "addtype";
	}
	@RequestMapping("/insertType")
	public String insertType(HttpServletRequest hsr) {
		int code= Integer.parseInt(hsr.getParameter("typecode"));
		String name= hsr.getParameter("typename");
		
		iEmp room = sqlSession.getMapper(iEmp.class);
		room.insertType(code,name);
		return "addtype";
	}
//	@RequestMapping("/Room")
//	public String doRoomadd(HttpServletRequest hsr) {
//	
//		return "addRoom";
//	}
	@RequestMapping("/addRoom")
	public String DoaddRoom(HttpServletRequest hsr) {
		String name= hsr.getParameter("roomname");
		int type= Integer.parseInt(hsr.getParameter("roomtype"));
		int howmany= Integer.parseInt(hsr.getParameter("howmany"));
		int howmuch= Integer.parseInt(hsr.getParameter("howmuch"));
		
		iEmp room = sqlSession.getMapper(iEmp.class);
		room.addRoom(name, type,howmany,howmuch);
		return "redirect:/addRoom";
	}
	
	@RequestMapping("/addMenu")
	public String doMenuAdd(HttpServletRequest hsr) {
		String name = hsr.getParameter("name");
		int price = Integer.parseInt(hsr.getParameter("price"));

		iEmp menu = sqlSession.getMapper(iEmp.class);
		menu.addMenu(name, price);
		return "addMenu";
	}

	@RequestMapping("/department")
	public String doDpList(Model model) {
		iEmp dpl = sqlSession.getMapper(iEmp.class);// 인터페이스 이름 작성(iEmp)
		ArrayList<Employee> aldpl = dpl.getDpList();
		model.addAttribute("aldpl", aldpl);
		return "department";
	}

	@RequestMapping("/country")
	public String doCntList(Model model) {
		iEmp cnr = sqlSession.getMapper(iEmp.class);// 인터페이스 이름 작성(iEmp)
		ArrayList<iCountry> alcnr = cnr.getCntList();
		model.addAttribute("alcnr", alcnr);
		return "country";
	}

	@RequestMapping("/emp")
	public String doEmpList(Model model) {
		iEmp emp = sqlSession.getMapper(iEmp.class);// 인터페이스 이름 작성(iEmp)
		ArrayList<Employee> alEmp = emp.getEmpList();
		model.addAttribute("alEmp", alEmp);
		return "emp";
	}

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

	@RequestMapping("/menuadd")
	public String menu() {
		return "addMenu";
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
		String jspName = "";
		try {
			int x1 = Integer.parseInt(hsr.getParameter("x1"));
			int x2 = Integer.parseInt(hsr.getParameter("x2"));
			String op = hsr.getParameter("op");
			if (op.equals("+")) {
				model.addAttribute("plus", (x1 + x2));
				jspName = "plus";
			} else if (op.equals("*")) {
				model.addAttribute("multi", (x1 * x2));
				jspName = "multi";
			} else if (op.equals("-")) {
				model.addAttribute("minus", (x1 - x2));
				jspName = "minus";
			} else if (op.equals("/")) {
				model.addAttribute("divide", (x1 / x2));
				jspName = "divide";
			} else {
				model.addAttribute("op2", "연산자 불명");
				jspName = "error";
			}
		} catch (Exception e) {
			model.addAttribute("num", "값 오류");
			jspName = "error";
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
