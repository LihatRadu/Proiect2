package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 370);
		setTitle("Magazin Alimentar");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMagazin = new JLabel("Magazin Alimentar");
		lblMagazin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMagazin.setBounds(250, 20, 226, 41);
		contentPane.add(lblMagazin);
		
		JButton btnCumpara = new JButton("Cumpara");
		btnCumpara.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCumpara.setBounds(44, 212, 108, 21);
		btnCumpara.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				CumparaWindow cw = new CumparaWindow();
				cw.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnCumpara);
		
		JButton btnReturneaza = new JButton("Returneaza");
		btnReturneaza.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnReturneaza.setBounds(289, 212, 103, 21);
		btnReturneaza.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CumparaWindow rw = new CumparaWindow();
				rw.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnReturneaza);
		
		JButton btnPleaca = new JButton("Pleaca");
		btnPleaca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPleaca.setBounds(552, 212, 85, 21);
		btnPleaca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null,"Esti sigur?","Pleaca", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				return;
			}
		});
		contentPane.add(btnPleaca);
	}

}
