import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// JUnit testing class for scheduleTour method
public class VRTourTest 
{
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before Test Case");
	}
	
	@Test
	public void test()
	{
		System.out.println("Correct Test Case");
		VRTour schedule = new VRTour();
		assertEquals("Schedule Test: ", "Appointment scheduled: UTD at 3:00 PM on June 14 2021.", schedule.scheduleTour("3:00 PM", "UTD", "June 14 2021"));
	}
	
	@After
	public void after()
	{
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
}
