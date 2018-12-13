package cn.zxt.JinXiaoCun.service.impl;

import cn.zxt.JinXiaoCun.dao.ProductDao;
import cn.zxt.JinXiaoCun.pojo.Product;
import cn.zxt.JinXiaoCun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findProductNameAll() {
        return productDao.findProductNameAll();
    }

    @Override
    public int findInventoryCount(int productId) {
        return productDao.findInventoryCount(productId);
    }
}
