
public class tanque{

	
	  public static void main(String[] args){
		double t = 1;
		double H = 4;
		double E = 5;
		double S = 1;
		double A = 3;
		double C = 4;
		double Hb, VA = 0;
		int i = 0;
		int num = 49;
		
		while (H < C) { //llena el tanque hasta que llega a tope
			i++;
			Hb = tiempoRespectoAnterior (H, E, S,ta(t, A));
			H = Hb;
			VA= volumenAgua (A, H);
			//System.out.println(formatearDecimales(Hb, 3) + "||" + formatearDecimales(VA, 4));
			while (((C/2) < formatearDecimales(Hb, 3))&& (num != 50)) {
				System.out.println("primer valor que supero la mitad fue a los " + tiempoTranscurrido(i,t) + " segundos");
				num = 50;
			}
		}
		System.out.println("el tanque se llenó a los " + tiempoTranscurrido(i,t) + " segundos");
		i = 0;
		while (H > 0) { //vacia tanque hasta 0
			i++;
			Hb = tiempoRespectoAnterior (H, 0, S,ta(t, A));
			H = Hb;
			VA= volumenAgua (A, H);
			//System.out.println(formatearDecimales(Hb, 3) + "||" + formatearDecimales(VA, 4));
		}
		System.out.println("el tanque se vació a los " + tiempoTranscurrido(i,t) + " segundos");
	}
	public static double tiempoTranscurrido (int i, double t) {
		return i * t;
	}
	public static double tiempoRespectoAnterior (double tiempoAnterior, double entradaActual, double salidaActual, double ta) {
		double tiempoActual = tiempoAnterior + (entradaActual - salidaActual) * ta;
		return tiempoActual;
	}
	public static double ta (double t, double A) {
		return t/A;
	}
	public static double volumenAgua (double A, double tiempoAnterior){
		double volumen = tiempoAnterior * A;
		return volumen;
	}
	public static Double formatearDecimales(Double numero, Integer numeroDecimales) { //redondea los decimales innecesarios
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
		} 
	/*public static void main(String[] args){
		double t = 1;
		double H = 4;
		double E = 5;
		double A = 3;
		double C = 4;
	
		
		int i = 0;
		int num = 49;
		double Hb = 0;
		double S = 2;
		
		while (H < C) { //llena el tanque hasta que llega a tope
			i++;
			Hb = tiempoRespectoAnterior (H, 0, S, t, A);
			H = Hb;
			S= salidaAgua (t,H);
			//System.out.println(formatearDecimales(Hb, 3) + "||" + formatearDecimales(S, 4));
			while (((C/2) < formatearDecimales(Hb, 3))&& (num != 50)) {
				System.out.println("primer valor que supero la mitad fue a los " + tiempoTranscurrido(i,t) + " segundos");
				num = 50;
			}
		}
		System.out.println("el tanque se llenó a los " + tiempoTranscurrido(i,t) + " segundos");
		i = 0;
		while (H > 0) { //vacia tanque hasta 0
			i++;
			Hb = tiempoRespectoAnterior (H, 0, S, t, A);
			H = Hb;
			S= salidaAgua (t,H);
			//System.out.println(formatearDecimales(Hb, 3) + "||" + formatearDecimales(S, 4));
		}
		System.out.println("el tanque se vació a los " + tiempoTranscurrido(i,t) + " segundos");
	}
	public static double tiempoRespectoAnterior (double tiempoAnterior, double entradaActual, double salidaActual, double t, double A) {
		double tiempoActual = tiempoAnterior + ((((entradaActual * t ) - (2*t))/A));
		return tiempoActual;
	}
	
	public static double salidaAgua (double t, double h){
		double volumen = (h * (2 * t)) * t;
		return volumen;
	}
	public static double tiempoTranscurrido (int i, double t) {
		return i * t;
	}
	public static Double formatearDecimales(Double numero, Integer numeroDecimales) { //redondea los decimales innecesarios
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
	}*/
}
