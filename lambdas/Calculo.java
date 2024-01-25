package lambdas;

@FunctionalInterface // funcional é usado para lambdas
public interface Calculo {

	public abstract double executar(double a, double b);
	
	default String legal () {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}
