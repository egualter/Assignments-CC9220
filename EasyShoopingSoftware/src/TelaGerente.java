import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class TelaGerente extends JFrame implements ActionListener {
	
	JButton btnEstoque		= new JButton("Estoque");
	JButton btnFuncionario 	= new JButton("Funcion�rio");
	JButton btnFinanceiro 	= new JButton("Relat�rio Financeiro");
	JButton btnLogoff 		= new JButton("Logoff");
	
	JLabel rVazio1 		= new JLabel("");
	JLabel rVazio2 		= new JLabel("");
	
	public TelaGerente() {
		
		Container windows = getContentPane();
		windows.setLayout(new GridLayout(3, 2));
		
		btnEstoque.addActionListener(this);
		btnFuncionario.addActionListener(this);
		btnFinanceiro.addActionListener(this);
		btnLogoff.addActionListener(this);
		
		windows.add(rVazio1);
		windows.add(rVazio2);
		windows.add(btnEstoque);
		windows.add(btnFinanceiro);
		windows.add(btnFuncionario);
		windows.add(btnLogoff);
		
		TelaEstoque telaEstoque 		= new TelaEstoque();
		TelaFuncionario telaFuncionario = new TelaFuncionario();
		
		setTitle("Tela Principal - Gerente");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	public void actionPerformed(ActionEvent evento) {

		if (evento.getSource() == btnEstoque) {
			TelaEstoque.open();
			
		} else if (evento.getSource() == btnFuncionario) {
			TelaFuncionario.open();
		   	
		} else if (evento.getSource() == btnFinanceiro) {
			
		} else if (evento.getSource() == btnLogoff) {
			
		}
	}
	
	public static void main(String args[]) {
		TelaGerente telaGerente = new TelaGerente();
	}

}