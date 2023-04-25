public class GPSApp implements  Trackable{
    private float xCoordinate;
    private float yCoordinate;
    private int hour ;
    private int minute;

    public float getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(float xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public float getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(float yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public GPSApp(float xCoordinate, float yCoordinate, int hour, int minute) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public void getCoordinates() {
        System.out.println("X : " + getxCoordinate() + " Y : " + getyCoordinate() + " Hour : " +getHour() + " Minute : " + getMinute());
    }
}
