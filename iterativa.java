public class Main{
	public static void main(String[] args) {
		int S[] = {1,6,7,12,15,20,22,25,26,27,31,37,39,44,49,56,58,60,64,67,69,74,77,79,80};
		
		int indice = binaria(S, 80);
		
		System.out.println(indice);
	}
	
	private static int binaria(int[] s, int x){
	    int meio, inicio=0, fim = s.length-1;
	    
	    while(inicio <= fim){
	        meio = (inicio+fim)/2;
	        if(s[meio] == x)
	            return meio;
	        else if(s[meio] < x) inicio = meio+1;
	        else if(s[meio] > x) fim = meio-1;
	    }
	    return -1;
	}
}
