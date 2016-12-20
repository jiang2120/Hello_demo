import java.util.Scanner;

public class Num {
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n2;
		n2 = n1.nextInt();
		for (int n3 = 1; n3 < n2; n3++) {
			if (n2 % n3 == 0) {
				System.out.println(n3);
			}
		}
		// System.out.println(n2);
	}

}
