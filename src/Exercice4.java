import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbUtil = 0;
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Entrer un nombre entre 1 et 10");
		nbUtil = scanner.nextInt();
		int res = 0;
		if(nbUtil > 0 && nbUtil <= 10) {
			for(int i = 1;i<=10;i++) {
				res = nbUtil*i;
				System.out.println(nbUtil+"*"+i+"="+res);
			}
		}
		scanner.close();
	}

}
