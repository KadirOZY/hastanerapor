package code;

import helper.DBConnecter;

public class lab1 extends user1{
	DBConnecter conn = new DBConnecter(); 
	public lab1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public lab1( String name, String tcno, String type, String sifre, String tanidetay,
			String tarih, String dosyanumara, String verendoktor, String verenlab, String tanibasligi) {
		super(  name, tcno, type, sifre, tanidetay, tarih, dosyanumara, verendoktor, verenlab, tanibasligi);
		// TODO Auto-generated constructor stub
	}
	
}
