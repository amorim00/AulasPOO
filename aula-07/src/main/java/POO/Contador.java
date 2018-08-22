package POO;

public class Contador {

    private int valorAtual;

    public Contador(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void atribuirValor(int valor){
        this.valorAtual=valor;
    }
    public  void incrementar(){
        this.valorAtual+=1;
    }

    public int getValorAtual() {
        return valorAtual;
    }
}
