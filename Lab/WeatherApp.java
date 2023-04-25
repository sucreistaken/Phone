public class WeatherApp implements Trackable {


    private String city;
    private currentForecast forecast;
    private tomorrowsForecast tomorrowsForecast;

    public WeatherApp(String city, currentForecast forecast, WeatherApp.tomorrowsForecast tomorrowsForecast) {
        this.city = city;
        this.forecast = forecast;
        this.tomorrowsForecast = tomorrowsForecast;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public currentForecast getForecast() {
        return forecast;
    }

    public void setForecast(currentForecast forecast) {
        this.forecast = forecast;
    }

    public WeatherApp.tomorrowsForecast getTomorrowsForecast() {
        return tomorrowsForecast;
    }

    public void setTomorrowsForecast(WeatherApp.tomorrowsForecast tomorrowsForecast) {
        this.tomorrowsForecast = tomorrowsForecast;
    }

    @Override
    public void getCoordinates() {
        System.out.println("City :" + getCity() + "Current Weather :" + getForecast() + "Tomorrow Weather :" + getTomorrowsForecast()  );
    }
    public enum currentForecast {
        SUNNY,
        CLOUDY,
        RAINY,
        SNOWY,
        STORMY
    }
    public enum tomorrowsForecast{
        SUNNY,
        CLOUDY,
        RAINY,
        SNOWY,
        STORMY
    }
}
