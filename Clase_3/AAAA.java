package Clase_3;

import java.util.Scanner;

public class AAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		double Z,Y,X;
		//Y=  2 meses de 30 diaz---60*0,2=12% 
		//Y=Z
		Y=30;
		Z=0.2;
		 Scanner in= new Scanner (System.in);
		 
		 System.out.print("Int N: ");
	     N=in.nextInt();
		 System.out.print("Int X: ");
	     X=in.nextInt();
	     for(int i=1;i<=N;i++) {
	    	Y=Y*2;
	    	Z=Y*Z;
	         X=(X%Z)*0.30; 
	     }
	      System.out.print("El costo despues de 2 meses es :"+X);
	}

}
