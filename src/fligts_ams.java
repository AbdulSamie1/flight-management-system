
public class fligts_ams {
	public String admin_u = "admin";
	public String admin_p = "admin";
	
	public String passenger_u = "passenger";
	public String passenger_p = "passenger";
	public String passenger_e = "passenger@email.com";
	
	public String getAdmin_u() {
		return admin_u;
	}

	public void setAdmin_u(String admin_u) {
		this.admin_u = admin_u;
	}

	public String getAdmin_p() {
		return admin_p;
	}

	public void setAdmin_p(String admin_p) {
		this.admin_p = admin_p;
	}

	public String getPassenger_u() {
		return passenger_u;
	}

	public void setPassenger_u(String passenger_u) {
		this.passenger_u = passenger_u;
	}

	public String getPassenger_p() {
		return passenger_p;
	}

	public void setPassenger_p(String passenger_p) {
		this.passenger_p = passenger_p;
	}

	public String getPassenger_e(String a, String b) {
		return passenger_e;
	}

	public void setPassenger_e(String passenger_e) {
		this.passenger_e = passenger_e;
	}

	public boolean isTicket() {
		return ticket;
	}

	public void setTicket(boolean ticket) {
		this.ticket = ticket;
	}

	public boolean isMeal(String m) {
		return meal;
	}

	public void setMeal(boolean meal) {
		this.meal = meal;
	}

	public boolean isBaggage(int ba) {
		return baggage;
	}

	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}

	public int getAvailableTickets(int fl) {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}

	public boolean ticket = true;
	public boolean meal = true;
	public boolean baggage = true;
	
	public int availableTickets = 12;
	
	public boolean bookSeat(int f, int num) {
		if(num < 1 && num > 100) {
			return false;
		}
		return true;
	}
	
	public boolean getUserDetails(int f) {
		if(f < 0) {
			return false;
		}
		return true;
	}
	
}
