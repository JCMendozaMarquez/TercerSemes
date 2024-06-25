package Etapa1;

import java.util.Scanner;

public class Ejem1Clas2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  z,n,m,a;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite n: ");
		n=in.nextDouble();
		System.out.println("Digite m: ");
		m=in.nextDouble();
		System.out.println("Digite a: ");
		a=in.nextDouble();
		z=(Sumatoria(n)+a)/(Sumatoria(m));
		System.out.println("El resultado es "+z);
	}
	private static double Sumatoria (double x) {
		
	double s;
	s=0;
	for(int i=1;i<=x;i++) {
   s=s+(i+Math.log10(i));
				
	}
	return s;
	
	}				
}
