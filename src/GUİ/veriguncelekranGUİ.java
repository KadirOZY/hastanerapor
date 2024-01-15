package GUİ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import code.hastasorguekran;
import code.veriguncel;
import code.veriguncelekran;
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

public class veriguncelekranGUİ extends JFrame {
	private DBConnecter conn = new DBConnecter();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					veriguncelekranGUİ frame = new veriguncelekranGUİ();
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
	public veriguncelekranGUİ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kimlik numarası");
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		rdbtnNewRadioButton.setActionCommand("tc");
		rdbtnNewRadioButton.setBounds(10, 158, 233, 50);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("tc");
		
		JRadioButton rdbtnAdsoyad = new JRadioButton("Ad-Soyad");
		rdbtnAdsoyad.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		rdbtnAdsoyad.setActionCommand("ad");
		rdbtnAdsoyad.setBounds(10, 236, 233, 50);
		contentPane.add(rdbtnAdsoyad);
		rdbtnAdsoyad.setActionCommand("ad");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnAdsoyad);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(10, 315, 285, 58);
		contentPane.add(textField);
		
		JButton btnGncelle = new JButton("GÜNCELLE");
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
if(bg.getSelection().getActionCommand().equals("tc")) {
					
					try {
						Connection con = conn.connDB();
						Statement st;
						st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM otomasyon");
						while(rs.next()) {
							if(textField.getText().equals(rs.getString("tcno"))) {
								veriguncel Hastas1 = new veriguncel();
								Hastas1.setName(rs.getString("name"));
								Hastas1.setTcno(rs.getString("tcno"));
								Hastas1.setType(rs.getString("type"));
								Hastas1.setDosyanumara(rs.getString("dosyanumara"));
								Hastas1.setTanibasligi(rs.getString("tanibasligi"));
								Hastas1.setTanidetay(rs.getString("tanidetay"));
								Hastas1.setTarih(rs.getString("tarih"));
								Hastas1.setVerendoktor(rs.getString("verendoktor"));
								Hastas1.setVerenlab(rs.getString("verenlab"));
								veriguncelGUİ hsGUİ = new veriguncelGUİ(Hastas1);
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
							if(textField.getText().equals(rs.getString("name"))) {
								veriguncel Hastas = new veriguncel();
								
								Hastas.setName(rs.getString("name"));
								Hastas.setTcno(rs.getString("tcno"));
								Hastas.setType(rs.getString("type"));
								Hastas.setDosyanumara(rs.getString("dosyanumara"));
								Hastas.setTanibasligi(rs.getString("tanibasligi"));
								Hastas.setTanidetay(rs.getString("tanidetay"));
								Hastas.setTarih(rs.getString("tarih"));
								Hastas.setVerendoktor(rs.getString("verendoktor"));
								Hastas.setVerenlab(rs.getString("verenlab"));
								
								veriguncelGUİ hsGUİ = new veriguncelGUİ(Hastas);
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
		btnGncelle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnGncelle.setBounds(390, 315, 233, 58);
		contentPane.add(btnGncelle);
		
		JButton btnk = new JButton("ÇIKIŞ");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lg = new login();
				lg.setVisible(true);
				dispose();
			}
		});
		btnk.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnk.setBounds(390, 236, 233, 58);
		contentPane.add(btnk);
	}
}
