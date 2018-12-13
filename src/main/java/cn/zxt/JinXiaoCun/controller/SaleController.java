package cn.zxt.JinXiaoCun.controller;

import cn.zxt.JinXiaoCun.pojo.Sale;
import cn.zxt.JinXiaoCun.pojo.Users;
import cn.zxt.JinXiaoCun.service.SaleService;
import cn.zxt.JinXiaoCun.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    private SaleService service;

    @RequestMapping("/addSales")
    public String addSales( HttpSession session, int productId, double price, int quantity){
        Users users = (Users)session.getAttribute("userSession");
        int userId = users.getId();
        double totalPrice =  price * quantity;
        int result = service.addSale(price,quantity,totalPrice,userId,productId);
        if (result == 1){
            return "findSellInfo";
        }
        return "error";
    }

    @RequestMapping("/findSaleAll")
    public String findSaleAll(HttpSession session,
                              @RequestParam(required = false,defaultValue = "saleDate") String orderByName,
                              @RequestParam(required = false,defaultValue = "1") Integer pageNum,
                              @RequestParam(required = false,defaultValue = "5") Integer pageSize){

        int result = service.findSaleAllCount();
        PageBean pageBean = new PageBean(pageNum,pageSize,result);
        List<Sale> list = service.findSaleAll(orderByName,pageBean);
        pageBean.setList(list);
        session.setAttribute("pageBean",pageBean);
        return "findSellInfo";
    }
}
