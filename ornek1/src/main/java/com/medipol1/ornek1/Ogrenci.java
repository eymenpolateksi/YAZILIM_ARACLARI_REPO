package com.medipol1.ornek1;

public class Ogrenci {
	private int id;
	private static int COUNT=1;
	public String ad;
	public String soyad;
	public Ogrenci(String ad,String soyad) {
		super();
		this.id=++COUNT;
		this.ad=ad;
		this.soyad=soyad;
			
	}
	public String getAd() {return ad;}
	public String getSoyad() {return soyad;}
}
