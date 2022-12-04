package pompackagebank;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseBank.BaseBankClass;

public class PomLoginBank extends BaseBankClass{
	
	@FindBy(css="#loginPanel > form > div:nth-child(2) > input")
	WebElement Username;
	@FindBy(css="#loginPanel > form > div:nth-child(4) > input")
	WebElement Password;
	@FindBy(css="#loginPanel > form > div:nth-child(5) > input")
	WebElement Login;
	@FindBy(css="#loginPanel > p:nth-child(2) > a")
	WebElement ForgotLoginInfo;
	@FindBy(css="#loginPanel > p:nth-child(3) > a")
	WebElement Register;
	@FindBy(id="customer.firstName")
	WebElement FirstName;
	@FindBy(id="customer.lastName")
	WebElement LastName;
	@FindBy(id="customer.address.street")
	WebElement Address;
	@FindBy(id="customer.address.city")
	WebElement City;
	@FindBy(id="customer.address.state")
	WebElement State;
	@FindBy(id="customer.address.zipCode")
	WebElement ZipCode;
	@FindBy(id="customer.phoneNumber")
	WebElement Phone;
	@FindBy(id="customer.ssn")
	WebElement SSN;
	@FindBy(id="customer.username")
	WebElement usernameregister;
	@FindBy(id="customer.password")
	WebElement passwordregister;
	@FindBy(id="repeatedPassword")
	WebElement ConfirmPass;
	@FindBy(css="#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")
	WebElement Registerbtn;
	@FindBy(css="#leftPanel > ul > li:nth-child(1) > a")
	WebElement OpenNewAccount;
	@FindBy(id="type")
	WebElement Account;
	@FindBy(css="#rightPanel > div > div > form > div > input")
	WebElement Opennewaccountbtn;
	@FindBy(css="#leftPanel > ul > li:nth-child(2) > a")
	WebElement AccountsOverview;
	@FindBy(css="#accountTable > tbody > tr.ng-scope > td:nth-child(1) > a")
	WebElement Accountnumber;
	@FindBy(css="#leftPanel > ul > li:nth-child(3) > a")
	WebElement TransferFunds;
	@FindBy(css="#amount")
	WebElement Amount;
	@FindBy(css="#fromAccountId")
	WebElement FromAccount;
	@FindBy(css="#toAccountId")
	WebElement ToAccount;
	@FindBy(css="#rightPanel > div > div > form > div:nth-child(4) > input")
	WebElement Transferbtn;

		
	@FindBy(css="#leftPanel > ul > li:nth-child(4) > a")
	WebElement BillPay;

	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input")
	WebElement Payeename;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input")
	WebElement AddressBill;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input")
	WebElement CityBill;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > input")
	WebElement StateBill;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > input")
	WebElement ZipCodeBill;
	

	
	@FindBy(css="#a6a1cfbc-f06d-4d01-b7d7-00cec3b88df5")
	WebElement PhoneBill;  
	
	
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > input")
	WebElement AccountBill;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > input")
	WebElement VerifyaccountBill;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(11) > td:nth-child(2) > input")
	WebElement AmountBill;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(13) > td:nth-child(2) > select")
	WebElement FromaccountBill;
	@FindBy(css="#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(14) > td:nth-child(2) > input")
	WebElement SendPayment;
	@FindBy(css="#leftPanel > ul > li:nth-child(5) > a")
	WebElement FindTransactions;
	
	@FindBy(css="#accountId")
	WebElement Select;
	@FindBy(css="#criteria\\.transactionId")
	WebElement ID;
	@FindBy(css="#rightPanel > div > div > form > div:nth-child(5) > button")
	WebElement Findid;
	@FindBy(css="#criteria\\.onDate")
	WebElement Date;
	@FindBy(css="#rightPanel > div > div > form > div:nth-child(9) > button")
	WebElement Finddate;
	@FindBy(css="#criteria\\.fromDate")
	WebElement Between;
	@FindBy(css="#criteria\\.toDate")
	WebElement To;
	@FindBy(css="#rightPanel > div > div > form > div:nth-child(13) > button")
	WebElement Findrange;
	@FindBy(css="#criteria\\.amount")
	WebElement AmountTransactions;
	@FindBy(css="#rightPanel > div > div > form > div:nth-child(17) > button")
	WebElement Findamount;
	
	@FindBy(css="#leftPanel > ul > li:nth-child(6) > a")
	WebElement Update;
	@FindBy(css="#rightPanel > div > div > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > input")
	WebElement UpdateProfile;
	
