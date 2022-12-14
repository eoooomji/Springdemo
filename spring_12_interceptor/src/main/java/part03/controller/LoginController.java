package part03.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import part03.dto.PersonDTO;

@Controller
public class LoginController {
	public LoginController() {

	}

	// http://localhost:8090/myapp/login.do

	@RequestMapping("/login.do")
	public String loginProcess() {
		return "part03/loginForm";
	}

	@RequestMapping("/logpro.do")
	public String loginExecution(String returnUrl, PersonDTO dto, HttpSession session) {
		if (dto.getId().equals("kim") && dto.getPass().equals("1234")) {
			session.setAttribute("chk", dto.getId());
			session.setMaxInactiveInterval(1000 * 60 * 30); // 30분
			System.out.println(session.getAttribute("chk"));
			if(returnUrl != "") {
				return "redirect:/" + returnUrl;
			}
		}
		return "redirect:/index.do";
	}

	@RequestMapping("/logout.do")
	public String logoutExecution(HttpSession session) {
		session.removeAttribute("chk");
		return "redirect:/index.do";
	}
}
