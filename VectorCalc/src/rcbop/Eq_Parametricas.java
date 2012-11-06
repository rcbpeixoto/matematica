package rcbop;

public class Eq_Parametricas {

	public static String fParametrica(int modo, int x1, int a, String t) {
		double x = 0, t1 = 0;
		String resultado = "";

		if (t.equalsIgnoreCase("t")) {
			x = x1 + a;

			switch (modo) {
			case 0:
				if (a == 0) {
					resultado = "x = " + x1;
				} else {

					if (a > 0) {
						if (x1 == 0)
							resultado = "x = " + a + "t";
						else
							resultado = "x = " + x1 + " + " + a + "t";
					} else {
						if (x1 == 0)
							resultado = "x = " + (a * -1) + "t";
						else
							resultado = "x = " + x1 + " - " + (a * -1) + "t";
					}
				}

				break;
			case 1:

				if (a == 0) {
					resultado = "y = " + x1;
				} else {
					if (a > 0) {
						if ((a > 0) && (x1 == 0))
							resultado = "y = " + a + "t";

						else
							resultado = "y = " + x1 + " + " + a + "t";

					} else {
						if (x1 == 0)
							resultado = "y = " + (a * -1) + "t";
						else
							resultado = "y = " + x1 + " - " + (a * -1) + "t";
					}
				}

				break;
			case 2:

				if (a == 0) {
					resultado = "z = " + x1;
				} else {
					if (a > 0) {
						if (x1 == 0)
							resultado = "z = " + a + "t";
						else
							resultado = "z = " + x1 + " + " + a + "t";
					} else {
						if (x1 == 0)
							resultado = "z = " + (a * -1) + "t";
						else
							resultado = "z = " + x1 + " - " + (a * -1) + "t";
					}
				}

				break;

			}
		}
		return resultado;

	}
}
