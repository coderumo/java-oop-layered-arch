package oopWithNLayeredApp.core.logging;

public class DataBaseLogger implements Logger{

	@Override
	public void log(double kursData) {
		System.out.println("kurs fiyatı veritabanına loglandı:" + kursData);		
	}

	@Override
	public void logEgitmen(String egitmenData) {
		System.out.println("eğitmen veritabanına loglandı:" + egitmenData);		
		
	}

	@Override
	public void logKategori(String kategoriData) {
		System.out.println("kategori veritabanına loglandı:" + kategoriData);		
		
	}
	

}
