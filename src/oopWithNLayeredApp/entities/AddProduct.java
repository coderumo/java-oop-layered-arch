package oopWithNLayeredApp.entities;

import java.util.Scanner;

public class AddProduct {
	public String egitmen;
	public int kursFiyat;
	public String kategori;
	
	Scanner input = new Scanner(System.in);

	
public String getEgitmen() {
		return 	
		egitmen = input.nextLine();
	}



	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}



	public int getKursFiyat() {
		return 	kursFiyat = input.nextInt();

	}



	public void setKursFiyat(int kursFiyat) {
		this.kursFiyat = kursFiyat;
	}



	public String getKategori() {
		return 	kategori = input.nextLine();

	}



	public void setKategori(String kategori) {
		this.kategori = kategori;
	}




}
