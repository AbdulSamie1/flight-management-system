import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AMS_tests {

	@Test
	void admintest() {
		fligts_ams cl = new fligts_ams();
		String user = "admin";
		String pass = "admin";
		assertEquals(user,cl.admin_u);
		assertEquals(pass,cl.admin_p);
	}
	
	@Test
	void passengertest() {
		fligts_ams cl = new fligts_ams();
		String user = "passenger";
		String pass = "passenger";
		assertEquals(user,cl.passenger_u);
		assertEquals(pass,cl.passenger_p);
	}
	
	@Test
	void getPassenegrEmail() {
		fligts_ams cl = new fligts_ams();
		String user = "passenger";
		String pass = "passenger";
		assertEquals("passenger@email.com",cl.getPassenger_e(pass, user));
	}
	
	@Test
	void getTickets() {
		fligts_ams cl = new fligts_ams();
		int flightID = 12323;
		assertEquals(12,cl.getAvailableTickets(flightID));
	}
	
	@Test
	void addBaggage() {
		fligts_ams cl = new fligts_ams();
		int num = 3;
		assertEquals(true, cl.isBaggage(num));
	}
	
	@Test
	void orderMeal() {
		fligts_ams cl = new fligts_ams();
		String meal = "Chicken Qourma";
		assertEquals(true, cl.isMeal(meal));
	}
	
	
	//--------------------Deriving Boundery
	@Test
	void bookSeatTest1() {
		fligts_ams cl = new fligts_ams();
		int seatNum = -20;
		int flight_ID = 1231;
		assertEquals(true, cl.bookSeat(flight_ID, seatNum));//it will return false no seat can be less than 0
	}
	
	@Test
	void bookSeatTest2() {
		fligts_ams cl = new fligts_ams();
		int seatNum = 101;
		int flight_ID = 1231;
		assertEquals(true, cl.bookSeat(flight_ID, seatNum));//it will return false no seat can be greater than 100
	}
	
	@Test
	void getUserDetails() {
		fligts_ams cl = new fligts_ams();
		int User_ID = 1231;
		assertEquals(true, cl.getUserDetails(User_ID));//it will return false no user can have student_id less than 0
	}
	
}
