package com.mx.javagu;

import java.awt.AWTException;
import java.awt.Robot;

public class Robotic extends Robot {

	private String name;

	public Robotic() throws AWTException {
		super();
	}

	public Robotic(String name) throws AWTException {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		if (name == null) {
			name = "No tengo nombre ='(";
			return "Nombre del robot = " + name;
		} else {
			return "Nombre del robot = Hola, me llamo: " + name;
		}
	}
}
