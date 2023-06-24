package paq1;

public class Clas2 {
	
	int x = 0;
	int y = 0;
	byte mat;
	char matrix[][];
	
	public Clas2 (byte mat, char matrix [][]) {
		this.mat = mat;
		this.matrix = matrix;
	}
		
	public void Arriba () {
		System.out.println("el objeto se dirijio hacia arriba");
		y += -1;
		System.out.println("                       "+"x,y");
		System.out.println("y esta en la posicion: "+x+","+y);
		System.out.println("");
	}
	
	public void Abajo () {
		System.out.println("el objeto se dirijio hacia abajo");
		y += 1;
		System.out.println("                       "+"x,y");
		System.out.println("y esta en la posicion: "+x+","+y);
		System.out.println("");
	}
	
	public void Izquierda () {
		System.out.println("el objeto se dirijio hacia la izquierda");
		x += -1;
		System.out.println("                       "+"x,y");
		System.out.println("y esta en la posicion: "+x+","+y);
		System.out.println("");
	}
	
	public void Derecha () {
		System.out.println("el objeto se dirijio hacia la derecha");
		x += 1;
		System.out.println("                       "+"x,y");
		System.out.println("y esta en la posicion: "+x+","+y);
		System.out.println("");
	}
	
	public void Imprimir () {
		for (byte i=0; i<mat; i++) {
			for (byte j=0; j<mat; j++ ) {
				if ((i==y) && (j==x)) {
					matrix[i][j] = '0';
				}else {
					matrix[i][j] = '*';
				}
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	
}