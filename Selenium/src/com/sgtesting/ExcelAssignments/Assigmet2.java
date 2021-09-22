package com.sgtesting.ExcelAssignments;




import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assigmet2
  {
	public static void main(String[] args) {
		createAndWrite2();

	}
	static void createAndWrite2()
	{
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		FileOutputStream fout = null;
		
		try {
				
			String strArr[][] = {{""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {"Fruit1", "Fruit2", "Fruit3", "Fruit4", "Fruit5", "Fruit6", "Fruit7", "Fruit8", "Fruit9", "Fruit10", "Fruit11", "Fruit12", "Fruit13", "Fruit14", "Fruit15", "Fruit16", "Fruit17", "Fruit18", "Fruit19", "Fruit20"}};
		
			wb = new XSSFWorkbook();
			sh = wb.createSheet("TestData");

			for(int i=0; i<strArr.length; i++)
			{
				row = sh.createRow(i);

				for(int j=0; j<strArr[i].length; j++)
				{
						cell = row.createCell(j);
						cell.setCellValue(strArr[i][j]);

					
				}
			}

			fout = new FileOutputStream("C:\\Users\\Swapna\\Desktop\\Excel.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fout.flush();
				fout.close();
				fout = null;
				cell = null;
				row = null;
				sh = null;
				wb.close();
				wb = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}