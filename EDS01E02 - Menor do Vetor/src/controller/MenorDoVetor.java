package controller;

public class MenorDoVetor
{
	public MenorDoVetor() {
		super();
	}
	
	public int acharMenor(int[] arr, int len, int menor)
	{
		if (arr[--len] < menor)
			menor = arr[len];
		/*
		 	CONDI��O DE PARADA
		 	Quando restar apenas a �ltima posi��o
		 	
		 	CHAMADA DE PASSOS
		 	Chamar a fun��o com o tamanho 1 posi��o menor
		 */
		
		if (len == 0) return menor;
		return acharMenor(arr, len, menor);
	}
}
