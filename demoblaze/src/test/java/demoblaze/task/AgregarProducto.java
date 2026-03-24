package demoblaze.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import demoblaze.ui.HomePage;

public class AgregarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        // 🟢 PRODUCTO 1
        actor.attemptsTo(
                Click.on(HomePage.PRODUCTO_1),
                Click.on(HomePage.ADD_TO_CART)
        );

        aceptarAlerta(driver);

        // 🔙 Volver al home
        actor.attemptsTo(
                Click.on(HomePage.HOME)
        );

        // 🟢 PRODUCTO 2
        actor.attemptsTo(
                Click.on(HomePage.PRODUCTO_2),
                Click.on(HomePage.ADD_TO_CART)
        );

        aceptarAlerta(driver);

        // 🛒 Ir al carrito (AL FINAL)
        actor.attemptsTo(
                Click.on(HomePage.CART)
        );
    }

    private void aceptarAlerta(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Mensaje alert: " + alert.getText());
        alert.accept();
    }

    public static AgregarProducto alCarrito() {
        return new AgregarProducto();
    }
}
