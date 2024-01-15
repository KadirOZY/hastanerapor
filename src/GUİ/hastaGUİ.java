package GUİ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import code.hasta;
import helper.DBConnecter;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hastaGUİ extends JFrame {
	private DBConnecter conn = new DBConnecter();
	Connection con = conn.connDB();


	
	static hasta hastaGUİ = new hasta();
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField hastaadtext;
	private JTextField hastakimliktext;
	private JTextField hastatanibasligitext;
	private JTextField hastatanidetaytext;
	private JTextField hastatarihtext;
	private JTextField hastadosyanumaratext;
	private JTextField hastaverendoktortext;
	private JTextField hastaverenlabtext;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hastaGUİ frame = new hastaGUİ(hastaGUİ);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param hastaGUİ2 
	 */
	public hastaGUİ(hasta hastaGUİ2) {
		
	
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ad-Soyad :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel.setBounds(26, 24, 169, 32);
		contentPane.add(lblNewLabel);
		
		hastaadtext = new JTextField();
		hastaadtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastaadtext.setEnabled(false);
		hastaadtext.setColumns(10);
		hastaadtext.setBounds(261, 24, 281, 32);
		contentPane.add(hastaadtext);
		hastaadtext.setText(hastaGUİ2.getName());
		
		JLabel lblKimlikNumaras = new JLabel("Kimlik Numarası :");
		lblKimlikNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblKimlikNumaras.setBounds(26, 73, 169, 32);
		contentPane.add(lblKimlikNumaras);
		
		hastakimliktext = new JTextField();
		hastakimliktext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastakimliktext.setEnabled(false);
		hastakimliktext.setColumns(10);
		hastakimliktext.setBounds(261, 77, 281, 32);
		contentPane.add(hastakimliktext);
		hastakimliktext.setText(hastaGUİ2.getTcno());
		
		JLabel lblTanBal = new JLabel("Tanı Başlığı");
		lblTanBal.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanBal.setBounds(26, 120, 169, 32);
		contentPane.add(lblTanBal);
		
		hastatanibasligitext = new JTextField();
		hastatanibasligitext.setText((String) null);
		hastatanibasligitext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastatanibasligitext.setEnabled(false);
		hastatanibasligitext.setColumns(10);
		hastatanibasligitext.setBounds(261, 120, 281, 32);
		contentPane.add(hastatanibasligitext);
		hastatanibasligitext.setText(hastaGUİ2.getTanibasligi());
		
		JLabel lblTanDetay = new JLabel("Tanı Detayı :");
		lblTanDetay.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanDetay.setBounds(26, 169, 169, 32);
		contentPane.add(lblTanDetay);
		
		hastatanidetaytext = new JTextField();
		hastatanidetaytext.setText((String) null);
		hastatanidetaytext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastatanidetaytext.setEnabled(false);
		hastatanidetaytext.setColumns(10);
		hastatanidetaytext.setBounds(261, 173, 281, 82);
		contentPane.add(hastatanidetaytext);
		hastatanidetaytext.setText(hastaGUİ2.getTanidetay());
		
		JLabel lblTarih = new JLabel("Tarih");
		lblTarih.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTarih.setBounds(26, 268, 169, 32);
		contentPane.add(lblTarih);
		
		hastatarihtext = new JTextField();
		hastatarihtext.setText((String) null);
		hastatarihtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastatarihtext.setEnabled(false);
		hastatarihtext.setColumns(10);
		hastatarihtext.setBounds(261, 266, 281, 32);
		contentPane.add(hastatarihtext);
		hastatarihtext.setText(hastaGUİ2.getTarih());
		
		JLabel lblDosyaNumaras = new JLabel("Dosya Numarası :");
		lblDosyaNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblDosyaNumaras.setBounds(26, 311, 169, 32);
		contentPane.add(lblDosyaNumaras);
		
		hastadosyanumaratext = new JTextField();
		hastadosyanumaratext.setText((String) null);
		hastadosyanumaratext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastadosyanumaratext.setEnabled(false);
		hastadosyanumaratext.setColumns(10);
		hastadosyanumaratext.setBounds(261, 309, 281, 32);
		contentPane.add(hastadosyanumaratext);
		hastadosyanumaratext.setText(hastaGUİ2.getDosyanumara());
		
		JLabel lblOnaylayanDoktor = new JLabel("Onaylayan Doktor :");
		lblOnaylayanDoktor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanDoktor.setBounds(26, 354, 169, 32);
		contentPane.add(lblOnaylayanDoktor);
		
		hastaverendoktortext = new JTextField();
		hastaverendoktortext.setText((String) null);
		hastaverendoktortext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastaverendoktortext.setEnabled(false);
		hastaverendoktortext.setColumns(10);
		hastaverendoktortext.setBounds(261, 352, 281, 32);
		contentPane.add(hastaverendoktortext);
		hastaverendoktortext.setText(hastaGUİ2.getVerendoktor());
		
		JLabel lblOnaylayanLaboratuvar = new JLabel("Onaylayan Laboratuvar :");
		lblOnaylayanLaboratuvar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanLaboratuvar.setBounds(26, 391, 195, 32);
		contentPane.add(lblOnaylayanLaboratuvar);
		
		hastaverenlabtext = new JTextField();
		hastaverenlabtext.setText((String) null);
		hastaverenlabtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hastaverenlabtext.setEnabled(false);
		hastaverenlabtext.setColumns(10);
		hastaverenlabtext.setBounds(261, 395, 281, 32);
		contentPane.add(hastaverenlabtext);
		hastaverenlabtext.setText(hastaGUİ2.getVerenlab());
		JButton btnNewButton = new JButton("ÇIKIŞ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lg = new login();
				lg.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(555, 24, 135, 32);
		contentPane.add(btnNewButton);
	
	}
}
