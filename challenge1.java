package safaricom;

import java.util.Scanner;

public class assuranceQuiz {
	public static void main(String[] args) {
		int n;
		int i;
		int x;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		if (n>=2 && n<20) {
			for(i=1; i<=10; i++) {
				x=n*i;
				System.out.println(+n+ "*" +i+ "=" +x);
			}
		}
		else {
			System.out.println("you are a failer");
		}
	}

}
