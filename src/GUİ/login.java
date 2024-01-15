package GUİ;

import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import code.Doktor;
import code.hasta;
import helper.DBConnecter;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hastatctext;
	private JTextField doktortctext;
	private JPasswordField doktorsifre;
	private DBConnecter conn = new DBConnecter();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setResizable(false);
		setTitle("Hastane Otomasyon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hastane Rapor Sonucu Görüntüleme");
		lblNewLabel.setBounds(63, 21, 543, 71);
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 111, 663, 384);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Hasta girişi", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("T.C Numaranız :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 62, 229, 34);
		panel_1.add(lblNewLabel_2);
		
		hastatctext = new JTextField();
		hastatctext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		hastatctext.setColumns(10);
		hastatctext.setBounds(322, 62, 298, 39);
		panel_1.add(hastatctext);
		
		JButton btn_giris_yönetici = new JButton("Giriş Yap");
		btn_giris_yönetici.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hastatctext.getText().length()==0 ) {
					JOptionPane.showMessageDialog(null, "Lütfen alanı doldurunuz");
				}
				else {
					
					try {
						Connection con = conn.connDB();
						Statement st;
						st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM otomasyon");
						while(rs.next()) {
							if(hastatctext.getText().equals(rs.getString("tcno"))&& (rs.getString("type").equals("hasta"))){
								hasta Hasta = new hasta();
								
								Hasta.setName(rs.getString("name"));
								Hasta.setTcno(rs.getString("tcno"));
								Hasta.setType(rs.getString("type"));
								Hasta.setDosyanumara(rs.getString("dosyanumara"));
								Hasta.setTanibasligi(rs.getString("tanibasligi"));
								Hasta.setTanidetay(rs.getString("tanidetay"));
								Hasta.setTarih(rs.getString("tarih"));
								Hasta.setVerendoktor(rs.getString("verendoktor"));
								Hasta.setVerenlab(rs.getString("verenlab"));
								
								hastaGUİ hGUİ = new hastaGUİ(Hasta);
								hGUİ.setVisible(true);
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
		btn_giris_yönetici.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn_giris_yönetici.setBounds(22, 221, 587, 71);
		panel_1.add(btn_giris_yönetici);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Doktor Girişi", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("T.C Numaranız :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(22, 48, 229, 34);
		panel.add(lblNewLabel_2_1);
		
		doktortctext = new JTextField();
		doktortctext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		doktortctext.setColumns(10);
		doktortctext.setBounds(334, 48, 298, 39);
		panel.add(doktortctext);
		
		JLabel lblifre_1 = new JLabel("Şifre :");
		lblifre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblifre_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblifre_1.setBounds(22, 131, 229, 34);
		panel.add(lblifre_1);
		
		doktorsifre = new JPasswordField();
		doktorsifre.setBounds(339, 131, 293, 46);
		panel.add(doktorsifre);
		
		JButton btn_giris_yönetici_1 = new JButton("Giriş Yap");
		btn_giris_yönetici_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(doktortctext.getText().length()==0 || doktorsifre.getText().length()==0) {
					JOptionPane.showMessageDialog(null, "Lütfen alanı doldurunuz");
				}
				else {	
					
					try {
						Connection con = conn.connDB();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM otomasyon ");
						while(rs.next()) {
							if(doktortctext.getText().equals(rs.getString("tcno")) && doktorsifre.getText().equals(rs.getString("sifre"))) {
								Doktor doktor = new Doktor();
								
								doktor.setName(rs.getString("name"));
								doktor.setTcno(rs.getString("tcno"));
								doktor.setType(rs.getString("type"));
								doktor.setSifre(rs.getString("sifre"));
								
								doktorGUİ dGUİ = new doktorGUİ(doktor);
								dGUİ.setVisible(true);
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
		btn_giris_yönetici_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btn_giris_yönetici_1.setBounds(32, 235, 587, 71);
		panel.add(btn_giris_yönetici_1);
	}
}
