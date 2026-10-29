public class HotelBooking {
        private int booking_id;
            private String guest_name = null;
                private String room_type;
                    private int number_of_nights;
                        private double total_cost;


                            public HotelBooking() {
                                }

                                    public double calculateBookingCost(String type, int nights) {
                                            if (nights <= 0) {
                                                        throw new IllegalArgumentException("Nights must be greater than zero");
                                                                }
                                                                        double rate;
                                                                                if(type.equals("Standard")) {
                                                                                            if (nights <= 3) {
                                                                                                            rate = 4000;
                                                                                                                        }
                                                                                                                                    else {
                                                                                                                                                    rate = 3500;
                                                                                                                                                                }
                                                                                                                                                                        }
                                                                                                                                                                                else if (type.equals("Deluxe")) {
                                                                                                                                                                                            if(nights <= 2) {
                                                                                                                                                                                                            rate = 7000;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                        rate = 6000;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                        throw new IllegalArgumentException("Invalid room type");
                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                        room_type = type;
                                                                                                                                                                                                                                                                                                number_of_nights=nights;
                                                                                                                                                                                                                                                                                                        total_cost = rate * nights;
                                                                                                                                                                                                                                                                                                                return total_cost;
                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                        public void assignGuest(String name) {
                                                                                                                                                                                                                                                                                                                                guest_name = name;
                                                                                                                                                                                                                                                                                                                                    }



                                                                                                                                                                                                                                                                                                                                        public String getGuestName() {
                                                                                                                                                                                                                                                                                                                                                return guest_name;
                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                        public void cancelBooking() {
                                                                                                                                                                                                                                                                                                                                                                guest_name = null;
                                                                                                                                                                                                                                                                                                                                                                        total_cost = 0;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                public double getTotalCost() {
                                                                                                                                                                                                                                                                                                                                                                                        return total_cost;
                                                                                                                                                                                                                                                                                                                                                                                            }
}