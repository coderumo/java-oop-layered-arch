package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(double kursData) {
		System.out.println("kurs fiyatı dosyaya loglandı:" + kursData);
		
	}

	@Override
	public void logEgitmen(String egitmenData) {
		System.out.println("eğitmen dosyaya loglandı:" + egitmenData);
		
	}

	@Override
	public void logKategori(String kategoriData) {
		System.out.println("kategori dosyaya loglandı:" + kategoriData);
		
	}

}
