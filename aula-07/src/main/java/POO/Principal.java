package POO;

public class Principal {
    public static void main(String[] args) {
        Contador cont = new Contador(0);
        cont.atribuirValor(10);
        cont.incrementar();
        cont.incrementar();
        System.out.println(cont.getValorAtual());


    }
}
