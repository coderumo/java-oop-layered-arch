package oopWithNLayeredApp.entities;

public class Product {
	
	private String egitmen;
	private String kategori;
	private double kursFiyat;
	
	public Product() {
	}
	
	public Product(String egitmen, String kategori, double kursFiyat) {
		this.egitmen = egitmen;
		this.kategori = kategori;
		this.kursFiyat = kursFiyat;
	}

	public String getEgitmen() {
		return egitmen;
	}

	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public double getKursFiyat() {
		return kursFiyat;
	}

	public void setKurs(double kursFiyat) {
		this.kursFiyat = kursFiyat;
	}
	

}
