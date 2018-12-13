package cn.zxt.JinXiaoCun.controller;

import cn.zxt.JinXiaoCun.pojo.Product;
import cn.zxt.JinXiaoCun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @ResponseBody
    @RequestMapping("/findProductNameAll")
    public Object findProductNameAll(){
        List<Product> list = service.findProductNameAll();
        return list;
    }

    @RequestMapping("/findInventoryCount")
    public ModelAndView findInventoryCount(ModelAndView mv, int productId){
        int result = service.findInventoryCount(productId);
        mv.setViewName("findInventory");
        mv.addObject("count",result);
        return mv;
    }
}
