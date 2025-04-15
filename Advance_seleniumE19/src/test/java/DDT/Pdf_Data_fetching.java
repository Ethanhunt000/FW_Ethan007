package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Pdf_Data_fetching {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
                 File file= new File("./src/test/resources/Nikhil Resume (1).pdf");
                 
                 PDDocument doc=PDDocument.load(file);
                 int pages=doc.getNumberOfPages();
                 System.out.println(pages);
                 
                 PDFTextStripper pdfData=new PDFTextStripper();
                 String readData = pdfData.getText(doc);
                 System.out.println(readData);
	}

}
