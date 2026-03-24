package demoblaze.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import demoblaze.ui.CarritoPage;

public class Comprar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CarritoPage.PLACE_ORDER),

                Enter.theValue("Cesar").into(CarritoPage.NAME),
                Enter.theValue("Colombia").into(CarritoPage.COUNTRY),
                Enter.theValue("Bogota").into(CarritoPage.CITY),
                Enter.theValue("123456789").into(CarritoPage.CARD),
                Enter.theValue("03").into(CarritoPage.MONTH),
                Enter.theValue("2026").into(CarritoPage.YEAR),

                Click.on(CarritoPage.PURCHASE)
        );
    }

    public static Comprar finalizar() {
        return new Comprar();
    }
}
