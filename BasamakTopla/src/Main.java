import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int counter=0,total=0;
		int num,kalan;
		Scanner deger = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz: ");
		num=deger.nextInt();
		
		int tempnum=num;
		while(tempnum!=0) {
			tempnum=tempnum/10;
			counter++;
		}
		tempnum=num;
	while(counter!=0) {
		kalan=tempnum%10;
		counter--;
		tempnum=tempnum/10;
		total=kalan+total;
	}
	System.out.println(total);
	}

}
