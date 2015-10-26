package org.institutoserpis.ed;

public class Array {
	public static void main (String [] args){
		int[] v = new int[]{3, 9, 7, 11, 21};
		for (int index=0; index < 5; index++)
			System.out.println ("elemento con index: "+index+"vale"+v[index]);
		System.out.println ("suma del array= "+suma(v));
		System.out.println ("el valor menor en v: " +menor(v));
	}
	public static int suma(int[] v){ // numero de elementos del vector: v.legth
		int suma;
		suma = 0;
		for (int item : v)
			suma = suma + item;
		return suma;
	}
	
	public static int menor(int[] v){
		int menor;
		menor = v[0];
		for(int index=0; index<=v.length; index++)
			if (v[index]<menor)
				menor = v[index];
		return menor;
		}
	
	public static int indexOf(int[] v, int item){
		int index = 0;
		while (index <v.length && v[index]!=item)
			index++;
		if (index == v.length)
			return -1;
		return index;
	}
}

	