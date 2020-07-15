import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.EOFException;
import org.junit.rules.ExpectedException;


/**
* Program Name:TestMeasures.java
* Purpose:Test cases to test the methods of Measures.java class.
* Coder:Nishi Patel
* Date:     10 12, 2018   
*/



public class TestMeasures implements  MeasureConvertable
{
	//Creating a constant
	private static final String MYID= "172.22.12.173";
	
	

	//Valid test case for conversion of INCH_TO_MM
	@Test
	public void TestInchToMMValid() throws InvalidConversationRateException   
	{
		double convert = Measures.ConvertIt(INCH_TO_MM, -1.00);
		assertEquals(-25.4,convert);	
	}
	
	//Valid test case for conversion of OUNCE_TO_GRAM
	@Test
	public void TestOunceToGramValid() throws InvalidConversationRateException  
	{
		double value = Measures.ConvertIt(OUNCE_TO_GRAM , -1.00);
		assertEquals( -28.349523, value);
	}
	
	//Valid test case for conversion of POUND_TO_GRAM
	@Test
	public void TestPoundToGramValid() throws InvalidConversationRateException  
	{
			double value = Measures.ConvertIt(POUND_TO_GRAM ,-1.00 );
			assertEquals( -453.5924,value);
	}
	
	//Valid test case for conversion of HP_TO_WATT 
	@Test
	public void TestHPToWattValid() throws InvalidConversationRateException  
	{
			double value = Measures.ConvertIt(HP_TO_WATT, -1.00);
			assertEquals( -745.7, value );
	}
	
	//Valid test case for conversion of LITRES_TO_IMPERIAL_GALLONS
		@Test
		public void TestLitersToImperialGallonsValid() throws InvalidConversationRateException  
		{
				double value = Measures.ConvertIt(LITRES_TO_IMPERIAL_GALLONS , -1.00);
				assertEquals( -4.536, value );
		}
		
		//Valid test case for conversion of LITRES_TO_US_GALLONS
		@Test
		public void TestLitersToUsGallonsValid() throws InvalidConversationRateException  
		{
				double value = Measures.ConvertIt(LITRES_TO_US_GALLONS, -1.00);
				assertEquals( -3.78, value );
		}
		
	
		public ExpectedException thrown = ExpectedException.none();
		@Test 
		public void TestException() throws InvalidConversationRateException 
		{
			thrown.expect(EOFException.class);
			thrown.expectMessage("Invalid rate");
			double value = Measures.ConvertIt(INCH_TO_MM, 00);
			assertEquals( 0,value );
		}

		
		




		/**
		 * @return the myid
		 */
		public static String getMyid() 
		{
			return MYID;
		}
	
		
}
