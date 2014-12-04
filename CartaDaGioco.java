public class CartaDaGioco {

	private int valore;
	private String seme;
	
	/*Costruttore completo
	*@param val valore della carta
	*@param s seme della carta
	*/
	public CartaDaGioco(int val, String s) {
		valore = val;
		seme = s;
	}//Costruttore completo
	
	/*Costruttore di default*/
	public CartaDaGioco() {
		valore = 0;
		seme = "";
	}//Costruttore di default
	
	/*Metodo accessore getValore
	*@return valore
	*/
	public int getValore() {
		return valore;
	}//getValore
	
	/*Metodo accessore getSeme
	*@return seme
	*/
	public String getSeme() {
		return seme;
	}//getSeme
	
	/*Metodo modificatore setValore
	*@param val parametro per modificare valore
	*/
	public void setValore(int val) {
		valore = val;
	}
	
	/*Metodo modificatore setValore
	*@param s parametro per modificare seme
	*/
	public void setSeme(String s) {
		seme = s;
	}//setSeme	
	
	/*Metodo toString
	*@return ritorna una rappresentazione grafica dell'oggetto CartaDaGioco
	*/
	public String toString() {
		return "Valore: " + valore + "\nSeme: " + seme + "\n\n";
	}//toString
	
}//CartaDaGioco