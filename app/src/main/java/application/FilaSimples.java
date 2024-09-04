package application;

public class FilaSimples {

    private Integer[] elementos;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaSimples(int capacidade){
        this.capacidade = capacidade;
        elementos = new Integer[capacidade];
        inicio = 0;
        fim = -1;
        tamanho=0;
    }
    //aumenta a fila / enfileire
    public void enqueue(Integer elemento){
        if (tamanho==capacidade){
            throw new IllegalStateException(
                "A fila está cheia"
            );
        }
        fim = (fim+1);
        elementos[fim] = elemento;
        tamanho++;
    }
    //diminui a fila / desinfileire
    public Integer dequeue(){
        if (tamanho == 0) {
            throw new IllegalStateException(
                "A fila está vazia"
            );
        }
        int elementoRemovido = elementos[inicio];
        inicio +=1;
        tamanho--;

        return elementoRemovido;
    }
    
}
