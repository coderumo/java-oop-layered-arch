package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//dao: data access object, jdbc: db erişim yöntemi
public class jdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("jdbc ile veri eklendi");
		
	}

}
 