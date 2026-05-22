import java.util.ArrayList;

public class HotelReservationService {

    ArrayList<Hotel> hotels =
            new ArrayList<>();


    public void addHotel(
            Hotel hotel
    ){

        hotels.add(
                hotel
        );

    }


    public Hotel findCheapestHotel(
            int weekdays,
            int weekends
    ){

        Hotel cheapest =
                hotels.get(0);


        for(
                Hotel hotel :
                hotels
        ){

            if(

                    hotel.calculateRate(
                            weekdays,
                            weekends
                    )

                            <

                            cheapest.calculateRate(
                                    weekdays,
                                    weekends
                            )

            ){

                cheapest =
                        hotel;

            }

        }

        return cheapest;

    }

}