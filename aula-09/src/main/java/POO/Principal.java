package POO;

public class Principal {
    public static void main(String[] args) {
        Soldado s = new Soldado();
        s.atacar();
        System.out.println(Soldado.getInfantaria());
        s.mover(10);
        System.out.println(s.getPosicao());

        Soldado a = new Soldado();
        Soldado b = new Soldado();
        Soldado c = new Soldado();
        Soldado h = new Soldado();
        Soldado e = new Soldado();
        Soldado f = new Soldado();
        Soldado g = new Soldado();
        Soldado k = new Soldado();
        System.out.println(Soldado.getInfantaria());
        s.atacar();
        Soldado i = new Soldado();
        Soldado j = new Soldado();
        System.out.println(Soldado.getInfantaria());

        s.atacar("canivete");

    }
}
