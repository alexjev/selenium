package selenapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Execute before class...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Execute after class...");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Execute before...");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Execute after...");
	}

	@Test
	void test1() {
		System.out.println("Execute Test1...");
	}
	
	@Test
	void test2() {
		System.out.println("Execute Test2...");
	}


}
