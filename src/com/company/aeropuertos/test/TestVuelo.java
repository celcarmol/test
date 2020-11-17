package com.company.aeropuertos.test;

import com.company.aeropuertos.PersonaImpl;
import com.company.aeropuertos.Vuelo;
import com.company.aeropuertos.VueloImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


public class TestVuelo {

	public static void main(String[] args) {
		// TODO
	}
	
	private static void muestraPasajerosSoloEnPrimerVuelo(Vuelo v1, Vuelo v2) {
		// TODO
	}

	private static void muestraPasajerosComunes(Vuelo v1, Vuelo v2) {
		// TODO		
	}

	private static void muestraPasajerosEnCualquierVuelo(Vuelo v1, Vuelo v2) {
		// TODO
	}

	private static Vuelo creaVuelo1(){
		Vuelo res = new VueloImpl("IB1234","Sevilla","Madrid",LocalDateTime.of(2016, 12, 20,12,0),LocalDateTime.of(2016, 12, 20,13,35),120);

		return res;
	}


	private static Vuelo creaVuelo2(){
		Vuelo res = new VueloImpl("IB3536","Madrid","Barcelona",LocalDateTime.of(2016, 12, 20,15,0),LocalDateTime.of(2016, 12, 20,17,5),120);

		return res;
	}
}
