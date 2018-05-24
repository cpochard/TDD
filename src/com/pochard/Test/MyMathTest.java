package com.pochard.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pochard.Calculator.MyMaths;

public class MyMathTest {

	@Test
	public void testAdd() {
		MyMaths calc = new MyMaths();
		int a, b, res;
		a = 5;
		b = 5;
		res = a+b;
		assertSame("a et b positifs",calc.add(a, b), res);
		a= -5;
		b=-5;
		res = a+b;
		assertSame ("a et b négatifs", calc.add(a, b), res);
		a=0;
		b=5;
		res=a+b;
		assertSame ("a nul et b positif", calc.add(a, b), res);
		a=5;
		b=0;
		res=a+b;
		assertSame("b nul et a positif", calc.add(a, b), res);
		a=0;
		b=0;
		res=a+b;
		assertSame ("a et b nul", calc.add(a, b), res);
		a=-5;
		b=5;
		res=a+b;
		assertSame ("a négatif et b positif", calc.add(a, b), res);
		a=5;
		b=-5;
		res=a+b;
		assertSame ("b négatif et a positif", calc.add(a, b), res);
		a=-5;
		b=0;
		res=a+b;
		assertSame ("a negatif et b nul", calc.add(a, b), res);
		a=0;
		b=-5;
		res=a+b;
		assertSame ("b negatif et a nul", calc.add(a, b), res);
	}

	@Test
	public void testSubstract() {
		MyMaths calc = new MyMaths();
		int a, b, res;
		a = 5;
		b = 5;
		res = a-b;
		assertSame("a et b positifs",calc.substract(a, b), res);
		a= -5;
		b=-5;
		res = a-b;
		assertSame ("a et b négatifs", calc.substract(a, b), res);
		a=0;
		b=5;
		res=a-b;
		assertSame ("a nul", calc.substract(a, b), res);
		a=5;
		b=0;
		res=a-b;
		assertSame("b nul", calc.substract(a, b), res);
		a=0;
		b=0;
		res=a-b;
		assertSame ("a et b nul", calc.substract(a, b), res);
		a=-5;
		b=5;
		res=a-b;
		assertSame ("a négatif", calc.substract(a, b), res);
		a=5;
		b=-5;
		res=a-b;
		assertSame ("b négatif", calc.substract(a, b), res);
		a=-5;
		b=0;
		res=a-b;
		assertSame ("a negatif et b nul", calc.substract(a, b), res);
		a=0;
		b=-5;
		res=a-b;
		assertSame ("b negatif et a nul", calc.substract(a, b), res);
		}

	@Test
	public void testMultiply() {
		MyMaths calc = new MyMaths();
		int a, b, res;
		a = 5;
		b = 5;
		res = a*b;
		assertSame("a et b positifs",calc.multiply(a, b), res);
		a= -5;
		b=-5;
		res = a*b;
		assertSame ("a et b négatifs", calc.multiply(a, b), res);
		a=0;
		b=5;
		res=a*b;
		assertSame ("a nul", calc.multiply(a, b), res);
		a=5;
		b=0;
		res=a*b;
		assertSame("b nul", calc.multiply(a, b), res);
		a=0;
		b=0;
		res=a*b;
		assertSame ("a et b nul", calc.multiply(a, b), res);
		a=-5;
		b=5;
		res=a*b;
		assertSame ("a négatif", calc.multiply(a, b), res);
		a=5;
		b=-5;
		res=a*b;
		assertSame ("b négatif", calc.multiply(a, b), res);
		a=-5;
		b=0;
		res=a*b;
		assertSame ("a negatif et b nul", calc.multiply(a, b), res);
		a=0;
		b=-5;
		res=a*b;
		assertSame ("b negatif et a nul", calc.multiply(a, b), res);
		}

	@Test (expected = ArithmeticException.class)
	public void testDivide() {
		MyMaths calc = new MyMaths();
		int a, b, res;
		a = 5;
		b = 5;
		res = a/b;
		assertSame("a et b positifs",calc.divide(a, b), res);
		a= -5;
		b=-5;
		res = a/b;
		assertSame ("a et b négatifs", calc.divide(a, b), res);
		a=0;
		b=5;
		res=a/b;
		assertSame ("a nul", calc.divide(a, b), res);
		a=-5;
		b=5;
		res=a/b;
		assertSame ("a négatif", calc.divide(a, b), res);
		a=5;
		b=-5;
		res=a/b;
		assertSame ("b négatif", calc.divide(a, b), res);	
		a=0;
		b=-5;
		res=a/b;
		assertSame ("b negatif et a nul", calc.divide(a, b), res);
		a=5;
		b=0;
		res=a*b;
		assertSame("b nul", calc.divide(a, b), res);
		a=0;
		b=0;
		res=a*b;
		assertSame ("a et b nul", calc.divide(a, b), res);
		a=-5;
		b=0;
		res=a*b;
		assertSame ("a negatif et b nul", calc.divide(a, b), res);
}
}
