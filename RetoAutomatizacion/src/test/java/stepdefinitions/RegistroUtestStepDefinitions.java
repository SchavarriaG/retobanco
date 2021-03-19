package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.RegistrarDatos;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.Map;

import net.serenitybdd.screenplay.actions.Open;

public class RegistroUtestStepDefinitions {

	@Before
	public void initialConfig() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} ingresa a la pagina {string}")
	public void ingresaALaPagina(String nombre, String enlace) {
		theActor(nombre).wasAbleTo(Open.url(enlace));
	}

	@When("Ingresa la informacion")
	public void ingresaLaInformacion(Map<String, String> datos) {
		theActorInTheSpotlight().attemptsTo(RegistrarDatos.con(datos));
	}

	@Then("Valida el texto en pantalla {string}")
	public void validaElTextoEnPantalla(String texto) {
		
	}
}
