package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistroDatosUtest {

	public static final Target CAMPO_NOMBRE = Target.the("Campo de nombre").locatedBy("id:firstName");
	public static final Target CAMPO_APELLIDO = Target.the("Campo de apellido").locatedBy("id:lastName");
	public static final Target CAMPO_EMAIL = Target.the("Campo de email").locatedBy("id:email");
	public static final Target CAMPO_DIA = Target.the("Campo de dia").locatedBy("name:birthDay");
	public static final Target CAMPO_MES = Target.the("Campo de mes").locatedBy("name:birthMonth");
	public static final Target CAMPO_ANIO = Target.the("Campo de anio").locatedBy("name:birthYear");
	public static final Target BOTON_NEXT = Target.the("Boton next").locatedBy("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");

}
