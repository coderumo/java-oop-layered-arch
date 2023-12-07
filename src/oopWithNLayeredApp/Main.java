package oopWithNLayeredApp;
import java.util.Scanner;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DataBaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("KODLAMA.IO ANASAYFA SIMULASYONUU");
		Product product1 = new Product();
		Logger[] loggers = {new DataBaseLogger()};
		Scanner scanner = new Scanner(System.in);
 		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers, scanner);
		productManager.add(product1);
		}

}
