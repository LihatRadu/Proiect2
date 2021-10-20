package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JOptionPane;

import java.awt.Panel;
import java.awt.List;
import java.awt.Button;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Color;

public class CumparaWindow extends JFrame {

	private JPanel contentPane;
	private ArrayList<String> listaProduse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CumparaWindow frame = new CumparaWindow();
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
	public CumparaWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 382);
		setTitle("Lista alimente");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(47, 91, 646, 194);
		contentPane.add(list);
		
		JButton btnAdauga = new JButton("Adauga");
		btnAdauga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showInputDialog(null,"")
				DefaultListModel dl = new DefaultListModel();
				dl.addElement("Paine");
				dl.addElement("Mozzarela");
				dl.addElement("Pepsi");
				dl.addElement("Lapte");
				list.setModel(dl);
			}
		});
		/*listaProduse.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void schimbare(ListSelectionEvent e) {
				//
			}
		});*/
		btnAdauga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdauga.setBounds(86, 314, 85, 21);
		contentPane.add(btnAdauga);
		
		JButton btnScoate = new JButton("Scoate");
		btnScoate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnScoate.setBounds(511, 314, 85, 21);
		btnScoate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null,"Esti sigur ca doresti sa scoti produsele?","Scoate produsele",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				DefaultListModel dl = new DefaultListModel();
				dl.removeElement("Paine");
				dl.removeElement("Mozzarela");
				dl.removeElement("Pepsi");
				dl.removeElement("Lapte");
				list.setModel(dl);;
			}
		});
		contentPane.add(btnScoate);
		
		JLabel lblAlimente = new JLabel("Alimente");
		lblAlimente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAlimente.setBounds(291, 10, 134, 36);
		contentPane.add(lblAlimente);
		
		JButton btnIntoarcere = new JButton("Intoarcere");
		btnIntoarcere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow mw = new MainWindow();
				mw.setVisible(true);
				dispose();
			}
		});
		btnIntoarcere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIntoarcere.setBounds(273, 314, 112, 21);
		contentPane.add(btnIntoarcere);
		
	}
}
