import java.util.Scanner;

public class SmartPhoneApp {
    public static void displayMenu() {
        System.out.println("1: Radio");
        System.out.println("2: Weather App");
        System.out.println("3: MusicPlayer");
        System.out.println("4: GpsApp");
        System.out.println("5: For Exit");
    }

    public static void main(String[] args) {
        int input= 0;
        Scanner scanner = new Scanner(System.in);

        Phone IPhone = new Phone("11 Pro", 2020, new MusicPlayer("Teoman", "Gönulçelen", "Mavi", 3.46, 7), new Radio("FM101", "Uykunuz kaçacak", 6), new GPSApp(2, 2, 1, 59), new WeatherApp("Balçova", WeatherApp.currentForecast.SUNNY, WeatherApp.tomorrowsForecast.RAINY));
        do {
            displayMenu();
            try {


            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Tuning in to" + IPhone.getRadio().getChannelName() + "'" + IPhone.getRadio().getProgramName() + "Volume is" + IPhone.getRadio().getVolumeLevel());
                    break;
                case 2:
                    IPhone.getWeather().getCoordinates();
                    break;
                case 3:
                    System.out.println("Playing Song :" + IPhone.getPlayer().getSongName() + "Album Name  :" + IPhone.getPlayer().getAlbumName() + "Artist Name :" + IPhone.getPlayer().getArtistName());
                    break;
                case 4:
                    IPhone.getGps().getCoordinates();
                    break;

            }
            }catch (Exception E){
                scanner.nextLine();
            }
        } while (input != 5);

    }
}

