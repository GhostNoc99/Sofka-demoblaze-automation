package demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target PLACE_ORDER = Target.the("boton place order")
            .located(By.xpath("//button[text()='Place Order']"));

    public static final Target NAME = Target.the("nombre")
            .located(By.id("name"));

    public static final Target COUNTRY = Target.the("pais")
            .located(By.id("country"));

    public static final Target CITY = Target.the("ciudad")
            .located(By.id("city"));

    public static final Target CARD = Target.the("tarjeta")
            .located(By.id("card"));

    public static final Target MONTH = Target.the("mes")
            .located(By.id("month"));

    public static final Target YEAR = Target.the("anio")
            .located(By.id("year"));

    public static final Target PURCHASE = Target.the("boton purchase")
            .located(By.xpath("//button[text()='Purchase']"));
}

