package main;

import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

import com.mx.javagu.Robotic;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		Robotic arturito = null;
		try {
			arturito = new Robotic();
		} catch (AWTException e) {
			e.printStackTrace();
			System.exit(1);
		}
		arturito.setName("Arturito");
		System.out.println(arturito);
		
		JOptionPane.showMessageDialog(null, "Hola!, Soy "+arturito.getName() +" y empezare mi trabajo \n Te dare 10 segundos para que te posiciones" );
		// POSICIONARSE
		String iterations = JOptionPane.showInputDialog("Cuantas fotos seran?");

		int iterracciones = Integer.parseInt(iterations);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		for (i = 0; i < iterracciones; i++) {

			arturito.mousePress(InputEvent.BUTTON3_MASK);
			arturito.mouseRelease(InputEvent.BUTTON3_MASK);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Presionare abajo");
			arturito.keyPress(KeyEvent.VK_DOWN);
			arturito.keyRelease(KeyEvent.VK_DOWN);

			System.out.println("Presionare abajo");
			arturito.keyPress(KeyEvent.VK_DOWN);
			arturito.keyRelease(KeyEvent.VK_DOWN);

			System.out.println("Presionare enter");
			arturito.keyPress(KeyEvent.VK_ENTER);
			arturito.keyRelease(KeyEvent.VK_ENTER);

			// ABRIRA VENTANA PARA GUARDAR

			/* AQUI PODRIA HACER UN CONTROL C, ABRIR BLOC DE NOTAS */

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Presionare enter");
			arturito.keyPress(KeyEvent.VK_ENTER);
			arturito.keyRelease(KeyEvent.VK_ENTER);

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// GUARDE!!!
			
			System.out.println("Iteraccion numero: "+ i);
			
			System.out.println("Presionare derecha");
			arturito.keyPress(KeyEvent.VK_RIGHT);
			arturito.keyRelease(KeyEvent.VK_RIGHT);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(null, "Termine, fueron "+ i +"iteracciones");
	}

}
