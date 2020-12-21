package com.choucairtesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.choucairtesting.userinterface.ResultadoBusquedaPage.MENSAJE_EXITOSO;

public class ElMensaje implements Question<String> {

    public static ElMensaje exitoso(){
        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_EXITOSO).viewedBy(actor).asString();
    }
}
