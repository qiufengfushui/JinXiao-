package cn.zxt.JinXiaoCun.service.impl;

import cn.zxt.JinXiaoCun.dao.SaleDao;
import cn.zxt.JinXiaoCun.pojo.Sale;
import cn.zxt.JinXiaoCun.service.SaleService;
import cn.zxt.JinXiaoCun.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDao saleDao;

    @Override
    public int addSale(double price, int quantity, double totalPrice, int userId, int productId) {
        return saleDao.addSale(price,quantity,totalPrice,userId,productId);
    }

    @Override
    public int findSaleAllCount() {
        return saleDao.findSaleAllCount();
    }

    @Override
    public List<Sale> findSaleAll(String orderByName, PageBean pageBean) {
        return saleDao.findSaleAll(orderByName,pageBean);
    }
}
