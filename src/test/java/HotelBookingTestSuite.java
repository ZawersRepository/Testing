import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({HotelBookingFareTest.class, HotelBookingGuestTest.class})
public class HotelBookingTestSuite {

}