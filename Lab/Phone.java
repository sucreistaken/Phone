public class Phone {
    private String model;
    private int modelYear;
    private MusicPlayer player;
    private Radio radio;
    private GPSApp gps;
    private WeatherApp weather;

    public Phone(String model, int modelYear, MusicPlayer player, Radio radio, GPSApp gps, WeatherApp weather) {
        this.model = model;
        this.modelYear = modelYear;
        this.player = player;
        this.radio = radio;
        this.gps = gps;
        this.weather = weather;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public MusicPlayer getPlayer() {
        return player;
    }

    public void setPlayer(MusicPlayer player) {
        this.player = player;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public GPSApp getGps() {
        return gps;
    }

    public void setGps(GPSApp gps) {
        this.gps = gps;
    }

    public WeatherApp getWeather() {
        return weather;
    }

    public void setWeather(WeatherApp weather) {
        this.weather = weather;
    }
}
