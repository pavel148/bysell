package com.example.bysell.services;

import com.example.bysell.moduls.Product;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;
    {
        products.add(new Product(++ID,"PlayStation 5", "Simple",67000,"Pechora","Sam"));
        products.add(new Product(++ID,"Iphone 8", "Simple",24000,"Moscow","Nik"));

    }
    public  List<Product> list(){return products;}

    public void saveProduct(Product product){

        product.setId(++ID);
        
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(products->products.getId().equals(id));
    }
}
