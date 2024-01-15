package GUİ;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import code.Doktor;
import code.lab1;
import helper.DBConnecter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lab1GUİ extends JFrame {
	private DBConnecter conn = new DBConnecter();
	Connection con = conn.connDB();
	Statement st = null;
	ResultSet rs = null;
	static lab1 lab1GUİ = new lab1();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField adgiristext;
	private JTextField kimlikgiristext;
	private JTextField tanibasligigiristext;
	private JTextField tanidetaygiristext;
	private JTextField tarihgiristext;
	private JTextField dosyanumaragiristext;
	private JTextField onaydokgiristext;
	private JTextField onaylabgiristext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lab1GUİ frame = new lab1GUİ(lab1GUİ);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param lab1gui2 
	 * @throws SQLException 
	 */
	public lab1GUİ(lab1 lab1gui2) throws SQLException {
	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(27, 26, 700, 438);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Ad-Soyad :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel.setBounds(26, 24, 169, 32);
		contentPane_1.add(lblNewLabel);
		
		adgiristext = new JTextField();
		adgiristext.setText((String) null);
		adgiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		adgiristext.setColumns(10);
		adgiristext.setBounds(261, 24, 281, 32);
		contentPane_1.add(adgiristext);
		
			
		JLabel lblKimlikNumaras = new JLabel("Kimlik Numarası :");
		lblKimlikNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblKimlikNumaras.setBounds(26, 73, 169, 32);
		contentPane_1.add(lblKimlikNumaras);
		
		kimlikgiristext = new JTextField();
		kimlikgiristext.setText((String) null);
		kimlikgiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		kimlikgiristext.setColumns(10);
		kimlikgiristext.setBounds(261, 77, 281, 32);
		contentPane_1.add(kimlikgiristext);
		
		
		JLabel lblTanBal = new JLabel("Tanı Başlığı");
		lblTanBal.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanBal.setBounds(26, 120, 169, 32);
		contentPane_1.add(lblTanBal);
		
		tanibasligigiristext = new JTextField();
		tanibasligigiristext.setText((String) null);
		tanibasligigiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		tanibasligigiristext.setColumns(10);
		tanibasligigiristext.setBounds(261, 120, 281, 32);
		contentPane_1.add(tanibasligigiristext);
		
		
		JLabel lblTanDetay = new JLabel("Tanı Detayı :");
		lblTanDetay.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanDetay.setBounds(26, 169, 169, 32);
		contentPane_1.add(lblTanDetay);
		
		tanidetaygiristext = new JTextField();
		tanidetaygiristext.setText((String) null);
		tanidetaygiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		tanidetaygiristext.setColumns(10);
		tanidetaygiristext.setBounds(261, 173, 281, 82);
		contentPane_1.add(tanidetaygiristext);
		
		
		JLabel lblTarih = new JLabel("Tarih");
		lblTarih.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTarih.setBounds(26, 268, 169, 32);
		contentPane_1.add(lblTarih);
		
		tarihgiristext = new JTextField();
		tarihgiristext.setText((String) null);
		tarihgiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		tarihgiristext.setColumns(10);
		tarihgiristext.setBounds(261, 266, 281, 32);
		contentPane_1.add(tarihgiristext);
		
		
		JLabel lblDosyaNumaras = new JLabel("Dosya Numarası :");
		lblDosyaNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblDosyaNumaras.setBounds(26, 311, 169, 32);
		contentPane_1.add(lblDosyaNumaras);
		
		dosyanumaragiristext = new JTextField();
		dosyanumaragiristext.setText((String) null);
		dosyanumaragiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		dosyanumaragiristext.setColumns(10);
		dosyanumaragiristext.setBounds(261, 309, 281, 32);
		contentPane_1.add(dosyanumaragiristext);
		
		
		JLabel lblOnaylayanDoktor = new JLabel("Onaylayan Doktor :");
		lblOnaylayanDoktor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanDoktor.setBounds(26, 354, 169, 32);
		contentPane_1.add(lblOnaylayanDoktor);
		
		onaydokgiristext = new JTextField();
		onaydokgiristext.setText((String) null);
		onaydokgiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		onaydokgiristext.setColumns(10);
		onaydokgiristext.setBounds(261, 352, 281, 32);
		contentPane_1.add(onaydokgiristext);
		
		
		JLabel lblOnaylayanLaboratuvar = new JLabel("Onaylayan Laboratuvar :");
		lblOnaylayanLaboratuvar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanLaboratuvar.setBounds(26, 391, 195, 32);
		contentPane_1.add(lblOnaylayanLaboratuvar);
		
		onaylabgiristext = new JTextField();
		onaylabgiristext.setText((String) null);
		onaylabgiristext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		onaylabgiristext.setColumns(10);
		onaylabgiristext.setBounds(261, 395, 281, 32);
		contentPane_1.add(onaylabgiristext);
		
		
		JButton btnNewButton = new JButton("EKLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hasta eklenmiştir");
				try {
					String q = "INSERT INTO otomasyon (name,tcno,sifre,tanidetay,tarih,dosyanumara,verendoktor,verenlab,tanibasligi) VALUES (?,?,?,?,?,?,?,?,?)";
					PreparedStatement pt = con.prepareStatement(q);
					pt.setString(3, null);
					pt.setString(1,adgiristext.getText());
					pt.setString(2,kimlikgiristext.getText());
					pt.setString(9, tanibasligigiristext.getText());
					pt.setString(4, tanidetaygiristext.getText());
					pt.setString(5, tarihgiristext.getText());
					pt.setString(6, dosyanumaragiristext.getText());
					pt.setString(7,onaydokgiristext.getText() );
					pt.setString(8,onaylabgiristext.getText());	
					pt.executeUpdate();
					adgiristext.setText("");
					kimlikgiristext.setText("");
					tanibasligigiristext.setText("");
					tanidetaygiristext.setText("");
					tarihgiristext.setText("");
					dosyanumaragiristext.setText("");
					onaydokgiristext.setText("");
					onaylabgiristext.setText("");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(552, 352, 135, 32);
		contentPane_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ÇIKIŞ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lGUİ = new login();
				lGUİ.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton_1.setBounds(552, 389, 135, 32);
		contentPane_1.add(btnNewButton_1);
	}
}
