package cn.zxt.JinXiaoCun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DispatcherController {

    @RequestMapping("/addSell")
    public String addSell(){
        return "addSell";
    }
    @RequestMapping("/findSellInfo")
    public String findSellInfo(){
        return "findSellInfo";
    }
    @RequestMapping("/findInventory")
    public String findInventory(){
        return "findInventory";
    }
    @RequestMapping("/500")
    public String ServerException(){
        return "errors/serverException";
    }

    @RequestMapping("/404")
    public String NullException(){
        return "errors/nullException";
    }

    @RequestMapping("/loginException")
    public String loginException(){
        return "errors/loginException";
    }
}
