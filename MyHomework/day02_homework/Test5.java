public class Test5 {

	public static void main(String[] args) {

		int a=20,b=20;
		boolean bo=((++a%3)==0)&&((a++%7)==0);

		System.out.println("bo��ֵ:"+bo);
		System.out.println("a��ֵ:"+a);

		System.out.println("------------");

		boolean bo2=b++%3==3&&++b%7==0;
		System.out.println("bo2��ֵ:"+bo2);
		System.out.println("b��ֵ:"+b);

	}

}