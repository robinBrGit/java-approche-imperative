import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbUtil = 0;
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Entrer un nombre ");
		nbUtil = scanner.nextInt();
		int res = 0;
		for(int i = 1;i<=10;i++) {
				res = nbUtil+i;
				System.out.println(res);
		}
	
		scanner.close();
	}

}
