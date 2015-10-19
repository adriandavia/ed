package org.institutoserpis.ed;

public class Array {
	public static void main (String [] args){
		int[] v = new int[]{64, 9, 7, 12, 21};
		for (int index=0; index < 5; index++)
			System.out.println ("elemento con index: "+index+"vale"+v[index]);
		System.out.println ("suma del array= "+suma(v));
		System.out.println ("el valor menor en v: " +menor(v));
	}
	private static int suma(int[] v){ // numero de elementos del vector: v.legth
		int suma;
		suma = 0;
		for (int index=0; index < v.length; index++)
			suma = suma + v[index];
		return suma;
	}
	private static int menor(int[] v){
		int menor;
		menor = v[0];
		for(int numero=0; numero<=v[]; numero++)
			menor = numero;
		return menor;
	}
}

	