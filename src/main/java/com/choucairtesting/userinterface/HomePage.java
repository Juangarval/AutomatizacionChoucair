package com.choucairtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static Target BTN_EMPLEOS = Target.the("Opcion empleos").located(By.id("menu-item-550"));
}