	@FindBy(css="#leftPanel > ul > li:nth-child(7) > a")
	WebElement Loan;
	@FindBy(css="#amount")
	WebElement LoanAmount;
	@FindBy(css="#downPayment")
	WebElement DownPayment;
	@FindBy(css="#fromAccountId")
	WebElement FromAccountLoan;
	@FindBy(css="#rightPanel > div > div > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > input")
	WebElement Apply;
	@FindBy(css="#leftPanel > ul > li:nth-child(8) > a")
	WebElement Logout;
	
	
	public PomLoginBank() {
		PageFactory.initElements(driver, this);
	}
	public String verify() {
		return driver.getTitle();
	}
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void typepassword(String pass) {
		Password.sendKeys(pass);
	}
	public void clickbtn() {
		Login.click();
	}
	public void ForgotLoginInfo() {
		ForgotLoginInfo.click();
	}
	public void Register() {
		Register.click();
	}
	public void typeFirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}
	public void typeLastName(String lastname) {
		LastName.sendKeys(lastname);
	}
	public void typeAddress(String address) {
		Address.sendKeys(address);
	}
	public void typeCity(String city) {
		City.sendKeys(city);
	}
	public void typeState(String state) {
		State.sendKeys(state);
	}
	public void typeZipCode(String zipcode) {
		ZipCode.sendKeys(zipcode);
	}
	public void typePhone(String phone) {
		Phone.sendKeys(phone);
	}
	public void typeSSN(String ssn) {
		SSN.sendKeys(ssn);
	}
	public void typeusernameregister(String username) {
		usernameregister.sendKeys(username);
	}
	public void typepasswordregister(String password) {
		passwordregister.sendKeys(password);
	}
	public void typeConfirmPass(String confirm) {
		ConfirmPass.sendKeys(confirm);
	}
    public void Registerbtn() {
    	Registerbtn.click();
    }
	public void OpenNewAccount() {
		OpenNewAccount.click();
	}
	public void Account() {
		Account.click();
	}
	public void Opennewaccountbtn() {
		Opennewaccountbtn.click();
	}
	public void AccountsOverview() {
		AccountsOverview.click();
	}
	public void Accountnumber() {
		Accountnumber.click();
	}
	public void TransferFunds() {
		TransferFunds.click();
	}
	public void Amount(String amount) {
		Amount.sendKeys(amount);
	}
	public void FromAccount() {
		FromAccount.click();
	}
	public void ToAccount() {
		ToAccount.click();
	}
	public void Transferbtn() {
		Transferbtn.click();
	}
	public void BillPay() {
		BillPay.click();
	}
	public void typePayeename(String namebill) {
		Payeename.sendKeys(namebill);
	}
	public void typeAddressBill(String addressbill) {
		AddressBill.sendKeys(addressbill);
	}
	public void typeCityBill(String citybill) {
		CityBill.sendKeys(citybill);
	}
	public void typeStateBill(String statebill) {
		StateBill.sendKeys(statebill);
	}
	public void typeZipCodeBill(String zipcodebill) {
		ZipCodeBill.sendKeys(zipcodebill);
	}
	

	public void typePhoneBill(String phonebill) {
		PhoneBill.sendKeys(phonebill);
	}
	
	
	public void typeAccountBill(String accountbill) {
		AccountBill.sendKeys(accountbill);
	}
	public void typeVerifyaccountBill(String verifybill) {
		VerifyaccountBill.sendKeys(verifybill);
	}
	public void typeAmountBill(String amountbill) {
		AmountBill.sendKeys(amountbill);
	}
	public void FromaccountBill() {
		FromaccountBill.click();
	}
	public void SendPayment() {
		SendPayment.click();
	}
	
	public void FindTransactions() {
		FindTransactions.click();
	}
	public void Select() {
		Select.click();
	}
	public void typeID(String id) {
		ID.sendKeys(id);
	}
	public void Findid() {
		Findid.click();
	}
	public void typeDate(String date) {
		Date.sendKeys(date);
	}
	public void Finddate() {
		Finddate.click();
	}
	public void typeBetween(String between) {
		Between.sendKeys(between);
	}
	public void typeTo(String to) {
		To.sendKeys(to);
	}
	public void Findrange() {
		Findrange.click();
	}
	public void typeAmountTransactions(String amounttransactions) {
		AmountTransactions.sendKeys(amounttransactions);
	}
	public void Findamount() {
		Findamount.click();
	}
	public void Update() {
		Update.click();	
	}
	public void UpdateProfile() {
		UpdateProfile.click();
	}
	public void Loan() {
		Loan.click();
	}
	public void typeLoanAmount(String loanamount) {
		LoanAmount.sendKeys(loanamount);
	}
	public void typeDownPayment(String downpayment) {
		DownPayment.sendKeys(downpayment);
	}
	public void FromAccountLoan() {
		FromAccountLoan.click();
	}
	public void Apply() {
		Apply.click();
	}
	public void Logout() {
		Logout.click();
	}
}
