package com.jpaEx.repo.impl;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.jpaEx.model.Product;
import com.jpaEx.repo.ProductRepo;

@Component
public class BasicOperation implements CommandLineRunner {
	@Autowired
	private ProductRepo repo;
	
	public void run(String...args) throws Exception {
		//insert operation
		/*1.***************SAVE****************/
		repo.save(new Product("Pen",6.8,"Blue"));
		repo.save(new Product("Mobile",50000.90,"Black"));
		repo.save(new Product("LapTop",75000.00,"Grey"));
		
		//2 find operations
		Optional <Product> p = repo.findById(5);
		if(p.isPresent())
		{
			System.out.println(p.get());
		}
		else {
			System.out.println("No Data foound");
		}
		//see all the rows of the table.
		repo.findAll().forEach((System.out::println));
	}

}