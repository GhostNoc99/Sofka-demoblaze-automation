package demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {

    public static final Target PLACE_ORDER =
            Target.the("Botón place order")
                    .locatedBy("//button[text()='Place Order']");

    public static final Target NAME =
            Target.the("Nombre")
                    .locatedBy("#name");

    public static final Target COUNTRY =
            Target.the("País")
                    .locatedBy("#country");

    public static final Target CITY =
            Target.the("Ciudad")
                    .locatedBy("#city");

    public static final Target CARD =
            Target.the("Tarjeta")
                    .locatedBy("#card");

    public static final Target MONTH =
            Target.the("Mes")
                    .locatedBy("#month");

    public static final Target YEAR =
            Target.the("Año")
                    .locatedBy("#year");

    public static final Target PURCHASE =
            Target.the("Comprar")
                    .locatedBy("//button[text()='Purchase']");
}
