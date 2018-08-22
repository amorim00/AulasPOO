package POO;

public class Principal {
    public static void main(String[] args) {
        Tempo t = new Tempo(10,20,30);
        System.out.println(t.toString());
        System.out.println(t.setHora(15));

        System.out.println(t.gerarSegundos());
    }
}
