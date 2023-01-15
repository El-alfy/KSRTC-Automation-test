package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class Booking extends PagesBase {

	public Booking(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	private By CountryChosen = By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a");
	public void press_CountryChosen() {
	driver.findElement(CountryChosen).click();	
	}

	
	private By 	arrivaldate = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[1]/a");
	public void press_arrivaldate() {
	driver.findElement(arrivaldate).click();
	}

	
	private By 	BtnSearchForBus = By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button");
	public void press_BtnSearchForBus () {
	driver.findElement(BtnSearchForBus).click();
	}
	
	
	private By 	BtnSelectaSeat = By.xpath("(//input[@id='SrvcSelectBtnForward0'])[2]");
	public void press_BtnSelectaSeat()  {
	driver.findElement(BtnSelectaSeat).click();
	}
	
	
	private By 	ReserveSeat = By.xpath("//*[@id=\"Forward48\"]");
	public void press_ReserveSeat() {
	driver.findElement(ReserveSeat).click();
	}
	
	
	private By 	BoardingPointClick = By.id("Forwardboarding-tab");
	public void press_BoardingPointClick() {
	driver.findElement(BoardingPointClick).click();
	}

	
	private By 	ChooseBoarding = By.id("Forward-1467550949362");
	public void press_ChooseBoarding() {
	driver.findElement(ChooseBoarding).click();
	}


	private By 	ChooseDropping = By.id("Forward-1467543003073");
	public void press_ChooseDropping() {
	driver.findElement(ChooseDropping).click();
	}
	
	
	//Customer Details
	private By MobileNumber = By.xpath("//*[@id=\"mobileNo\"]");
	public void send_MobileNumber() {
	driver.findElement(MobileNumber).sendKeys("6789125987");
	}
		
	private By Email = By.xpath("//*[@id=\"email\"]");
	public void send_Email() {
	driver.findElement(Email).sendKeys("mahmoud@gmail.com");
	}
	
	
	//Passenger Details
	private By PassengerName = By.id("passengerNameForward0");
	public void send_PassengerName () {
	driver.findElement(PassengerName ).sendKeys("Mahmoud");	
	}
	
	
	private By GenderClick = By.id("genderCodeIdForward0");
	public void press_GenderClick() {
	driver.findElement(GenderClick).click();
	}
	
	private By selectGender = By.xpath("//*[@id=\"genderCodeIdForward0\"]/option[2]");
	public void select_selectGender() {
	driver.findElement(selectGender).click();
	}

	
	private By PassengerAge = By.id("passengerAgeForward0");
	public void send_PassengerAge() {
	driver.findElement(PassengerAge).sendKeys("23");
	}
	
	
	private By Concessionclick = By.id("concessionIdsForward0");
	public void press_Concessionclick() {
	driver.findElement(Concessionclick).click();
	}
	
	private By selectConcession = By.xpath("//*[@id=\"concessionIdsForward0\"]/option[2]");
	public void select_selectConcession() {
	driver.findElement(selectConcession).click();
	}
	
	
	private By 	MakePaymentBtn = By.id("PgBtn");
	public void press_MakePaymentBtn() {
	driver.findElement(MakePaymentBtn).click();
	}
	

}