
//import java.util.Scanner;

public class HelloJava 
{
	public static void ExceptionTest()
	{
		try
		{
			System.out.println("Hello Exception");
//			int s = 10 / 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
// 01 Test
//		for (int i = 0; i < 5; ++i)
//		{
//			System.out.println("Hello Java");
//			System.out.println("Hello Java1");
//			System.out.println("Hello Java2");			
//		}
// 02 Test local class		
//		DataTest dc = new DataTest();
//		System.out.println("price:" + dc.price);
//		System.out.println("name:" + dc.name);
//		System.out.println("num:" + dc.num);
//		
//		DataTest1 dc1 = new DataTest1();
//		System.out.println("dc1 price:" + dc1.price);
		
// 03 Test Exception
//		ExceptionTest();
		
// 04 Test Input
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please input num1");
//		double dInputvalue1 = input.nextDouble();
//		System.out.println("input value1: " + dInputvalue1);
//		double dInputvalue2 = input.nextDouble();
//		System.out.println("input value1: " + dInputvalue2);
		
// 05 Test Thread
//		ThreadTest threadInst = new ThreadTest();
//		threadInst.start();
//		
//		System.out.println("running over");
	}
}
