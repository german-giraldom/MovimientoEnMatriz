package paq1;

import javax.swing.JOptionPane;

public class Clas1 {
	public static void main(String[] args) {
		
		Clas2 obj1;
		
		byte mat = Byte.parseByte(JOptionPane.showInputDialog("inserte el tamaño del tablero cuadrado"));
		char matrix[][] = new char[mat][mat];
		char entrada = ' ';
		
		JOptionPane.showMessageDialog(null, " Movimientos"
										+ "\n w. arriba"
										+ "\n s. abajo"
										+ "\n a. izquierda"
										+ "\n d. derecha \n"
										+ "\n nota: 0 para salir");
		
		obj1 = new Clas2(mat,matrix);
		
		obj1.Imprimir();
				
		do {
			entrada = JOptionPane.showInputDialog("digite una direccion").charAt(0);
			
			switch (entrada) {
				case 'w':
					obj1.Arriba();
					obj1.Imprimir();
					break;
					
				case 's':
					obj1.Abajo();
					obj1.Imprimir();
					break;
					
				case 'a':
					obj1.Izquierda();
					obj1.Imprimir();
					break;
					
				case 'd':
					obj1.Derecha();
					obj1.Imprimir();
					break;
			}
			
		}while (entrada != '0');
		
		System.out.println("");
		System.out.println("fin del juego");
	}
}