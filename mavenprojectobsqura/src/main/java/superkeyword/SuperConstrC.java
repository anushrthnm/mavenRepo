package superkeyword;

public class SuperConstrC extends SuperConstrP
{
	public SuperConstrC() 
  {
	super("parent");
	System.out.println("Child constructor");  
  }
	public static void main(String[] args) 
	{
		SuperConstrC con= new SuperConstrC();


	}

}
