import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplaHepsi() {
		
		for (int sayi1=-10000; sayi1<10001; sayi1++) {
			for (int sayi2=-10000;sayi2<10001; sayi2++) {
				int gercekSonuc = Hesaplama.topla(sayi1, sayi2);
				assertEquals(sayi1+sayi2, gercekSonuc);
			}
		}
		
	}
	
	
	@Test
	public void testTopla25ve14() {
		int gercekSonuc = Hesaplama.topla(25, 14);
		assertEquals(39, gercekSonuc);
	}
	
	@Test
	public void testToplaNegatif() {
		int gercekSonuc = Hesaplama.topla(-25, -14);
		assertEquals(-39, gercekSonuc);
	}
	@Test
	public void testCarpma() {
		Hesaplama.carpma(6,7);
		int gercekSonuc=Hesaplama.carpma(6,7);
		assertEquals(42,gercekSonuc);
	}
	@Test
	public void testBolme() {
		Hesaplama.bolme(5, 1);
		int gercekSonuc=Hesaplama.bolme(5,1);
		assertEquals(5,gercekSonuc);
	}
}
