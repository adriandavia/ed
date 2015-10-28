import java.util.*;
public class HolaMundo{
	public static void main(String[] args) {
		System.out.print("Introduce tu nombre: ");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		
		System.out.printf("Hola %s desde eclipse", nombre);

	}

}
