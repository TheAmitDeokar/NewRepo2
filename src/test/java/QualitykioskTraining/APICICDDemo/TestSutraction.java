package QualitykioskTraining.APICICDDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestSutraction 
{

	CalculatorAPI Cal;
	int Result;
	@BeforeClass
	public void Init()
	{
		Cal=new CalculatorAPI();
		
	}
	
	@BeforeMethod
	public void ReInitialise()
	{
		Result=0;
	}
	
	@Test(priority=1)
	public void TestSubtractionWithPositiveNumbers()
	{
		
		Result=Cal.Subtraction(50, 10);
		Assert.assertEquals(Result, 40,"Subtraction does not work with Positive Numbers");
	}
	
}
