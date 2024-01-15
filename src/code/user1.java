package code;

import java.sql.Statement;

import helper.DBConnecter;

public class user1 {
	DBConnecter conn = new DBConnecter(); 
	public user1() {}
	

	private String name , tcno, type ,sifre , tanidetay , tarih , dosyanumara , verendoktor, verenlab ,tanibasligi;


	public user1(  String name, String tcno, String type, String sifre, String tanidetay,
			String tarih, String dosyanumara, String verendoktor, String verenlab, String tanibasligi) {
		super();
		
		this.name = name;
		this.tcno = tcno;
		this.type = type;
		this.sifre = sifre;
		this.tanidetay = tanidetay;
		this.tarih = tarih;
		this.dosyanumara = dosyanumara;
		this.verendoktor = verendoktor;
		this.verenlab = verenlab;
		this.tanibasligi = tanibasligi;
	}
	

	public String getTanidetay() {
		return tanidetay;
	}

	public void setTanidetay(String tanidetay) {
		this.tanidetay = tanidetay;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public String getDosyanumara() {
		return dosyanumara;
	}

	public void setDosyanumara(String dosyanumara) {
		this.dosyanumara = dosyanumara;
	}

	public String getVerendoktor() {
		return verendoktor;
	}

	public void setVerendoktor(String verendoktor) {
		this.verendoktor = verendoktor;
	}

	public String getVerenlab() {
		return verenlab;
	}

	public void setVerenlab(String verenlab) {
		this.verenlab = verenlab;
	}

	public String getTanibasligi() {
		return tanibasligi;
	}

	public void setTanibasligi(String tanibasligi) {
		this.tanibasligi = tanibasligi;
	}

	public String getSifre() {
		return sifre;
	}



	public void setSifre(String sifre) {
		this.sifre = sifre;
	}





	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getTcno() {
		return tcno;
	}



	public void setTcno(String tcno) {
		this.tcno = tcno;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}




	
	
}
