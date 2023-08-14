package view;

import javax.swing.*;

import controller.SomatorioNumeros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		
		SomatorioNumeros sum = new SomatorioNumeros();
		
		int res = sum.FRecursivaNatural(Num);
		
		System.out.println("Valor: "+res);
	}

}
