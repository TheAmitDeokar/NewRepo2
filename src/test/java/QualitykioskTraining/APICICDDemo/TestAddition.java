package QualitykioskTraining.APICICDDemo;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAddition 
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
	public void TestAdditionWithPositiveNumbers()
	{
		System.out.println("I am in 1 st TestCase");
		R=Obj.Addition(10,20);
		Assert.assertEquals(R, 30,"Addition does not work with positive numbers");
	}

}
