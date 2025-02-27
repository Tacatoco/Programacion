import java.awt.*;
import java.util.ArrayList;

public class Tragaperras {
    Billete billete1 = new Billete(10);
    Billete billete2 = new Billete(20);
    Billete billete3 = new Billete(50);
    Tarjeta tarjeta1 = new Tarjeta("1234556", 100, 400);
    Tarjeta tarjeta2 = new Tarjeta("654321", 200, 300);

    Cartera cartera = new Cartera(billete1, billete2, billete3, tarjeta1, tarjeta2);

}
