package superkeyword;

public class SuperMethodC extends SupermethodP 
{
	public void printChilMethod()
	{
		System.out.println("Child");
		super.printParMethod();
	}
	
	public static void main(String[] args) 
	{
		SuperMethodC meth= new SuperMethodC();
		meth.printChilMethod();
	}

}
