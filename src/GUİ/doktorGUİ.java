package GUİ;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import code.Doktor;
import helper.DBConnecter;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class doktorGUİ extends JFrame {
	private DBConnecter conn = new DBConnecter();
	static Doktor doktorGUİ = new Doktor();
	Connection con = conn.connDB();
	Statement st = null;
	ResultSet rs = null;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doktorGUİ frame = new doktorGUİ(doktorGUİ);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public doktorGUİ(Doktor doktorGUİ2) {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hoşgeldiniz , Sayın "+doktorGUİ2.getName());
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 31, 575, 53);
		contentPane.add(lblNewLabel);
		
		JButton lab1 = new JButton("HASTA EKLE");
		lab1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lab1GUİ lb1 = new lab1GUİ(null);
					lb1.setVisible(true);
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		lab1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lab1.setBounds(22, 282, 316, 66);
		contentPane.add(lab1);
		
		JButton lab2 = new JButton("HASTA SORGULAMA");
		lab2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hastasorguGuii hastasGUİ = new hastasorguGuii();
				hastasGUİ.setVisible(true);
				dispose();
			}
		});
		lab2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lab2.setBounds(22, 381, 316, 66);
		contentPane.add(lab2);
		
		JButton btnVeriGncelleme = new JButton("VERİ GÜNCELLEME");
		btnVeriGncelleme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				veriguncelekranGUİ vsGUİ = new veriguncelekranGUİ();
				vsGUİ.setVisible(true);
				dispose();
			}
		});
		btnVeriGncelleme.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnVeriGncelleme.setBounds(22, 182, 316, 66);
		contentPane.add(btnVeriGncelleme);
		
		JButton btnNewButton = new JButton("ÇIKIŞ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lg = new login();
				lg.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(437, 381, 203, 58);
		contentPane.add(btnNewButton);
	}
}
