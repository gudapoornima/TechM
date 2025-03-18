package com.jpaEx.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jpaEx.model.Product;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
	interface myView {
		//copy from getter methods
		String getVendorCode();
		String getProdName();
		Double getProdCost();
	}
	//select code,cost from prodtab where ven_code=?
	List<myView>findByVendorCode(String vc);

}
