package com.javatpoint;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController 
{
	@Autowired
	private ProductService productService;
	
	
	@GetMapping(value = "/product")
	public List<Product> getProduct() 
	{
		
		List<Product> products = productService.findAll();
		return products;
}
	
	
	@PostMapping(value="/insert product")
	public List<Product> addProduct(@RequestBody Product prod)
	{
		return productService.save(prod);
	}
	
	@PostMapping(value="/insert productlist")
	public List<Product> addProduct(@RequestBody List<Product> prod)
	{
		return productService.savelist(prod);
	}
	
	@PutMapping(value="/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

	@DeleteMapping("/delete/{id}")
    public ArrayList<Product> deleteProduct(@PathVariable("id") int id) {
        return productService.deleteProduct(id);
    }
	
	
	@GetMapping(value = "/productById/{id}")
	public Product FindById( @PathVariable("id") int id)
	{
		
		Product products = productService.FindById(id);
		return products;
}
	
	
}
