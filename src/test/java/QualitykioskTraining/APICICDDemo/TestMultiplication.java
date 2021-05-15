package QualitykioskTraining.APICICDDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMultiplication 
{

	CalculatorAPI Cal;
	int R;
	@BeforeClass
	public void CreateObj()
	{
		System.out.println("I am in Before Class");
		Cal=new CalculatorAPI();
		
	}
	@BeforeMethod
	public void InitialiseRes()
	{
		System.out.println("I am in Before Method");
		R=0;
	}
	
	@Test(priority=1)
	
	public void TestdivisionWithPositive()
	{
		System.out.println("I am in 1st TestMultiplicationnWithPositive");
		R=Cal.Multiplication(100,2);
		Assert.assertEquals(R,200,"Multiplication does not work with positive numbers");
	
	}
}
