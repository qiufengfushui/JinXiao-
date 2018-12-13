package cn.zxt.JinXiaoCun.dao;

import cn.zxt.JinXiaoCun.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    List<Product> findProductNameAll();

    int findInventoryCount(@Param("productId") int productId);
}
