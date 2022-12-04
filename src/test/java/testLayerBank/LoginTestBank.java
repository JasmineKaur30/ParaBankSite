package testLayerBank;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseBank.BaseBankClass;
import pompackagebank.PomLoginBank;
import testdataBank.ExcelSheetBank;

public class LoginTestBank extends BaseBankClass{
	
	PomLoginBank Log;
	public LoginTestBank() {
		
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
		initiate();
		Log=new PomLoginBank();
	}
	
	@Test(priority=1)
	public void Title() {
		String actual=Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "ParaBank | Welcome | Online Banking");
	}
	@DataProvider
	public Object[][] Details(){
		Object result[][]=ExcelSheetBank.readdata("Sheet1");
		return result;
		
	}
	
    @Test(priority=2, dataProvider="Details")
    public void Login(String name, String password) throws InterruptedException {
    	Log.typeusername(name);
    	Thread.sleep(2000);
    	Log.typepassword(password);
    	Log.clickbtn();
    	Thread.sleep(3000);
    }
    @Test(priority=3)
    public void ForgotLoginInfo() throws InterruptedException {
    	Log.ForgotLoginInfo();
    	Thread.sleep(3000);
    }
    @Test(priority=4)
    public void Register() throws InterruptedException {
    	Log.Register();
    	Thread.sleep(3000);
    	Log.typeFirstName("avhv");
    	
    	Log.typeLastName("Ksvsv");
    	
    	Log.typeAddress("1nbnb");
    	
    	Log.typeCity("Brams2");
    	
    	Log.typeState("Ono2");
    	Thread.sleep(2000);
    	Log.typeZipCode("L1W 2H3");
    	
    	Log.typePhone("1234555590");
    	Thread.sleep(2000);
    	Log.typeSSN("123 00 2245");
    	
    	Log.typeusernameregister("Jasmine2000");
    	Thread.sleep(2000);
    	Log.typepasswordregister("Jasmine10");
    	
    	Log.typeConfirmPass("Jasmine10");
    	
    	Log.Registerbtn();
    	Thread.sleep(2000);
  
    	Log.OpenNewAccount();
    	Thread.sleep(2000);
    	Log.Account();
    	Log.Opennewaccountbtn();
    	Thread.sleep(2000);
    	Log.AccountsOverview();
    	Thread.sleep(2000);
    	Log.Accountnumber();
    	Thread.sleep(2000);
    	Log.TransferFunds();
    	Thread.sleep(2000);
    	Log.Amount("100");
    	Thread.sleep(3000);
    	Log.FromAccount();
    	Thread.sleep(2000);
    	Log.ToAccount();
    	Thread.sleep(2000);
    	Log.Transferbtn();
    	Thread.sleep(2000);
  
    	Log.BillPay();
    	Thread.sleep(2000);
    	Log.typePayeename("Jasmine");
    	
    	Log.typeAddressBill("11abc");
    	
    	Log.typeCityBill("Brampton");
    	Thread.sleep(2000);
    	Log.typeStateBill("Ontario");
    	
    	Log.typeZipCodeBill("M1W 2E4");
    	Thread.sleep(2000);
    	
    	try {
    	Log.typePhoneBill("12345680");  }
    	catch (NoSuchElementException e) {
    		
    	}
    	
    	Log.typeAccountBill("1379");
    	
    	Log.typeVerifyaccountBill("1379");
    	
    	Log.typeAmountBill("10");
    	
    	Log.FromaccountBill();
    	
    	Log.SendPayment();	
  
    	Log.FindTransactions();
    	Thread.sleep(2000);
    	Log.Select();
    	Thread.sleep(2000);
    	Log.typeID("22801");
        Thread.sleep(2000);
        Log.Findid();
        Thread.sleep(2000);
        
        Log.FindTransactions();
        
        Log.typeDate("11-01-2022");;
        Thread.sleep(2000);
        Log.Finddate();
        Thread.sleep(2000);
        
        Log.FindTransactions();
        
        Log.typeBetween("11-02-2022");
        Thread.sleep(2000);
        Log.typeTo("11-06-2022");
        Thread.sleep(2000);
        Log.Findrange();
        Thread.sleep(2000);
        
        Log.FindTransactions();
        
        Log.typeAmountTransactions("100");
        Thread.sleep(2000);
        Log.Findamount();
        Thread.sleep(2000);
  
        Log.Update();
        Thread.sleep(2000);
        Log.UpdateProfile();
        Thread.sleep(2000);
   
        Log.Loan();
        Thread.sleep(2000);
        Log.typeLoanAmount("100");
        Log.typeDownPayment("50");
        Thread.sleep(2000);
        Log.FromAccountLoan();
        Thread.sleep(2000);
        Log.Apply();
        Thread.sleep(2000);
  
        Log.Logout();
        Thread.sleep(2000);
    }
	@AfterMethod
	public void close() {
		driver.close();
	}
}
