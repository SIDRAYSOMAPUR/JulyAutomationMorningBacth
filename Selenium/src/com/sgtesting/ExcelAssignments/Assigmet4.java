package com.sgtesting.ExcelAssignments;






import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assigmet4
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
				
			String strArr[][] = {{"Jan"}, {"", "Feb"}, {"","","March"},{"","","", "April"},{"","","","", "May"}, {"","","","","","Jun"}, {"","","","","","","July"},{"","","","","","","","Aug"}, {"","","","","","","","","Sept"},{"","","","","","","","","","Oct"}, {"","","","","","","","","","","nov"},{"","","","","","","","","","","", "Dec"}};
		
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
