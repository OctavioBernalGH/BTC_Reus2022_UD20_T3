<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicio UD20 T03</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br>
Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)
  
  <p align="justify">En este ejercicio hay que crear una aplicación grafica mediante JFrameForm con una ventana que tenga dos etiquetas de texto y dos botones de operación. El comportamiento de la aplicación debe reflejar en las etiquetas de texto el número de veces que el usuario presiona ambos botones. Dicho de otra forma, las labels son contadores de las veces que el usuario presiona los botones.</p>
  
<p align="justify">En este ejercicio se realizan una série de mejoras, se eliminan las label y se añade el código de modificación de label en el propio botón, cuando se presionen los botones se mostrará el contador en ellos. En la siguiente imagen se muestra el funcionamiento y una breve descripción.</p>

![UD20-T3](https://user-images.githubusercontent.com/103035621/167312181-086f15ba-d2de-4288-90b8-6c1b1e130e97.png)

<p align="justify">Para realizar este ejercicio se han creado dos clases, la clase App.java y la clase TA3.java. La primera clase contiene el código de llamada de la vista y la segunda clase hace referencia a la vista de la aplicación.</p>

Se otorga visibilidad al Frame TA3 mediante la sentencia ta3.setVisible(true); importada de la clase TA3.

<details>
  <summary>En este spoiler se muestra el código creado en la Clase App.java</summary>
<br>

  ```java
package com.dou.ud20.t3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        TA3 ta3 = new TA3();
        ta3.setVisible(true);
        
    }
}
  ```
 </details>

El siguiente código corresponde a la vista, en el se definen sus componentes las acciones que han de realizar mediante los actionListener.

<details>
  <summary>En este spoiler se muestra el código creado en la Clase TA3.java</summary>
<br>

  ```java
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

  ```
 </details>
