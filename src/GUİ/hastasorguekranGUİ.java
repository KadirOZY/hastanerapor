package GUİ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;

import code.hastasorgu;
import code.hastasorguekran;
import helper.DBConnecter;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hastasorguekranGUİ extends JFrame {
	private DBConnecter conn = new DBConnecter();
	Connection con = conn.connDB();
	static hastasorguekran hastasorguekranGUİ = new hastasorguekran() ;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField hsadtext;
	private JTextField hstctext;
	private JTextField hstanibtext;
	private JTextField hstanidtext;
	private JTextField hstarihtext;
	private JTextField hsdosyatext;
	private JTextField hsonaydtext;
	private JTextField hsonayltext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hastasorguekranGUİ frame = new hastasorguekranGUİ(hastasorguekranGUİ);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param hastasorguGUİ2 
	 */
	public hastasorguekranGUİ(hastasorguekran hastasorguekranGUİ2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(10, 11, 700, 438);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Ad-Soyad :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel.setBounds(26, 24, 169, 32);
		contentPane_1.add(lblNewLabel);
		
		hsadtext = new JTextField();
		hsadtext.setText((String) null);
		hsadtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hsadtext.setEnabled(false);
		hsadtext.setColumns(10);
		hsadtext.setBounds(261, 24, 281, 32);
		contentPane_1.add(hsadtext);
		hsadtext.setText(hastasorguekranGUİ2.getName());
		
		JLabel lblKimlikNumaras = new JLabel("Kimlik Numarası :");
		lblKimlikNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblKimlikNumaras.setBounds(26, 73, 169, 32);
		contentPane_1.add(lblKimlikNumaras);
		
		hstctext = new JTextField();
		hstctext.setText((String) null);
		hstctext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hstctext.setEnabled(false);
		hstctext.setColumns(10);
		hstctext.setBounds(261, 77, 281, 32);
		contentPane_1.add(hstctext);
		hstctext.setText(hastasorguekranGUİ2.getTcno());
		
		JLabel lblTanBal = new JLabel("Tanı Başlığı");
		lblTanBal.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanBal.setBounds(26, 120, 169, 32);
		contentPane_1.add(lblTanBal);
		
		hstanibtext = new JTextField();
		hstanibtext.setText((String) null);
		hstanibtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hstanibtext.setEnabled(false);
		hstanibtext.setColumns(10);
		hstanibtext.setBounds(261, 120, 281, 32);
		contentPane_1.add(hstanibtext);
		hstanibtext.setText(hastasorguekranGUİ2.getTanibasligi());
		
		JLabel lblTanDetay = new JLabel("Tanı Detayı :");
		lblTanDetay.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanDetay.setBounds(26, 169, 169, 32);
		contentPane_1.add(lblTanDetay);
		
		hstanidtext = new JTextField();
		hstanidtext.setText((String) null);
		hstanidtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hstanidtext.setEnabled(false);
		hstanidtext.setColumns(10);
		hstanidtext.setBounds(261, 173, 281, 82);
		contentPane_1.add(hstanidtext);
		hstanidtext.setText(hastasorguekranGUİ2.getTanidetay());
		
		JLabel lblTarih = new JLabel("Tarih");
		lblTarih.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTarih.setBounds(26, 268, 169, 32);
		contentPane_1.add(lblTarih);
		
		hstarihtext = new JTextField();
		hstarihtext.setText((String) null);
		hstarihtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hstarihtext.setEnabled(false);
		hstarihtext.setColumns(10);
		hstarihtext.setBounds(261, 266, 281, 32);
		contentPane_1.add(hstarihtext);
		hstarihtext.setText(hastasorguekranGUİ2.getTarih());
		
		JLabel lblDosyaNumaras = new JLabel("Dosya Numarası :");
		lblDosyaNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblDosyaNumaras.setBounds(26, 311, 169, 32);
		contentPane_1.add(lblDosyaNumaras);
		
		hsdosyatext = new JTextField();
		hsdosyatext.setText((String) null);
		hsdosyatext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hsdosyatext.setEnabled(false);
		hsdosyatext.setColumns(10);
		hsdosyatext.setBounds(261, 309, 281, 32);
		contentPane_1.add(hsdosyatext);
		hsdosyatext.setText(hastasorguekranGUİ2.getDosyanumara());
		
		JLabel lblOnaylayanDoktor = new JLabel("Onaylayan Doktor :");
		lblOnaylayanDoktor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanDoktor.setBounds(26, 354, 169, 32);
		contentPane_1.add(lblOnaylayanDoktor);
		
		hsonaydtext = new JTextField();
		hsonaydtext.setText((String) null);
		hsonaydtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hsonaydtext.setEnabled(false);
		hsonaydtext.setColumns(10);
		hsonaydtext.setBounds(261, 352, 281, 32);
		contentPane_1.add(hsonaydtext);
		hsonaydtext.setText(hastasorguekranGUİ2.getVerendoktor());
		
		JLabel lblOnaylayanLaboratuvar = new JLabel("Onaylayan Laboratuvar :");
		lblOnaylayanLaboratuvar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanLaboratuvar.setBounds(26, 391, 195, 32);
		contentPane_1.add(lblOnaylayanLaboratuvar);
		
		hsonayltext = new JTextField();
		hsonayltext.setText((String) null);
		hsonayltext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		hsonayltext.setEnabled(false);
		hsonayltext.setColumns(10);
		hsonayltext.setBounds(261, 395, 281, 32);
		contentPane_1.add(hsonayltext);
		hsonayltext.setText(hastasorguekranGUİ2.getVerenlab());
		
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
		contentPane_1.add(btnNewButton);
	}

}
