package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistroDispositivos {

	public static final Target CAMPO_MARCA = Target.the("Campo de marca").locatedBy("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span");
	public static final Target INGRESO_MARCA = Target.the("Campo de marca para escribir").locatedBy("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]");
	public static final Target CAMPO_MODELO = Target.the("Campo de modelo").locatedBy("name:birthMonth");
	public static final Target CAMPO_SO = Target.the("Campo de sistema operativo").locatedBy("name:birthYear");
}
