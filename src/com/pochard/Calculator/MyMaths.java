package com.pochard.Calculator;

public class MyMaths {
	
	public static int add (int a,int b) {
		int resultat = a;
		if(b>=0) {
			for(int i = 1;i<=b;i++)
				resultat++;
		}
		else {
			for(int i = -1;i>=b;i--)
				resultat--;
		}
		return resultat;
	}

	public static int substract(int a,int b) {
		return add(a,-b);
	}
	
	public static int multiply(int a,int b) {
		int resultat = 0;
		boolean bNegatif = false;
		if(a < 0 && b < 0) {
			a = -a;
			b = -b;
		}
		if(b < 0) {
			b = -b;
			bNegatif = true;
		}
		for(int i = 1;i<=b;i++) {
			resultat = add(resultat,a);
		}
		if(bNegatif) {
			resultat = -resultat;
		}
		return resultat;
	}	

	public static int divide(int a,int b) 
	throws ArithmeticException {
		int resultat = 0;
		boolean inversionResultat = false;
		if(a < 0 && b < 0) {
			a = -a;
			b = -b;
		}
		if(a < 0 || b < 0) {
			if(a < 0) {
				a = -a;
			}
			if(b < 0) {
				b = -b;
			}
			inversionResultat = true;
		}
		if (b==0) {
			throw new ArithmeticException();
			}
		int valeurIntermediaire = a;
		while(valeurIntermediaire >= b) {
			valeurIntermediaire = substract(valeurIntermediaire,b);
			resultat++;
		}
		if(inversionResultat) {
			resultat = -resultat;
		}
		return resultat;
	}
}
