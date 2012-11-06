package rcbop;

public class FBVLEIA {
	public static double Leia(double param) {
		java.io.DataInputStream dado_lido;
		String stemporario;
		double resultado = 0;
		try {
		dado_lido = new java.io.DataInputStream(System.in);
		stemporario = dado_lido.readLine();
		resultado =Double.parseDouble(stemporario);
		}catch (Exception e) { }
		return resultado;
		}
		public static int Leia(int param) {
		java.io.DataInputStream dado_lido;
		String stemporario;
		int resultado = 0;
		try {
		dado_lido = new java.io.DataInputStream(System.in);
		stemporario = dado_lido.readLine();
		resultado =Integer.parseInt(stemporario);
		}catch (Exception e) { }
		return resultado;
		}
		public static String Leia(String param) {
		java.io.DataInputStream dado_lido;
		String stemporario="";
		try {
		dado_lido = new java.io.DataInputStream(System.in);
		stemporario = dado_lido.readLine();
		}catch (Exception e) { }
		return stemporario;
		} 
}
