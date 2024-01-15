package code;

import java.sql.Connection;

public class veriguncel extends user1 {
	Connection con = conn.connDB();
	public veriguncel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public veriguncel(String name, String tcno, String type, String sifre, String tanidetay, String tarih,
			String dosyanumara, String verendoktor, String verenlab, String tanibasligi) {
		super(name, tcno, type, sifre, tanidetay, tarih, dosyanumara, verendoktor, verenlab, tanibasligi);
		// TODO Auto-generated constructor stub
	}

}
