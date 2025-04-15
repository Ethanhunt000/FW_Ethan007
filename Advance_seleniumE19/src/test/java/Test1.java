import org.testng.annotations.Test;

public class Test1 {

@Test         //(priority=2)
		public void Samplecontact(){
			 System.out.println("hi");
		}

       @Test   (dependsOnMethods="Samplecontact")       //(priority=3)
        public void email(){
	  
	  System.out.println("hi new email id ");
}
     @Test    (dependsOnMethods="Samplecontact")       //(priority=1)
    public void modifcation(){
	 System.out.println("hi new email id modication ");
}
	}


