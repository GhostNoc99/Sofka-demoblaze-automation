package demoblaze;

import demoblaze.task.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(SerenityRunner.class)
public class DemoblazeTest {

    Actor user = Actor.named("Usuario");

    @Managed(driver = "chrome")
    WebDriver navegador;

    @Before
    public void setup() {

        // 🔥 ESTE ES EL FIX CLAVE
        WebDriverManager.chromedriver().setup();

        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(navegador));
    }

    @Test
    public void flujoCompra() {

        user.attemptsTo(
                AbrirPagina.demoblaze(),
                AgregarProducto.alCarrito(),
                CompletarCompra.formulario(),
                ValidarCompra.exitosa()
        );
    }
}
