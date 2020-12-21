package com.choucairtesting.stepdefinitions;

import com.choucairtesting.exceptions.ErrorAlConsultarVacanteExceptions;
import com.choucairtesting.interactions.Abrir;
import com.choucairtesting.questions.ElMensaje;
import com.choucairtesting.tasks.Buscar;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

public class BuscarEmpleoStepDefinitions {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;

    @Before
    public void preparacion() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("que el usuario esta en la seccion de empleos de choucairtesting")
    public void queElUsuarioEstaEnLaSeccionDeEmpleosDeChoucairtesting() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));
        OnStage.theActorInTheSpotlight().attemptsTo(Abrir.laOpcionEmpleos());
    }

    @Cuando("consulta {string} para la ciudad de {string}")
    public void consultaParaLaCiudadDe(String palabraClave, String ciudad) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.empleosDisponibles(palabraClave,ciudad));
    }

    @Entonces("el visualizara la vacante {string}")
    public void elVisualizaraLaVacante(String mensaje) {
        OnStage.theActorInTheSpotlight().should(seeThat(ElMensaje.exitoso(),equalTo(mensaje)).
                orComplainWith(ErrorAlConsultarVacanteExceptions.class, "No se puede visualizar el resultado de la busqueda"));
    }
}
