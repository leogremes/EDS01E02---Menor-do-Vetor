package view;

import controller.MenorDoVetor;

public class Principal
{

	public static void main(String[] args)
	{
		int[] arr = {3, 2};
		int len = arr.length;
		int menor;
		
		MenorDoVetor mv = new MenorDoVetor();
		menor = mv.acharMenor(arr, len, arr[len - 1]);
		System.out.println(menor);
	}

}
