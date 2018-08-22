package POO;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 00;
        this.minuto = 00;
        this.segundo = 00;
    }

    public Tempo(int hora) {
        if(hora<=24) {
            this.hora = hora;
        }else this.hora = 00;
        this.minuto = 00;
        this.segundo = 00;
    }

    public Tempo(int minuto, int segundo) {
        this.hora = 00;
        if(minuto<=60) {
            this.minuto = minuto;
        }else{
            this.minuto = 00;
            this.segundo = 00;
        }
        if(segundo<=60) {
            this.segundo = segundo;
        }else{
            this.minuto = 00;
            this.segundo = 00;
        }
    }

    public Tempo(int hora, int minuto, int segundo) {
        if(hora<=24) {
            this.hora = hora;
        }else{
            this.hora = 00;
            this.minuto = 00;
            this.segundo = 00;
        }
        if(minuto<=60) {
            this.minuto = minuto;
        }else{
            this.hora = 00;
            this.minuto = 00;
            this.segundo = 00;
        }
        if(segundo<=60) {
            this.segundo = segundo;
        }else{
            this.hora = 00;
            this.minuto = 00;
            this.segundo = 00;
        }
    }

    public boolean setHora(int hora) {
        if((hora+this.hora)<=24) {
            this.hora += hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if((this.minuto+minuto)<=60) {
            this.minuto += minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if((this.segundo+segundo)<=60) {
            this.segundo += segundo;
            return true;
        }
        return false;
    }

    public String toString(){
       String s = hora+":"+minuto+":"+segundo;
        return s;
    }

    public long gerarSegundos(){
        long a;
        a=this.hora*60*60;
        a= a+ this.minuto*60;
        a=a+ this.segundo;
        return a;
    }
}
