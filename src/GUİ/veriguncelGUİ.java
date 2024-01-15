package GUİ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import code.veriguncel;
import helper.DBConnecter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class veriguncelGUİ extends JFrame {
	private DBConnecter conn = new DBConnecter();
	Connection con = conn.connDB();
	static veriguncel veriguncelGUİ = new veriguncel();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField newadtext;
	private JTextField newtctext;
	private JTextField newtanibtext;
	private JTextField newtanidtext;
	private JTextField newtarihtext;
	private JTextField newdosyatext;
	private JTextField newondoktext;
	private JTextField newonlabtext;
	private JButton btnNewButton;
	protected PreparedStatement preparedStatement;
	private JButton btnk;
	private JLabel lblNewLabel_1;
	private JTextField siltctext;
	private JButton btnSil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					veriguncelGUİ frame = new veriguncelGUİ(veriguncelGUİ);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param veriguncelGUİ2 
	 */
	public veriguncelGUİ(veriguncel veriguncelGUİ2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ad-Soyad :");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel.setBounds(45, 11, 169, 32);
		contentPane.add(lblNewLabel);
		
		newadtext = new JTextField();
		newadtext.setText((String) null);
		newadtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newadtext.setColumns(10);
		newadtext.setBounds(280, 11, 281, 32);
		contentPane.add(newadtext);
		newadtext.setText(veriguncelGUİ2.getName());
		
		JLabel lblKimlikNumaras = new JLabel("Kimlik Numarası :");
		lblKimlikNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblKimlikNumaras.setBounds(45, 60, 169, 32);
		contentPane.add(lblKimlikNumaras);
		
		newtctext = new JTextField();
		newtctext.setEnabled(false);
		newtctext.setText((String) null);
		newtctext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newtctext.setColumns(10);
		newtctext.setBounds(280, 64, 281, 32);
		contentPane.add(newtctext);
		newtctext.setText(veriguncelGUİ2.getTcno());
		
		
		JLabel lblTanBal = new JLabel("Tanı Başlığı");
		lblTanBal.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanBal.setBounds(45, 107, 169, 32);
		contentPane.add(lblTanBal);
		
		newtanibtext = new JTextField();
		newtanibtext.setText((String) null);
		newtanibtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newtanibtext.setColumns(10);
		newtanibtext.setBounds(280, 107, 281, 32);
		contentPane.add(newtanibtext);
		newtanibtext.setText(veriguncelGUİ2.getTanibasligi());
		
		JLabel lblTanDetay = new JLabel("Tanı Detayı :");
		lblTanDetay.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTanDetay.setBounds(45, 156, 169, 32);
		contentPane.add(lblTanDetay);
		
		newtanidtext = new JTextField();
		newtanidtext.setText((String) null);
		newtanidtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newtanidtext.setColumns(10);
		newtanidtext.setBounds(280, 160, 281, 82);
		contentPane.add(newtanidtext);
		newtanidtext.setText(veriguncelGUİ2.getTanidetay());
		
		JLabel lblTarih = new JLabel("Tarih");
		lblTarih.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblTarih.setBounds(45, 255, 169, 32);
		contentPane.add(lblTarih);
		
		newtarihtext = new JTextField();
		newtarihtext.setText((String) null);
		newtarihtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newtarihtext.setColumns(10);
		newtarihtext.setBounds(280, 253, 281, 32);
		contentPane.add(newtarihtext);
		newtarihtext.setText(veriguncelGUİ2.getTarih());
		
		JLabel lblDosyaNumaras = new JLabel("Dosya Numarası :");
		lblDosyaNumaras.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblDosyaNumaras.setBounds(45, 298, 169, 32);
		contentPane.add(lblDosyaNumaras);
		
		newdosyatext = new JTextField();
		newdosyatext.setText((String) null);
		newdosyatext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newdosyatext.setColumns(10);
		newdosyatext.setBounds(280, 296, 281, 32);
		contentPane.add(newdosyatext);
		newdosyatext.setText(veriguncelGUİ2.getDosyanumara());
		
		JLabel lblOnaylayanDoktor = new JLabel("Onaylayan Doktor :");
		lblOnaylayanDoktor.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanDoktor.setBounds(45, 341, 169, 32);
		contentPane.add(lblOnaylayanDoktor);
		
		newondoktext = new JTextField();
		newondoktext.setText((String) null);
		newondoktext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newondoktext.setColumns(10);
		newondoktext.setBounds(280, 339, 281, 32);
		contentPane.add(newondoktext);
		newondoktext.setText(veriguncelGUİ2.getVerendoktor());
		
		JLabel lblOnaylayanLaboratuvar = new JLabel("Onaylayan Laboratuvar :");
		lblOnaylayanLaboratuvar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblOnaylayanLaboratuvar.setBounds(45, 378, 195, 32);
		contentPane.add(lblOnaylayanLaboratuvar);
		
		newonlabtext = new JTextField();
		newonlabtext.setText((String) null);
		newonlabtext.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		newonlabtext.setColumns(10);
		newonlabtext.setBounds(280, 382, 281, 32);
		contentPane.add(newonlabtext);
		newonlabtext.setText(veriguncelGUİ2.getVerenlab());
		
		btnNewButton = new JButton("GÜNCELLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					Connection con = conn.connDB();
					Statement st;
					
					String q= "UPDATE otomasyon SET name = ? ,tanidetay = ? , tarih=?,dosyanumara=?,verendoktor=?,verenlab=?,tanibasligi=? WHERE tcno = ?";
					st = con.createStatement();
					preparedStatement  = con.prepareStatement(q);
					preparedStatement.setString(1,newadtext.getText());
					preparedStatement.setString(2,newtanidtext.getText());
					preparedStatement.setString(3, newtarihtext.getText());
					preparedStatement.setString(4, newdosyatext.getText());
					preparedStatement.setString(5, newondoktext.getText());
					preparedStatement.setString(6,newonlabtext.getText() );
					preparedStatement.setString(7, newtanibtext.getText());
					preparedStatement.setString(8, newtctext.getText());
					preparedStatement.executeUpdate();
					newadtext.setText(" ");
					newtanidtext.setText(" ");	
					newtarihtext.setText(" ");
					newdosyatext.setText(" ");
					newondoktext.setText(" ");
					newonlabtext.setText(" ");
					newtanibtext.setText(" ");
					newtctext.setText(" ");
					JOptionPane.showMessageDialog(null,"Veriler Güncellenmiştir");
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(571, 379, 138, 36);
		contentPane.add(btnNewButton);
		
		btnk = new JButton("ÇIKIŞ");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lg = new login();
				lg.setVisible(true);
				dispose();
			}
		});
		btnk.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnk.setBounds(571, 335, 138, 36);
		contentPane.add(btnk);
		
		lblNewLabel_1 = new JLabel("TC giriniz :");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel_1.setBounds(571, 11, 153, 32);
		contentPane.add(lblNewLabel_1);
		
		siltctext = new JTextField();
		siltctext.setBounds(567, 63, 142, 32);
		contentPane.add(siltctext);
		siltctext.setColumns(10);
		
		btnSil = new JButton("SİL");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con = conn.connDB();
				Statement st;
				
				String query= "DELETE FROM otomasyon WHERE tcno = ?";
				try {
					st = con.createStatement();
					preparedStatement  = con.prepareStatement(query);
					preparedStatement.setString(1, newtctext.getText());
					preparedStatement.executeUpdate();
					newadtext.setText(" ");
					newtanidtext.setText(" ");	
					newtarihtext.setText(" ");
					newdosyatext.setText(" ");
					newondoktext.setText(" ");
					newonlabtext.setText(" ");
					newtanibtext.setText(" ");
					newtctext.setText(" ");
					JOptionPane.showMessageDialog(null,"Hasta silindi");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSil.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnSil.setBounds(571, 107, 138, 36);
		contentPane.add(btnSil);
	}
}
