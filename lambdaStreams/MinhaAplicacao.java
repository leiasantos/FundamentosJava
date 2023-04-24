package lambdaStreams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MinhaAplicacao {
	
	public static void main(String args[]) {
		
		MeuObjeto o = new MeuObjeto();
		o.metodoDoObjeto(new MinhaInterface() {
			public void metodoInterface() {
				System.out.println("Metodo da interface executando");
			}
			
		});
		
		System.out.println("Fim do programa");
		
		JButton btn = new JButton();
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão apertado");
				
			}
		});
		
		
	}
}
