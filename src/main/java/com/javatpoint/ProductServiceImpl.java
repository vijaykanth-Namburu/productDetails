package com.javatpoint;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService  
{
	ArrayList<Product> products = new ArrayList<Product>();
	@Override
	public List<Product> findAll()
	{
		//returns a list of product
		return products;
}

	@Override
	public List<Product> save(Product prod) {
		//products.remove(prod);
		deleteProduct(prod.getId());
		products.add(prod);
		return products;
	}

	@Override
	public List<Product> savelist(List<Product> prod) {
		products.addAll(prod);
		return products;
	}

	public Product updateProduct(Product product) {
		
		for(Product item:products) {
			
			if(item.getId() == (product.getId())){
				//products.remove(item);
				//products.add(product);
				products.set(products.indexOf(item),product);
			
			}
		}
		return product;
		
	}
		
		

	@Override
	public  ArrayList<Product> deleteProduct(int id) {
		products.removeIf(p->p.getId()== id);

		return products;
	}

	@Override
	public Product FindById(int id) {
		for(Product item:products) {
			
			if(item.getId() == id) {
				//products.remove(item);
				//products.add(product);
				//products.se(products.indexOf(item),product);
				return item;
			}
		}
		return null;
		
	}
}

	

