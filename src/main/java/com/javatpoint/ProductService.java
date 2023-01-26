package com.javatpoint;
import java.util.ArrayList;
import java.util.List;


public interface ProductService 
{
List<Product> findAll();

List<Product> save(Product prod);

List<Product> savelist(List<Product> prod);

Product updateProduct(Product prod);

//Product updateProduct(Product prod);



//Product deleteProduct(int id);

ArrayList<Product> deleteProduct(int id);

Product FindById(int id);
}
