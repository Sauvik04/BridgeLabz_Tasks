import java.util.ArrayList;

public class HotelReservationService {

    ArrayList<Hotel> hotels=
            new ArrayList<>();

    public void addHotel(
            Hotel hotel){

        hotels.add(
                hotel
        );

    }

}