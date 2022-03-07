package examen;

/**
 * Clase que establece si una hora introducida es valida o no
 * 
 * @author DAW102
 * @version 1.8
 *
 *
 */

public class Hora {
	
	/**
	 * Indica si la hora a introducir es valida o no
	 */
	public static boolean horaValida;
	
	/**
	 * 
	 * @param segundos indica los segundos a introducir
	 * @param minutos indica los minutos a introducir
	 * @param horas indica las horas a introducir
	 * @return horaValida establecera si la hora introducida es valida(true) o no(false)
	 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}
