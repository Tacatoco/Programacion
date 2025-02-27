public class Billete implements IDinero{
   private int valor;

    public Billete(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double valor() {
        return valor;
    }


}
