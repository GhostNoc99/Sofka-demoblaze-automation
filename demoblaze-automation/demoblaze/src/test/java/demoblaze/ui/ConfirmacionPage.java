package demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmacionPage {

    public static final Target MENSAJE = Target.the("mensaje de confirmacion")
            .located(By.xpath("//h2[text()='Thank you for your purchase!']"));
}
