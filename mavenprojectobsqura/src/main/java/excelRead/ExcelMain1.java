package excelRead;

import java.io.IOException;

public class ExcelMain1 
{
	public static void main(String[] args) throws IOException 
	{
        System.out.println(Excel1.getStringData(0, 0));
        System.out.println(Excel1.getIntegerData(1, 1));
	}
}
