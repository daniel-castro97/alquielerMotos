package com.ceiba.dominio.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

public class MotoTest {
	@Test
	public void motoValidad() throws ParseException {
		boolean resultadoPruebaMoto = false;
		Moto moto = new MotoTestDataBuilder().build();
		
		
		assertEquals(160, moto.getCilindrada());
		
	}
	
//	@Test
//	public void validarPlaca() throws ParseException {
//		MotoTestDataBuilder motoTestDataBuilder = new MotoTestDataBuilder();
//		motoTestDataBuilder.withPlaca("abc");
//		//assertThrows(ExcepcionValidadorMoto.class, motoTestDataBuilder.withPlaca("abc"), "");
//	}

}
