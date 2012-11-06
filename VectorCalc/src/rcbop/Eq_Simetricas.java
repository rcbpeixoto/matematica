package rcbop;

public class Eq_Simetricas {
	public static String fSimetrica(int modo, int x1, int a) {
		String resultado = "";

		switch (modo) {
		case 0:

			if (a == 0) {
				resultado = "x = " + x1;
			} else if (x1 > 0) {
				resultado = "(x-" + x1 + ") / " + a;
			} else {
				if (x1 == 0)
					resultado = "x/" + a;
				else
					resultado = "(x+" + (x1 * -1) + ") /" + a;
			}

			break;
		case 1:

			if (a == 0) {
				resultado = "y = " + x1;
			} else if (x1 > 0) {
				resultado = "(y-" + x1 + ") / " + a;
			} else {
				if (x1 == 0)
					resultado = "y/" + a;
				else
					resultado = "(y+" + (x1 * -1) + ") / " + a;
			}

			break;
		case 2:

			if (a == 0) {
				resultado = "z = " + x1;
			} else if (x1 > 0) {
				resultado = "(z -" + x1 + ") /" + a;
			} else {
				if (x1 == 0)
					resultado = "z /" + a;
				else
					resultado = "(z +" + (x1 * -1) + ") /" + a;
			}

			break;
		}

		return resultado;

	}
}
