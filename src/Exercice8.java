import java.util.Scanner;

public class Exercice8 {

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
			else if(nbUtil>10){
				System.out.println("Ce nombre est trop grand,\r\n" + 
						"veuillez recommencer");
				nbUtil = scanner.nextInt();
			}
			else if(nbUtil<1) {
				System.out.println("Ce nombre est trop petit,\r\n" + 
						"veuillez recommencer");
				nbUtil = scanner.nextInt();
			}
		}
		scanner.close();
	}

}
