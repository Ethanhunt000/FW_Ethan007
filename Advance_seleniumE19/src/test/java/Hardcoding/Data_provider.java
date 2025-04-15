package Hardcoding;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {


	
		
		
		@Test   (dataProvider="getData")
		public void bookTickets(String src,String dest)
		{
			System.out.println("Book Tickets from  "+src+ " to "+dest);
		}

		@DataProvider
		public Object[][] getData()
		{
			Object[][] objArr=new Object[3][2];
			objArr[0][0]="bng";
			objArr[0][1]="gdg";
			
			objArr[1][0]="bng";
			objArr[1][1]="mys";
			
			objArr[2][0]="bng";
			objArr[2][1]="HBL";
			return objArr;
		}
	}


