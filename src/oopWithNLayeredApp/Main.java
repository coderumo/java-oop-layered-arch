package oopWithNLayeredApp;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DataBaseLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("KODLAMA.IO ANASAYFA SIMULASYONUU");
		Scanner input = new Scanner(System.in);
		System.out.println("Eğitmen adı giriniz: ");
		
		Product product1 = new Product("Engin Demiroğ", " Yazılım ",1);
		Logger[] loggers = {new DataBaseLogger()};
 		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
		}

}
