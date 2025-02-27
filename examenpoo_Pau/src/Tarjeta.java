public class Tarjeta implements IDinero{
    private String numero;
    private double saldo, credito;


    public Tarjeta(String numero, double saldo, double credito) {
        this.numero = numero;
        this.saldo = saldo;
        this.credito = credito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }




    @Override
    public double valor() {
        return (saldo+credito);
    }


}
