public class Test9 {

	public static void main(String[] args) {

		int year=2000;
		boolean isLeap=(year%4==0)&&(year%100!=0)||(year%400==0);
		System.out.println(year+(isLeap?"是闰年":"不是闰年"));

	}

}