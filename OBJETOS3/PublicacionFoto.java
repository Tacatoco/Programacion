package OBJETOS3;

public class PublicacionFoto implements Publicacion, AbrirPublicacion{
    @Override
    public void publicar  () {
        System.out.println("SE ESTÁ PUBLICANDO UNA FOTO");
    }

    @Override
    public void compartir() {
        System.out.println("SE ESTÁ COMPARTIENDO UNA FOTO");
    }


    @Override
    public void abrir() {
        System.out.println("ABRIENDO FOTO");
    }

    @Override
    public void comentar() {
        System.out.println("SE ESTA COMENTANDO UNA FOTO");

    }

    @Override
    public void compartir2() {
        System.out.println("SE ESTA COMPARTIENDO UNA FOTO POR SEGUNDA VEZ");

    }
}
