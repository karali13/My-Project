package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramaterization {
	
	public static String getExcelData(int row,int cell,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\shimp\\OneDrive\\Desktop\\Study\\xcl\\testcase.xlsx");
		String value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;

	}

}
