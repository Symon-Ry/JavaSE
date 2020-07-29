public class Test7 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;

		System.out.println("交换前a="+a);
		System.out.println("交换前b="+b);
		System.out.println();

		temp=a;
		a=b;
		b=temp;

		System.out.println("交换后a="+a);
		System.out.println("交换后b="+b);
	}

}