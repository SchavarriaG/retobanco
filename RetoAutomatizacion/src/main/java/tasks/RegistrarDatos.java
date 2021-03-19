package tasks;

import java.util.Map;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static userinterfaces.PaginaRegistroDatosUtest.*;

import static userinterfaces.PaginaPrincipalUtest.*;
import static userinterfaces.PaginaRegistroDireccionUtest.*;
import static userinterfaces.PaginaRegistroDispositivos.*;

public class RegistrarDatos implements Task {

	private Map<String, String> datos;

	public RegistrarDatos(Map<String, String> datos) {
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_JOIN), 
				Enter.theValue(datos.get("nombre")).into(CAMPO_NOMBRE),
				Enter.theValue(datos.get("apellido")).into(CAMPO_APELLIDO),
				Enter.theValue(datos.get("email")).into(CAMPO_EMAIL),
				SelectFromOptions.byVisibleText(datos.get("dia")).from(CAMPO_DIA),
				SelectFromOptions.byVisibleText(datos.get("mes")).from(CAMPO_MES),
				SelectFromOptions.byVisibleText(datos.get("anio")).from(CAMPO_ANIO), 
				Click.on(BOTON_NEXT),
				Click.on(BOTON_NEXT_DEVICES),
				Click.on(CAMPO_MARCA), 
				Enter.theValue(datos.get("marca")).into(INGRESO_MARCA),
				Hit.the(Keys.ENTER).into(INGRESO_MARCA)
				

		);
	}

	public static RegistrarDatos con(Map<String, String> datos) {
		return Tasks.instrumented(RegistrarDatos.class, datos);
	}
}
