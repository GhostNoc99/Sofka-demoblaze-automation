package demoblaze.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import demoblaze.ui.CheckoutPage;

public class CompletarCompra implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CheckoutPage.PLACE_ORDER),

                Enter.theValue("Cesar").into(CheckoutPage.NAME),
                Enter.theValue("Colombia").into(CheckoutPage.COUNTRY),
                Enter.theValue("Bogota").into(CheckoutPage.CITY),
                Enter.theValue("123456789").into(CheckoutPage.CARD),
                Enter.theValue("03").into(CheckoutPage.MONTH),
                Enter.theValue("2026").into(CheckoutPage.YEAR),

                Click.on(CheckoutPage.PURCHASE)
        );
    }

    public static CompletarCompra formulario() {
        return new CompletarCompra();
    }
}
