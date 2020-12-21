package com.choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeccionDeEmpleosPage {

    public static Target CAMPO_KEYWORDS = Target.the("Campo keywords").located(By.id("search_keywords"));

    public static Target CAMPO_LOCATION = Target.the("Campo ciudad").
            located(By.id("search_location"));

    public static Target BTN_BUSCAR_EMPLEOS = Target.the("Buscar empleo").
            located(By.xpath("//div[@class='search_submit']"));
}
