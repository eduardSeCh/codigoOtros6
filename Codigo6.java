import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in); //Crear el main
		int[] n = new int[20]; //falto inicializarlo
		
		for (int i = 0; i < 20; i++) { //Falto un más
			n[i] = (int)(Math.random() * 381) + 20;
			System.out.print(n[i] + " "); //Falto el out en el System.out.print
		}
		
		System.out.println("\n¿Qué números quiere resaltar? "); //falto poner correctamente el println
		System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		int opcion = Integer.parseInt(sc.nextLine()); //Cambiar correctamente por un scanner.nextLine()
		
		int multiplo = (opcion == 1) ? 5 : 7; //Corregir el if 
		
		for (int e : n) {//Cambiar el  char a int
			if (e % multiplo == 0) {
				System.out.print("[" + e + "] ");
			}//Cambiar de lugar el parentesis del if
				else {
					System.out.print(e + " "); //Es out no in
				}
		}
	}

}
