package cn.zxt.JinXiaoCun.dao;

import cn.zxt.JinXiaoCun.pojo.Sale;
import cn.zxt.JinXiaoCun.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleDao {

    int addSale(@Param("price") double price, @Param("quantity") int quantity, @Param("totalPrice") double totalPrice, @Param("userId") int userId, @Param("productId") int productId);

    int findSaleAllCount();

    List<Sale> findSaleAll(@Param("orderByName") String orderByName, @Param("pageBean") PageBean pageBean);
}
