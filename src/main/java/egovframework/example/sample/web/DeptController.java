package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {
	
	
	@RequestMapping("/deptWrite.do")
	public String deptWrite() {
		
		return "dept/deptWrite";
	}
	@RequestMapping("/deptWriteSave.do")
	public String deptWriteSave(String deptno,String deptnm, String deptloc) {
		
		
		System.out.println("부서번호 : "+deptno);
		System.out.println("부서이름 : "+deptnm);
		System.out.println("부서위치 : "+deptloc);
		
		return "";
	}
	


	
}
