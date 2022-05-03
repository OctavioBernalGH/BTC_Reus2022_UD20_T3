package com.dou.ud20.t3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TA3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TA3 frame = new TA3();
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
	public TA3() {
		setTitle("Contador de Clicks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 261, 112);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnBoton1 = new JButton("Boton 1");
		btnBoton1.addActionListener(new ActionListener() {
			// Creamos un contador
			private int count = 0;

			public void actionPerformed(ActionEvent e) {
				// Sumamos contador
				count++;

				//Al hacer click se suma un numero al boton al contador
				String clicksBtn1 = String.valueOf(count);
				btnBoton1.setText(clicksBtn1);

			}
		});
		btnBoton1.setBounds(27, 23, 89, 23);
		contentPane.add(btnBoton1);

		JButton btnBoton2 = new JButton("Boton 2");
		btnBoton2.addActionListener(new ActionListener() {

			// Creamos un contador
			private int count = 0;
			public void actionPerformed(ActionEvent e) {
				// Sumamos contador
				count++;

				//Al hacer click se suma un numero al boton al contador
				String clicksBtn2 = String.valueOf(count);
				btnBoton2.setText(clicksBtn2);
			}
		});
		btnBoton2.setBounds(140, 23, 89, 23);
		contentPane.add(btnBoton2);
	}
}
