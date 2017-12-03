import java.util.Scanner;
public class Zadanie_4_2 {

	public static void main(String[] args) {
		
		System.out.println("Podaj ci¹g znaków do wyœwietlenia od koñca: ");
		int i, k=0;
		Scanner odczyt = new Scanner(System.in);
		
		String wyraz = odczyt.nextLine();
		
		for (i=0; i<wyraz.length(); ++i) {
			System.out.print(wyraz.charAt(wyraz.length()-i-1));
		}
		

	}

}
