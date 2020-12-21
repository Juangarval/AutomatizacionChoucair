package com.choucairtesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucairtesting.userinterface.SeccionDeEmpleosPage.*;

public class Buscar implements Task {

    String palabraClave;
    String ciudad;

    public Buscar(String palabraClave, String ciudad) {
        this.palabraClave = palabraClave;
        this.ciudad = ciudad;
    }

    public static Buscar empleosDisponibles(String palabraClave, String ciudad){
        return Tasks.instrumented(Buscar.class, palabraClave, ciudad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(palabraClave).into(CAMPO_KEYWORDS),
                Enter.theValue(ciudad).into(CAMPO_LOCATION),
                Click.on(BTN_BUSCAR_EMPLEOS));
    }
}
