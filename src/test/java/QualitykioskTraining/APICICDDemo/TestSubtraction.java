package QualitykioskTraining.APICICDDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSubtraction
{
	CalculatorAPI Obj;
	int R;
	
	
	//@Before("RegressionTest")
	public void InitGroup()
	{
		System.out.println("Im in Before class");
		Obj=new CalculatorAPI();	
	}
	
	@BeforeClass
	public void Init()
	{
		System.out.println("Im in Before class");
		Obj=new CalculatorAPI();
	}
	@BeforeMethod
	public void ReinitialiseResultVar()
	{
		System.out.println("I am in Before Method");
		R=0;
	}
	@Test(priority=1)
	public void TestSubtractionWithPositiveNumbers()
	{
		System.out.println("I am in 1 st TestCase");
		R=Obj.Subtraction(100,20);
		Assert.assertEquals(R, 80,"Subtraction does not work with positive numbers");
	}
}
