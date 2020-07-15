// Test this class
// Use JUnit 5
// Test as thoroughly as possible in the Time Frame
// Final Exam Winter 2018


public final class Measures implements MeasureConvertable {
	
	public final static double ConvertIt( Double conversionRate, double valueFrom ) throws InvalidConversationRateException{
		
		double valueTo = 0.0;
		if (conversionRate.equals(INCH_TO_MM) || 
			conversionRate.equals(OUNCE_TO_GRAM) || 
			conversionRate.equals(POUND_TO_GRAM) ||
			conversionRate.equals(HP_TO_WATT) ||
			conversionRate.equals(LITRES_TO_IMPERIAL_GALLONS) ||
			conversionRate.equals(LITRES_TO_US_GALLONS)) {
				valueTo = valueFrom *  conversionRate.doubleValue();
			}
		else throw new InvalidConversationRateException("Invalidd conversion rate used");
		
		return valueTo;
	}

}
