package com.choucairtesting.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucairtesting.userinterface.HomePage.BTN_EMPLEOS;

public class Abrir implements Task {


    public static Abrir laOpcionEmpleos(){
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_EMPLEOS));
    }
}
