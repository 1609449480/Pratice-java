package j1;
import java.util.Scanner;

public class testif {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������");
		int a = scanner.nextInt();
		if(a > 60) {
			System.out.println("����");
		}else if(a > 40) {
			System.out.println("������");
		}else if(a> 10) {
			System.out.println("������");
		}else {
			System.out.println("��ͨ");
		}
		
		
		
	}

}
