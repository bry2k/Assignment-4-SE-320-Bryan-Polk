import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
public class QuestionThreeLocaleFormatting 
{
	public static void main(String[] args)
	{
		Locale UK = new Locale("en", "GB");
		Locale US = new Locale("en", "US");
		
		NumberFormat UKNumber = NumberFormat.getInstance(UK);
		UKNumber.setMaximumFractionDigits(2);
		NumberFormat USCurrency = NumberFormat.getCurrencyInstance(US);
		
		//Part A is stored in ukNum.
		String ukNum = UKNumber.format(12345.678);
		//Part B is stored in usMoney.
		String usMoney = USCurrency.format(12345.678);
		try 
		{
			//Part C is stored in parseNum. Parsed using UK locale as the format fits.
			Number parseNum = UKNumber.parse("12,345.678");
		} 
		catch (ParseException e) 
		{
			System.exit(0);
		}
		
	}
}
