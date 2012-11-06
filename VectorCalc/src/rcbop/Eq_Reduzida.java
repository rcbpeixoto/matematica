package rcbop;

public class Eq_Reduzida {
	public static String fReduzida(int modo, int x1, int y1, int z1, int a, int b, int c) {
		int x = 1, y = 1, z = 1, valor1 = 0, valor2 = 0;
		String resultado = "", vresultado = "";

		switch (modo) {

		case 0:
			vresultado = "";
			resultado = "";

			if (a == 0) {
				resultado = "y = 0";
			} else if (b == 0) {
				if (y1 == 0) {
					resultado = "y = 0";
				} else {
					resultado = "y = " + y1;
				}
			} else {
				valor1 = y * a;
				valor2 = x * b;

				if (valor2 % valor1 == 0) {
					valor2 = valor2 / valor1;
					vresultado = valor2 + "x";
				} else {
					vresultado = "(" + valor2 + "x/" + valor1 + ")";
				}

				valor2 = (-x1) * b + y1 * a;

				if (valor2 % valor1 == 0) {
					valor2 = valor2 / valor1;

					if (valor2 != 0)

						if (valor2 < 0) {
							vresultado = vresultado + " " + valor2;
						} else {
							vresultado = vresultado + " + " + valor2;
						}
				} else {
					if (valor2 > 0) {
						vresultado = vresultado + " + " + valor2 + "/" + valor1;
					} else {
						vresultado = vresultado + " " + valor2 + "/" + valor1;
					}
				}
				resultado = "y = " + vresultado;

			}

			break;
		case 1:
			vresultado = "";
			resultado = "";

			if (a == 0) {
				resultado = "z = 0";
			} else if (c == 0) {
				if (z1 == 0) {
					resultado = "z = 0";
				} else {
					resultado = "z = " + z1;
				}

			} else {

				valor1 = z * a;
				valor2 = x * c;
				if (valor2 % valor1 == 0) {
					valor2 = valor2 / valor1;
					vresultado = valor2 + "x";
				} else {
					vresultado = "(" + valor2 + "x/" + valor1 + ")";
				}
				valor2 = (-x1) * c + z1 * a;

				if (valor2 % valor1 == 0) {
					valor2 = valor2 / valor1;
					if (valor2 != 0)

						if (valor2 < 0) {
							vresultado = vresultado + " " + valor2;
						} else {
							vresultado = vresultado + " + " + valor2;
						}
				} else {
					if (valor2 > 0) {
						vresultado = vresultado + " + " + valor2 + "/" + valor1;
					} else {
						vresultado = vresultado + " " + valor2 + "/" + valor1;
					}
				}
				resultado = "z = " + vresultado;

			}
			break;
		}
		return resultado;

	}
}
