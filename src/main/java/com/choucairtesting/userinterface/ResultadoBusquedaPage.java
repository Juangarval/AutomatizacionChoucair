package com.choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadoBusquedaPage {

    public static Target MENSAJE_EXITOSO = Target.the("Mensaje resultado de busqueda").
            located(By.xpath("//div[@class='position']//h3"));
}
