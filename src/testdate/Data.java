package testdate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class Data {
	public String firstName= "varsha";
	public void writeExcel(int rowNo, int cellNo, String input) {

		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try
		{

			File f = new File("C:\\Users\\maswa\\Desktop\\varsha-training\\varsha.xlsx");
			fis = new FileInputStream(f);
			XSSFWorkbook excel = new XSSFWorkbookFactory().create(fis);
			XSSFSheet sheet = excel.getSheet("Sheet1"); 
			XSSFCell cell= sheet.getRow(rowNo).getCell(cellNo, MissingCellPolicy.CREATE_NULL_AS_BLANK);
			cell.setCellValue(input);
			fis.close();
			fos = new FileOutputStream(f);
			excel.write(fos);
		} catch (Exception e) {
			System.out.println("got an error"+e.getLocalizedMessage());
		} finally {
			if (null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public String readexcel (int rowNo, int cellNo) {
		String input = "BLANK";

		try {

			File f = new File("C:\\Users\\maswa\\Desktop\\varsha-training\\varsha.xlsx");
			try (XSSFWorkbook excel = new XSSFWorkbook(f)) {
				XSSFSheet sheet = excel.getSheet("Sheet1"); 
				XSSFCell cell= sheet.getRow(rowNo).getCell(cellNo);
				input = cell.getStringCellValue();
			} 
			return input;

		} catch (Exception e) {
			System.out.println("got an error from read Excel: "+e.getLocalizedMessage());
		} 
		return input;


	}
}
