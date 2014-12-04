public class Mazzo {

	private CartaDaGioco[] mazzo;
	
	public Mazzo() {
		mazzo = new CartaDaGioco[40];
		int j = 1;
		for(int i = 0; i < 10; i++) { // 0 - 9
			mazzo[i] = new CartaDaGioco(j, "Cuori");
			j++;
		}//for
		j = 1;
		for(int i = 10; i < 20 ; i++) { // 10 - 19
			mazzo[i] = new CartaDaGioco(j, "Quadri");
			j++;
		}//for 
		j = 1;
		for(int i = 20; i < 30; i++) { //20 - 29
			mazzo[i] = new CartaDaGioco(j, "Fiori");
			j++;
		}//for
		j = 1;
		for(int i = 30; i < 40; i++) { //30 - 39
			mazzo[i] = new CartaDaGioco(j, "Picche");
			j++;
		}//for 
	}//I Costruttore
	
	/*Metodo toString, ritorna una rappresentazione grafica testuale
	*dell'elemento
	*@return rappresentazione grafica dell'elemento
	*/
	public String toString() {
		String supporto = "";
		for(int i = 0; i < 40; i++) {
			supporto = supporto + mazzo[i].toString();
		}//for
		return supporto;
	}//toString
	
	/* Metodo mescolare - non funzionante
	public void mescolare() {
		CartaDaGioco[] mazzo2 = new CartaDaGioco[40];
		Random random = new Random(); //Errore su questa operazione
		for(int i = 0; i < 40; i++) {
			mazzo2[i] = mazzo[i];
		}//for
		for(int i = 0; i < 40; i++) {
			int j = random.nextInt(39);
			mazzo[i] = mazzo2[j];
		}//for
	}//mescolare*/
	
	/*Metodo primaCarta, rimuove la prima carta del mazzo
	@return prima carta del mazzo
	*/
	public void estraiPrimaCarta() {
		CartaDaGioco mazzo2[] = new CartaDaGioco[mazzo.length - 1];
		for(int i = 0; i < mazzo2.length; i++) {
			mazzo[i+1] = mazzo2[i];
		}
	}
	
	/*Metodo rimettiCarta
	La carta passata va riposta in fondo al mazzo, facendo scalare le 
	successive*/
	public void rimettiCarta(CartaDaGioco c1) {
		CartaDaGioco[] mazzo2 = new CartaDaGioco[mazzo.length - 1];
		for(int i = 0; i < mazzo2.length; i++) {
			mazzo2[i] = mazzo[i+1];
		}//for
		mazzo = mazzo2;
	}//rimettiCarta
	
	/* Metodo gioca
	 *@param c1 carta da gioco esplicita
	 *@return giocatore vincente
	 */
	public String gioca(CartaDaGioco c1) {
		String vincitore = "";
		int colore1 = 0;
		int colore2 = 0;
		int ap1 = 0;
		int ap2 = 0;
		if (mazzo[1].getSeme() == "Cuori") {
			colore1 = 1;
			ap1 = 1;
		}//if
		if (mazzo[1].getSeme() == "Quadri") {
			colore1 = 1;
			ap1 = 2;
		}//if
		if (mazzo[1].getSeme() == "Fiori") {
			colore1 = 2;
			ap1 = 3;
		}//if
		if (mazzo[1].getSeme() == "Picche") {
			colore1 = 2;
			ap1 = 4;
		}//if
		if (c1.getSeme() == "Cuori") {
			colore2 = 1;
			ap2 = 1;
		}//if
		if (c1.getSeme() == "Quadri") {
			colore2 = 1;
			ap2 = 2;
		}//if
		if (c1.getSeme() == "Fiori") {
			colore2 = 2;
			ap2 = 3;
		}//if
		if (c1.getSeme() == "Picche") {
			colore2 = 2;
			ap2 = 4;
		}//if
		if ((colore1 == colore2) && (mazzo[1].getValore() == c1.getValore())) {
			if(colore1 > colore2) {
				vincitore = "Giocatore 1";
			} else {
				vincitore = "Giocatore 2";
			}//if
		}//if
		if ((colore1 != colore2) && (mazzo[1].getValore() != c1.getValore())) {
			if(mazzo[1].getValore() > c1.getValore()) {
				vincitore = "Giocatore 1";
			} else {
				vincitore = "Giocatore 2";
			}//if
		}//if
		if (((colore1 == colore2)) && (mazzo[1].getValore() != c1.getValore())) {
			if(ap1 < ap2) {
				vincitore = "Giocatore 1";
			} else {
				vincitore = "Giocatore 2";
			}//if
		}//if
		return vincitore;
	}//gioca
	
}//Mazzo