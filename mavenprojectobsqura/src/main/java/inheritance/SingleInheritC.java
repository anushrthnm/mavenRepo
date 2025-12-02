package inheritance;

public class SingleInheritC extends SingleInheritP{

	public void writec()
	{
		System.out.println("Child writes");
	}
	
	public void drawc()
	{
		System.out.println("Child draws");
	}
	
	public static void main(String[] args) 
	{
		SingleInheritC obj=new SingleInheritC();
		obj.draw();
		obj.drawc();
        obj.write();
        obj.writec();
	}

}
