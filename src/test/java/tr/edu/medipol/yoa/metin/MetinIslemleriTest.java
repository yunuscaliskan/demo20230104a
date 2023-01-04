package tr.edu.medipol.yoa.metin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemleriTest {

	@Test
	public void testBosluklariTemizle() {
		// GIVEN - On hazirliklar
		String orjinalMetin = "Uc tas hos     ho saf  . . .";

		// WHEN - Asil testi gerceklestirir
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);

		// THEN - Kontroller
		assertEquals("Uctashoshosaf...", sonuc);

	}
	@Test
	public void testBosluklariTemizle2() {
		// GIVEN - On hazirliklar
		String orjinalMetin = "Merhaba arkadaslar";

		// WHEN - Asil testi gerceklestirir
		String sonuc = MetinIslemleri.bosluklariTemizle(orjinalMetin);

		// THEN - Kontroller
		assertEquals("Merhabaarkadaslar", sonuc);

	}

}
