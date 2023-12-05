package oopWithNLayeredApp.business;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.entities.AddProduct;
import oopWithNLayeredApp.entities.Product;

public class ProductManager{
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}



	public void add(Product product1)  {
		//iş kuralları
		if(product1.getKursFiyat()<0) { //buraya sorgu atıcam eğitmen ve kategori tekrarı olmaması için
			System.out.println("kurs fiyatı 0 tlden küçük olamaz");
		
		}
		//productDao.add(product);//db
		
		for (Logger logger : loggers) {//[db, file]
			logger.log(product1.getKursFiyat());
			logger.logEgitmen(product1.getEgitmen());
			logger.logKategori(product1.getKategori());
		}
	}

}
