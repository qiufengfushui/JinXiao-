package cn.zxt.JinXiaoCun.controller;

import cn.zxt.JinXiaoCun.pojo.Users;
import cn.zxt.JinXiaoCun.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/login.do")
    public String login( HttpServletRequest request,HttpSession session,Users users){
        users = usersService.login(users);
        if (null == users){
            //登录失败
            request.setAttribute("error","登录失败");
            return "redirect:../login.jsp";
        }else{
            //登录成功
            session.setAttribute("userSession",users);
            return "index";
        }
    }

    @RequestMapping("/exit.do")
    public String exit( HttpSession session){
        session.invalidate();
        return "redirect:../login.jsp";
    }

}
