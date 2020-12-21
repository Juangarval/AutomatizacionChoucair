package com.choucairtesting.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscar_empleo.feature",
        glue = "com.choucairtesting.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuscarEmpleo {
}
