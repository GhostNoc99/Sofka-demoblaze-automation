package demoblaze.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import demoblaze.ui.ConfirmacionPage;

public class ValidarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that(ConfirmacionPage.MENSAJE)
                        .text()
                        .contains("Thank you for your purchase!")
        );
    }

    public static ValidarCompra exitosa() {
        return new ValidarCompra();
    }
}
