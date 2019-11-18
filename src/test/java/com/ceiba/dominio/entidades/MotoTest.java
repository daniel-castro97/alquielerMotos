package com.ceiba.dominio.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

public class MotoTest {
	@Test
	public void motoValidad() throws ParseException {
		boolean resultadoPruebaMoto = false;
		Moto moto = new MotoTestDataBuilder().build();
		
		
		assertEquals(0, moto.getCilindrada());
	}

}
