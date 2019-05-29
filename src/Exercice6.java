import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbUtil = 0;
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Entrer un nombre entre 1 et 10");
		nbUtil = scanner.nextInt();
		boolean nbCorrect = false;
		while(nbCorrect == false) {
			if(nbUtil > 0 && nbUtil <= 10) {
				System.out.println(nbUtil);
				nbCorrect = true;
			}
			else {
				System.out.println("Entrer un nombre entre 1 et 10");
				nbUtil = scanner.nextInt();
		}
		}
		scanner.close();
	}

}
