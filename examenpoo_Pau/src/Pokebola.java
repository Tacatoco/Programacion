public class Pokebola extends Articulo{
    String tipopokebola;

    public Pokebola(String nombre, boolean gratis) {
        super(nombre, gratis);
    }

    public Pokebola(String nombre, boolean gratis, String tipopokebola) {
        super(nombre, gratis);
        this.tipopokebola = tipopokebola;
    }

    public String getTipopokebola() {
        return tipopokebola;
    }

    public void setTipopokebola(String tipopokebola) {
        this.tipopokebola = tipopokebola;
    }
}
