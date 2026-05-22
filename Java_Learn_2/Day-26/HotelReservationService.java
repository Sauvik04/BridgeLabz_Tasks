import java.util.ArrayList;

public class HotelReservationService {

    ArrayList<Hotel> hotels =
            new ArrayList<>();


    public void addHotel(
            Hotel hotel
    ) {

        hotels.add(
                hotel
        );

    }


    public void showHotels() {

        for (
                Hotel hotel :
                hotels
        ) {

            System.out.println(

                    hotel.hotelName

                            +

                            " Weekday : $"

                            +

                            hotel.weekdayRate

                            +

                            " Weekend : $"

                            +

                            hotel.weekendRate

            );

        }

    }


    public Hotel findCheapest() {

        Hotel cheapest =
                hotels.get(0);


        for (
                Hotel hotel :
                hotels
        ) {

            if (
                    hotel.weekdayRate
                            <
                            cheapest.weekdayRate
            ) {

                cheapest =
                        hotel;

            }

        }

        return cheapest;

    }

}