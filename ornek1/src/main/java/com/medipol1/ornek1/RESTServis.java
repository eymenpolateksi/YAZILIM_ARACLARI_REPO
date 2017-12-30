package com.medipol1.ornek1;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RESTServis {
	private static final List<Ogrenci>OGRENCILER=new ArrayList<Ogrenci>();
	@RequestMapping("/ogrenci/olustur")
	public Ogrenci ogrenciOlustur(String ad,String soyad) {
		Ogrenci ogrenci=new Ogrenci(ad,soyad);
		OGRENCILER.add(ogrenci);
		return ogrenci;
	}
	@RequestMapping("ogrenci/listele")
		public List<Ogrenci> ogrenciListele(){
			return OGRENCILER;
		}
	
	public Ogrenci ogrenci(String ad,String soyad) {
		return new Ogrenci(ad,soyad);
	}
}
