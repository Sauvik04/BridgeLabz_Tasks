public class Hotel {

    String hotelName;

    int weekdayRate;

    int weekendRate;


    public Hotel(
            String hotelName,
            int weekdayRate,
            int weekendRate
    ) {

        this.hotelName =
                hotelName;

        this.weekdayRate =
                weekdayRate;

        this.weekendRate =
                weekendRate;

    }


    public int calculateRate(
            int weekdays,
            int weekends
    ){

        return
                weekdays *
                        weekdayRate
                        +
                        weekends *
                                weekendRate;

    }

}