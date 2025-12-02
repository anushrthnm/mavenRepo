package inheritance;

public class MultiLevelC extends MultiLevelP
{
	public void childsings()
	 {
		 System.out.println("Child sings");
	 }

	public static void main(String[] args) 
	{
		MultiLevelC inh= new MultiLevelC();
		inh.grandsings();
		inh.parentsings();
		inh.childsings();
	}

}
