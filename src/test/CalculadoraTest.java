package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import okg.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("inicio todo");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Fin todo");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("inicio uno");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin uno");
	}

	@Test
	void testSuma() {
		int a=2;
		int b=3;
		int resultado=a+b;
		int resCalculadora = Calculadora.suma(a, b);
		assertEquals(resultado,resCalculadora);
	}

	@Test
	void testResta() {
		int a=2;
		int b=3;
		int resultado=a-b;
		int resCalculadora = Calculadora.resta(a, b);
		assertEquals(resultado,resCalculadora);
	}

	@Test
	void testMultiplica() {
		int a=2;
		int b=3;
		int resultado=a*b;
		int resCalculadora = Calculadora.multiplica(a, b);
		assertEquals(resultado,resCalculadora);
	}

	@Test
	void testDivide() {
		int a=4;
		int b=2;
		int resultado=a/b;
		int resCalculadora = Calculadora.divide(a, b);
		assertEquals(resultado,resCalculadora);
	}
	@Test
	void testDivideCero() {
		int resultado=-1;
		int resCalculadora = Calculadora.divide(1, 0);
		assertEquals(resultado,resCalculadora);
	}

}
