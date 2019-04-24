public class Main{
	public static void main(String[] args) {
	    int array[] = {1,2,3,5,6,7,10,12};
	    int elemento = 3;
	    int resultado = buscaBinariaRecursiva(array, elemento);
	    if(resultado < 0){
	        System.err.println("Elemento nao encontrado");
	    }
	    else{
	        System.out.println("Elemento encontrado na posicao "+resultado);
	    }
	}
	
	public static int buscaBinariaRecursiva(int [] array, int elemento){
	    return buscaRecursiva(array, elemento, 0, array.length-1);
	}
	
	public static int buscaRecursiva(int [] array, int elemento, int menor, int maior){
	    int media = (menor+maior)/2;
	    if(menor>maior){
	        return -1;
	    }
	    if(array[media] == elemento){
	        return media;
	    }
	    if(array[media] < elemento){
	        return buscaRecursiva(array, elemento, media+1, maior);
	    }
	    else{
	        return buscaRecursiva(array, elemento, menor, media-1);
	    }
	}
}
