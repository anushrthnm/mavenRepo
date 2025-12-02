package inheritance;

public class HierarchC2 extends HierarchP 
{
	public void Child2High()
	  {
		 System.out.println("Hierarchial child2");
	  }
	public void Child2()
	  {
		 System.out.println("I am child2");
	  }

	public static void main(String[] args) 
	{
		HierarchC2 c2= new HierarchC2();
		c2.Child2High();
		c2.parentHigh();

	}

}
