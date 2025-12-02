package inheritance;

public class HierarchC1 extends HierarchP
{
	public void Child1High()
	  {
		 System.out.println("Hierarchial child1");
	  }
	public void Child1()
	  {
		 System.out.println("I am child1");
	  }
	
	public static void main(String[] args)
	{
		HierarchC1 c1= new HierarchC1();
		c1.Child1High();
		c1.parentHigh();
	}
}
