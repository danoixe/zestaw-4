import java.util.Scanner;
public class Zadanie_4_1 {

	public static void main(String[] args) {
		
		int i, k=0;
		Scanner odczyt = new Scanner(System.in);
		
		String wyraz = odczyt.nextLine();
		
		char ostatni = wyraz.charAt(wyraz.length()-1);
		
		for (i=0; i<wyraz.length(); i++) {
			if (wyraz.charAt(i)==ostatni) {
				k++;
			}
		}
		
		System.out.println("Ostatni znak wystêpuje "+k+" razy");
	}

}
