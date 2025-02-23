package OBJETOS3;

public class PublicacionVideo implements Publicacion, AbrirPublicacion{
    @Override
    public void publicar() {
        System.out.println("SE ESTÁ PUBLICANDO UN VIDEO...");
    }

    @Override
    public void compartir() {
        System.out.println("SE ESTÁ COMPARTIENDO UN VIDEO");
    }

    @Override
    public void abrir() {
        System.out.println("ABRIENDO VIDEO");
    }


    @Override
    public void comentar() {
        System.out.println("SE ESTA COMENTANDO UN VIDEO");

    }

    @Override
    public void compartir2() {
        System.out.println("SE ESTA COMPARTIENDO UN VIDEO POR SEGUNDA VEZ");

    }
}
