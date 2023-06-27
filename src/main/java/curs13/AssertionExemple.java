package curs13;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionExemple {
	
	String actualTitle = "Test";
	String expectedTitle= "masina";
	
	@Test
	
	public void checkEquality() {
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
			
		}
	}
	//hard assertul este fara numele lui in fata. sort assertul are Soft....
//toate metodele care adnotate @ test trebuie sa se termine cu un assert(verificare). daca nu avem un asert la final, insseamna ca nu validam nimic	


		@Test
		public void checkStringEquality()
		{
			assertEquals(actualTitle, expectedTitle);
		
		}
		
}

