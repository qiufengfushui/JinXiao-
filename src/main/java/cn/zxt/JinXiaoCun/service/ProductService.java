package cn.zxt.JinXiaoCun.service;

import cn.zxt.JinXiaoCun.pojo.Product;
import java.util.List;

public interface ProductService {
    List<Product> findProductNameAll();

    int findInventoryCount(int productId);
}
