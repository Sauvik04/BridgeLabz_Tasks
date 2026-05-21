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
                            " $"
                            +
                            hotel.rate
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
                    hotel.rate
                            <
                            cheapest.rate
            ) {

                cheapest =
                        hotel;

            }

        }

        return cheapest;

    }

}