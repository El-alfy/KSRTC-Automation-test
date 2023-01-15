package Tests;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Booking;



public class BookingTest extends TestsBase {
	
	

	@Test
    public void Book()throws InterruptedException{
		
    	Booking Bookingobject = new Booking(driver) ;
    	Thread.sleep(6000);

    	
    	
    	Bookingobject.press_CountryChosen ();
		Thread.sleep(2000);
		
		Bookingobject.press_arrivaldate ();
		Thread.sleep(2000);
		
		Bookingobject.press_BtnSearchForBus ();
		Thread.sleep(2000);
		
		Bookingobject.press_BtnSelectaSeat();
	    Thread.sleep(2000);
	    
	    Bookingobject.press_ReserveSeat();
		Thread.sleep(2000);
		
		Bookingobject.press_BoardingPointClick();
		Thread.sleep(2000);
		
		Bookingobject.press_ChooseBoarding();
		Thread.sleep(2000);
		
		Bookingobject.press_ChooseDropping();
		Thread.sleep(3000);
		
		Bookingobject.send_MobileNumber();
		Thread.sleep(2000);
		
		Bookingobject.send_Email();
		Thread.sleep(2000);
		
		Bookingobject.send_PassengerName ();
		Thread.sleep(2000);
		
		Bookingobject.press_GenderClick();
		Thread.sleep(3000);
		
		Bookingobject.select_selectGender();
		Thread.sleep(2000);
		
		Bookingobject.send_PassengerAge();
		Thread.sleep(2000);
		
		Bookingobject.press_Concessionclick();
		Thread.sleep(2000);
		
		Bookingobject.select_selectConcession();
		Thread.sleep(2000);
		
		Bookingobject.press_MakePaymentBtn();
		Thread.sleep(2000);
        
		
}
}
