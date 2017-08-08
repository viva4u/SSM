package com.viva4u.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.viva4u.pojo.User;
import com.viva4u.service.userService;
import com.viva4u.service.impl.userServiceImpl;

@Controller
public class loginController {
	@Autowired
	userServiceImpl userServiceImpl;
	@RequestMapping("/login")
	public String loginmain() {
		return "main";
	}
	@RequestMapping("/loginSuc")
	public String  loginSuccess(@RequestParam("name") String uname,@RequestParam("password") String pwd,Model model) {
		System.out.println(uname);
		System.out.println(pwd);
		User user = userServiceImpl.getUserByNameService(uname);
		System.out.println("user:"+user);
//		System.out.println("user.name:"+user.getName());
//		System.out.println("user.password:"+user.getPwd());
		if(user!=null) {
			if(pwd.equals(user.getPwd())) {
				model.addAttribute("name", uname);
				return "loginSuc";
			}else {
				model.addAttribute("message", "密码错误！");
			}
		}else {
			model.addAttribute("message", "用户名不存在！");
		}
		return "main";
	}
}
