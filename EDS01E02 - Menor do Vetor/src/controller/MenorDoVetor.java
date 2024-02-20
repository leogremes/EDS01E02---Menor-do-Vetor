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
		 	CONDIÇÃO DE PARADA
		 	Quando restar apenas a última posição
		 	
		 	CHAMADA DE PASSOS
		 	Chamar a função com o tamanho 1 posição menor
		 */
		
		if (len == 0) return menor;
		return acharMenor(arr, len, menor);
	}
}
