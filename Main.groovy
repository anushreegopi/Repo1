package Qn2
import java.util.Scanner
class Main
 {

	static void main(args)
 {
	try
	{
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in)
		println("enter first integer")
		int a = obj.nextInt()
		println("enter second integer")
		int b = obj.nextInt()
		int c = a/b
		println("a divided by b is:" +c)
	}
	catch(ArithmeticException e) 
	{
		println("Error:" +e)
	}
 }
	
}
