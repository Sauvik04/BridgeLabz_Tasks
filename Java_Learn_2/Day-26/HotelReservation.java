public class HotelReservation {

    public static void main(
            String[] args
    ) {

        HotelReservationService service =
                new HotelReservationService();


        service.addHotel(

                new Hotel(
                        "Lakewood",
                        110,
                        90
                )

        );


        service.addHotel(

                new Hotel(
                        "Bridgewood",
                        150,
                        50
                )

        );


        service.addHotel(

                new Hotel(
                        "Ridgewood",
                        220,
                        150
                )

        );


        service.showHotels();


        Hotel cheapest =
                service.findCheapest();


        System.out.println();

        System.out.println(
                "Cheapest : "
                        +
                        cheapest.hotelName
        );

    }

}