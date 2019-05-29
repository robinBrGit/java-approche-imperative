import java.util.Scanner;

public class Exercice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Entrer 10 nombre");
		for(int i=0;i<10;i++) {
			array[i] = scanner.nextInt();
		}
		int max = array[0];
		for(int i=1;i<10;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println(max);
		scanner.close();
	}
		

}
