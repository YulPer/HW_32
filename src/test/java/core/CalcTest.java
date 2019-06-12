package core;

import static org.junit.Assert.*; import org.junit.*;

public class CalcTest {

	static double divide(double a, double b) {return a / b;}
	static double divide(double a, double b, double c) {return a / b / c;}
	static double divide(double a, double b, double c, double d) {return a / b / c / d;}
	static double divide(double a, double b, double c, double d, double e) {return a / b / c / d / e;}
	static double divide(double a, double b, double c, double d, double e, double f) {return a / b / c / d / e / f;}
	
	static double add(double a, double b) {return a + b;}
	static double add(double a, double b, double c) {return a + b + c;}
	static double add(double a, double b, double c, double d) {return a + b + c + d;}
	static double add(double a, double b, double c, double d, double e) {return a + b + c + d + e;}
	static double add(double a, double b, double c, double d, double e, double f) {return a + b + c + d + e + f;}
	
	static double subtract(double a, double b) {return a - b;}
	static double subtract(double a, double b, double c) {return a - b - c;}
	static double subtract(double a, double b, double c, double d) {return a - b - c - d;}
	static double subtract(double a, double b, double c, double d, double e) {return a - b - c - d - e;}
	static double subtract(double a, double b, double c, double d, double e, double f) {return a - b - c - d - e - f;}
	
	static double multiply(double a, double b) {return a * b;}
	static double multiply(double a, double b, double c) {return a * b * c;}
	static double multiply(double a, double b, double c, double d) {return a * b * c * d;}
	static double multiply(double a, double b, double c, double d, double e) {return a * b * c * d * e;}
	static double multiply(double a, double b, double c, double d, double e, double f) {return a * b * c * d * e * f;}
	
	
	@Test // @Ignore
	public void test_01() {assertEquals("Not correct", divide(90.0, 7.0), 12.9, 0.09);} 
	@Test // @Ignore
	public void test_02() {assertEquals("Not correct", add(60.0, 5.0, 7.0), 72.0, 0.09);} 
	@Test // @Ignore
	public void test_03() {assertEquals("Not correct", subtract(100.0, 22.0), 78.0, 0.09);} 
	@Test // @Ignore
	public void test_04() {assertEquals("Not correct", multiply(9.0, 5.0, 2.0), 90.0, 0.09);} 
	@Test // @Ignore
	public void test_05() {assertEquals("Not correct", divide(90.0, 10.0, 3.0, 1.0), 3.0, 0.09);} 
	@Test // @Ignore
	public void test_06() {assertEquals("Not correct", add(6.0, 50.0, 70.0, 4.0), 130.0, 0.09);} 
	@Test // @Ignore
	public void test_07() {assertEquals("Not correct", subtract(100.0, 22.0, 8.0, 5.0), 65.0, 0.09);} 
	@Test // @Ignore
	public void test_08() {assertEquals("Not correct", multiply(9.0, 5.0, 2.0, 2.0), 180.0, 0.09);} 
	@Test // @Ignore
	public void test_09() {assertEquals("Not correct", divide(90.0, 9.0, 5.0, 2.0, 2.0), 0.5, 0.09);} 
	@Test // @Ignore
	public void test_10() {assertEquals("Not correct", add(6.0, 5.0, 7.0, 2.0, 80.0), 100.0, 0.09);} 
	@Test // @Ignore
	public void test_11() {assertEquals("Not correct", subtract(100.0, 22.0, 50.0, 8.0, 10.0), 10.0, 0.09);} 
	@Test // @Ignore
	public void test_12() {assertEquals("Not correct", multiply(2.0, 5.0, 2.0, 2.0, 10.0), 400.0, 0.09);} 
	
	}
