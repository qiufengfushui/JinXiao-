package cn.zxt.JinXiaoCun.service;

import cn.zxt.JinXiaoCun.pojo.Sale;
import cn.zxt.JinXiaoCun.util.PageBean;

import java.util.List;

public interface SaleService {

    int addSale(double price, int quantity, double totalPrice, int userId, int productId);

    int findSaleAllCount();

    List<Sale> findSaleAll(String orderByName, PageBean pageBean);
}
