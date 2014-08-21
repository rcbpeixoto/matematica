import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;

/***
 * Acha raiz real positiva da função definida.
 * 
 * @author Rogério Peixoto (rcbpeixoto@gmail.com)
 */
public class RootFinderMethods {
	
	private static int INITIAL_K = 0;

	/**
	 * Cálcula função f definida por Cos(2x) - ln((x^2)-1) dado um valor de x
	 * @param x
	 * @return
	 */
	public static double f(double x) {
		return Math.cos(2 * x) - Math.log(Math.pow(x, 2) - 1);
	}

	/**
	 * Acha raiz real positiva da função f definida por Cos(2x) - ln((x^2)-1) utilizando o método da bisseção
	 * dado intervalo '[a,b]', precisão 'epsilon' (e.g. 0.0001) e número de interações 'i'
	 * @param a
	 * @param b
	 * @param epsilon
	 * @param k
	 * @return
	 */
	public static double bisection(double a, double b, double epsilon, double k) {

		double m = (a + b) / 2;
		
		System.out.println("I=[" + String.format("%.4f",a) + " " + String.format("%.4f",b) + "] i = " + (INITIAL_K-k));

		//condição de parada de função recursiva
		if (k == 0 || b - a <= epsilon) {
			return m;
		}
		// Teorema de Bozzano
		if ((f(a) * f(m)) < 0) {
			return bisection(a, m, epsilon, --k);
		} else {
			return bisection(m, b, epsilon, --k);
		}
	}
	
	public static double newtonRaphson(double a, double b, double epsilon, double k){
		double x = (a+b) /2;
		double xTemp = 0;
		double dx = 0;
		while (k > 0  && Math.abs(xTemp - x) > epsilon && f(x)!= 0) {
			System.out.println("current x " + String.format("%.4f",x) + " i=" + (INITIAL_K-k));
			dx = f(x) / dydxFunction(x, 1);
			xTemp = x;
			x = x - dx;
			k--;
		}
		return x;
	}
	
	/**
	 * Retorna valor da 'n' derivada parcial da função f definida por Cos(2x) - ln((x^2)-1) para um dado x
	 * Esta função utiliza org.apache.commons.math3 DerivativeStructure
	 * @param vX
	 * @param n
	 * @return
	 */
	public static double dydxFunction(double vX, int n){
		//variavel x
		DerivativeStructure t_x = new DerivativeStructure(1, 3, 0, vX);
		//primeiro termo Cos(2x)
		DerivativeStructure t_2x = t_x.multiply(2);
		DerivativeStructure t_cos_2x = t_2x.cos();
		//segundo termo ln((x^2)-1)
		DerivativeStructure t_x2 = t_x.pow(2);
		DerivativeStructure t_x2sub1 = t_x2.subtract(1);
		DerivativeStructure t_log_x2sub1 = t_x2sub1.log();
		//expressao Cos(2x) - ln((x^2)-1)
		DerivativeStructure exp = new DerivativeStructure(1, t_cos_2x, -1, t_log_x2sub1);
		return exp.getPartialDerivative(n);
	}
	
	
	//método de teste
	public static void main(String[] args) {
		System.out.println("FUNÇÃO: Cos(2x) - ln((x^2)-1) I=[1,2] epsilon=0.0001\n ");
		System.out.println(">> MÉTODO DA BISSEÇÃO: <<");
		INITIAL_K = 50;
		double root = bisection(1, 2, 0.0001, INITIAL_K);
		System.out.println("Raiz: "+ root);
		
		System.out.println("\n>> MÉTODO DE NEWTON: <<");
		root = newtonRaphson(1, 2, 0.0001, INITIAL_K);
		System.out.println("Raiz: " + root);
	}

}
