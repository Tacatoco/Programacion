package OBJETOS3;

public class PublicacionTexto implements Publicacion{

    @Override
    public void publicar(){
        System.out.println("SE ESTÁ PUBLICANDO UN TEXTO");
    }

    @Override
    public void compartir() {
        System.out.println("SE ESTÁ COMPARTIENDO UN TEXTO");
    }


    @Override
    public void comentar() {
        System.out.println("SE ESTA COMENTANDO UN TEXTO");
    }

    @Override
    public void compartir2() {
        System.out.println("SE ESTA COMPARTIENDO UN TEXTO POR SEGUNDA VEZ");
    }
}
