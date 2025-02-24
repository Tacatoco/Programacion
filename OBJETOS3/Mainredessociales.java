package OBJETOS3;

public class Mainredessociales {
    public static void main(String[] args) {
        PublicacionVideo publivideo = new PublicacionVideo();
        System.out.println("VIDEO");
        publivideo.publicar();
        publivideo.compartir();
        publivideo.abrir();
        publivideo.compartir2();
        publivideo.comentar();
        System.out.println();


        PublicacionFoto publifoto = new PublicacionFoto();
        System.out.println("FOTO");
        publifoto.publicar();
        publifoto.compartir();
        publifoto.abrir();
        publifoto.compartir2();
        publifoto.comentar();
        System.out.println();


        PublicacionTexto publitexto = new PublicacionTexto();
        System.out.println("TEXTO");
        publitexto.publicar();
        publitexto.compartir();
        publitexto.compartir2();
        publitexto.comentar();

        //LA OPCIOND DE ABRIR EN PUBLITEXTO NO APARECE YA QUE NO IMPLEMENTA ABRIR DE ABRIRPUBLI//


    }
}
