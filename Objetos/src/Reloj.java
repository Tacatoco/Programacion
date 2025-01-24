import javax.print.DocFlavor;

public class Reloj {
    private int hora;
    private int minutos;
    private int segundos;
    private int formato;

    public Reloj() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.formato = 0;
    }

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24){
            this.hora = hora;}
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59){
            this.minutos = minutos;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59){
            this.segundos = segundos;
        }
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        if (formato == 12 && hora > 12){
            hora = hora - 12;
        }
    }

    public String mostrarreloj(){
        if (formato == 12 && hora > 12){
            this.hora = hora - 12;
        }
        String horafinal = this.hora + ":" + this.minutos + ":" + this.segundos;

        return horafinal;
    }

   public String toString(){
       if (formato == 12 && hora > 12){
           this.hora = hora - 12;
       }
        String horafinal = this.hora + ":" + this.minutos + ":" + this.segundos;

        return horafinal;
    }

}
