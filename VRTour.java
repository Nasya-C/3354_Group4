public class VRTour 
{
	// Confirm that a tour with the provided details has been scheduled
	public String scheduleTour(String time, String location, String date)
	{
		String schedule = "Appointment scheduled: " + location + " at " + time + " on " + date + ".";
		return schedule;
	}
}


