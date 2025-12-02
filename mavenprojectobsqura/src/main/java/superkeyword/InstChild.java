package superkeyword;

public class InstChild extends SuperInstP
{
	String insc= "Child";
	
	public void printText()
	{
		System.out.println(super.inst);
		System.out.println(insc);
	}
	
	public static void main(String[] args) 
	{
		InstChild in =new InstChild();
		in.printText();
	}
}
