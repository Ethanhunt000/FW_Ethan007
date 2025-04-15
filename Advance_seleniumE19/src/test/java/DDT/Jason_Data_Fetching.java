package DDT;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jason_Data_Fetching {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("./src/test/resources/JasonData.jason.txt");
		ObjectMapper Obj=new ObjectMapper();
		JsonNode data=Obj.readTree(file);
		
		String BROSWER=data.get("broswer").asText();
		
		

	}

}
