
public class internationalFlight {

	private String flightID,timeDuration,lessonDate,departDestination,landDestination,economySeats,businessSeats,distance;
	boolean isBooked;
	
	internationalFlight(String flightID,String departTime,String landTime,String departDestination,String landDestination,String economySeats,String businessSeats,String distance)
	{
		this.flightID=flightID;
		this.timeDuration=departTime;
		this.lessonDate=landTime;
		this.departDestination=departDestination;
		this.landDestination=landDestination;
		this.economySeats=economySeats;
		this.businessSeats=businessSeats;
		this.distance=distance;
	}
	
	public String getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}

	public String getDate() {
		return lessonDate;
	}

	public void setDate(String lessonDate) {
		this.lessonDate = lessonDate;
	}

	public boolean isBooked() {
		return isBooked;
	}

	void setFlightID(String flightID)
	{
		this.flightID=flightID;
	}
	
	String getFlightID()
	{
		return flightID;
	}
	
	void setDepartTime(String departTime)
	{
		this.timeDuration=departTime;
	}
	
	void setLandTime(String landTime)
	{
		this.lessonDate=landTime;
	}
	
	void setDepartDestination(String departDestination)
	{
		this.departDestination=departDestination;
	}
	
	void setLandDestination(String landDestination)
	{
		this.landDestination=landDestination;
	}
	
	void setEconomySeats(String economySeats)
	{
		this.economySeats=economySeats;
	}
	
	void setBusinessSeats(String businessSeats)
	{
		this.businessSeats=businessSeats;
	}
	
	String getDepartTime()
	{
		return timeDuration;
	}
	
	String getLandTime()
	{
		return lessonDate;
	}
	
	String getDepartDestination()
	{
		return departDestination;
	}
	
	String getLandDestination()
	{
		return landDestination;
	}
	
	String getEconomySeats()
	{
		return economySeats;
	}
	
	String getBusinessSeats()
	{
		return businessSeats;
	}
	
	void setDistance(String distance)
	{
		this.distance=distance;
	}
	
	String getDistance()
	{
		return distance;
	}
	
	void setBooked(boolean isBooked)
	{
		this.isBooked=isBooked;
	}
	
	boolean getBooked()
	{
		return isBooked;
	}
}
