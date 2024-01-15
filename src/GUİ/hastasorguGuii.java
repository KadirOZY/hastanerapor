package GUİ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import code.hastasorguekran;
import helper.DBConnecter;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class hastasorguGuii extends JFrame {
	private DBConnecter conn = new DBConnecter();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sorgutext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hastasorguGuii frame = new hastasorguGuii();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hastasorguGuii() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kimlik numarası");
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(6, 148, 233, 50);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("tc");
		
		JRadioButton rdbtnAdsoyad = new JRadioButton("Ad-Soyad");
		rdbtnAdsoyad.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		rdbtnAdsoyad.setBounds(6, 226, 233, 50);
		contentPane.add(rdbtnAdsoyad);
		rdbtnAdsoyad.setActionCommand("ad");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnAdsoyad);
		
		
		sorgutext = new JTextField();
		sorgutext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		sorgutext.setBounds(6, 305, 285, 58);
		contentPane.add(sorgutext);
		sorgutext.setColumns(10);
		
		JButton btnNewButton = new JButton("SORGULA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bg.getSelection().getActionCommand().equals("tc")) {
					
					try {
						Connection con = conn.connDB();
						Statement st;
						st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM otomasyon");
						while(rs.next()) {
							if(sorgutext.getText().equals(rs.getString("tcno"))) {
								hastasorguekran Hastas = new hastasorguekran();
								Hastas.setName(rs.getString("name"));
								Hastas.setTcno(rs.getString("tcno"));
								Hastas.setType(rs.getString("type"));
								Hastas.setDosyanumara(rs.getString("dosyanumara"));
								Hastas.setTanibasligi(rs.getString("tanibasligi"));
								Hastas.setTanidetay(rs.getString("tanidetay"));
								Hastas.setTarih(rs.getString("tarih"));
								Hastas.setVerendoktor(rs.getString("verendoktor"));
								Hastas.setVerenlab(rs.getString("verenlab"));
								hastasorguekranGUİ hsGUİ = new hastasorguekranGUİ(Hastas);
								hsGUİ.setVisible(true);
								dispose();
							}
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				else if (bg.getSelection().getActionCommand().equals("ad")) {
					Connection con = conn.connDB();
					Statement st;
					try {
						st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM otomasyon");
						while(rs.next()) {
							if(sorgutext.getText().equals(rs.getString("name"))) {
								hastasorguekran Hastas = new hastasorguekran();
								
								Hastas.setName(rs.getString("name"));
								Hastas.setTcno(rs.getString("tcno"));
								Hastas.setType(rs.getString("type"));
								Hastas.setDosyanumara(rs.getString("dosyanumara"));
								Hastas.setTanibasligi(rs.getString("tanibasligi"));
								Hastas.setTanidetay(rs.getString("tanidetay"));
								Hastas.setTarih(rs.getString("tarih"));
								Hastas.setVerendoktor(rs.getString("verendoktor"));
								Hastas.setVerenlab(rs.getString("verenlab"));
								
								hastasorguekranGUİ hsGUİ = new hastasorguekranGUİ(Hastas);
								hsGUİ.setVisible(true);
								dispose();
							
							}
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(386, 305, 233, 58);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ÇIKIŞ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lg = new login();
				lg.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton_1.setBounds(386, 226, 233, 58);
		contentPane.add(btnNewButton_1);
	}
}
