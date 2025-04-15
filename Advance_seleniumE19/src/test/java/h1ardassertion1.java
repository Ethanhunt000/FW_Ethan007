import org.testng.Assert;
import org.testng.annotations.Test;

public class h1ardassertion1 {

	
		@Test
		public void m1() {
			System.out.println("1");
			System.out.println("2");
			Assert.assertEquals("s","a");
			
			System.out.println("3");
			System.out.println("4");
		}	
			@Test
			public void m2() {
				int exp=10;
				int act=10;
				Assert.assertEquals(act,exp);
			}
			@Test
			public void m3() {
				int exp=10;
				int act=20;
				Assert.assertEquals(act,exp,"Assert are not equal");
				System.out.println("assert pass");
			}	
			
			
			@Test
			public void m4() {
				String exp="qsp";
				String act="qsps";
				Assert.assertNotEquals(act,exp,"both are equal");
				System.out.println("both are not equal condition fail");
			}
			@Test
			public void m5() {
				String exp="qsp";
				String act="qsp";
				Assert.assertNotEquals(act,exp,"both are equal");
				System.out.println("both are not equal condition fail 123");
			}	
			
			@Test
			public void m6() {
				String exp="qsp";
				String act="qsp";
				Assert.assertTrue(act.equalsIgnoreCase(exp),"assertFail");
				System.out.println("assert pass");
			}	
			
			
			@Test
			public void m7() {
				String exp="qsp";
				String act="qsps";
				Assert.assertTrue(act.equalsIgnoreCase(exp),"assertFail");
				System.out.println("assert pass");
			}	
			
			@Test
			public void m8() {
				String s=null;
				
				Assert.assertNull(s,"value is not null");
				System.out.println("value it is null");
			}	
			
			@Test
			public void m9() {
				String s="qsp";

				Assert.assertNull(s,"value is not null");
				System.out.println("value it is null");
			}	

			
			@Test
			public void m10() {
				String s="qsps";

				Assert.assertNotNull(s,"value is not null");
				System.out.println("value it is null");
			}	
			@Test
			public void m11() {
				String s=null;

				Assert.assertNotNull(s,"value is not null");
				System.out.println("value it is null");
			}	
			@Test
			public void m12() {
				String act="hi";
				String exp="hello";

				Assert.assertSame(act,exp,"same values");
				System.out.println("not same values");
			}	
			
			@Test
			public void m13() {
				int act=10;
				int exp=20;

				Assert.assertNotSame(act,exp,"same values");
				System.out.println("not same values");
			}	
	}


