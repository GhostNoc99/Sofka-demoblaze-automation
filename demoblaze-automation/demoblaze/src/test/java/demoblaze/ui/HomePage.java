package demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;
//import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target PRODUCTO_1 =
            Target.the("Producto Samsung")
                    .locatedBy("//a[text()='Samsung galaxy s6']");

    public static final Target PRODUCTO_2 =
            Target.the("Producto Nokia")
                    .locatedBy("//a[text()='Nokia lumia 1520']");

    public static final Target ADD_TO_CART =
            Target.the("Botón agregar")
                    .locatedBy("//a[text()='Add to cart']");

    public static final Target CART =
            Target.the("Carrito")
                    .locatedBy("#cartur");

    public static final Target HOME = Target.the("link home")
            .located(By.id("nava"));

}
