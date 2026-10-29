import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class HotelBookingGuestTest {

    HotelBooking booking;

        @BeforeEach
            void setUp() {
                    booking = new HotelBooking();
                        }

                            @Test
                                void assignGuestEquals() {
                                        booking.assignGuest("Zawer Ali");
                                                assertEquals("Zawer Ali", booking.getGuestName());
                                                    }

                                                        @Test
                                                            void assignGuestSame() {
                                                                    String guest = "Zawer Ali";
                                                                            booking.assignGuest(guest);
                                                                                    assertSame(guest, booking.getGuestName());
                                                                                        }


                                                                                            @Test
                                                                                                void reassignGuest() {
                                                                                                        booking.assignGuest("Zawer Ali");
                                                                                                                booking.assignGuest("Ahmed");
                                                                                                                        assertEquals("Ahmed", booking.getGuestName());
                                                                                                                            }

                                                                                                                                @Test
                                                                                                                                    void independentBookings() {
                                                                                                                                            HotelBooking first_booking = new HotelBooking();
                                                                                                                                                    HotelBooking second_booking = new HotelBooking();

                                                                                                                                                            first_booking.assignGuest("Ali");
                                                                                                                                                                    second_booking.assignGuest("Sara");
                                                                                                                                                                            first_booking.calculateBookingCost("Standard", 2);
                                                                                                                                                                                    second_booking.calculateBookingCost("Deluxe", 5);

                                                                                                                                                                                            assertEquals(8000.0, first_booking.getTotalCost());
                                                                                                                                                                                                    assertEquals(30000.0, second_booking.getTotalCost());
                                                                                                                                                                                                            assertEquals("Ali", first_booking.getGuestName());
                                                                                                                                                                                                                    assertEquals("Sara", second_booking.getGuestName());
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                            @Test
                                                                                                                                                                                                                                void cancelBookingTest() {
                                                                                                                                                                                                                                        booking.assignGuest("Zawer Ali");
                                                                                                                                                                                                                                                booking.calculateBookingCost("Deluxe", 3);
                                                                                                                                                                                                                                                        booking.cancelBooking();
                                                                                                                                                                                                                                                                assertNull(booking.getGuestName());
                                                                                                                                                                                                                                                                        assertEquals(0.0, booking.getTotalCost());
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            }