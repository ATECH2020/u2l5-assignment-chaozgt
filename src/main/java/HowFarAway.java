import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double lat1 = scanner.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double long1 = scanner.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        double lat2 = scanner.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double long2 = scanner.nextDouble();
        GeoLocation gL = new GeoLocation(lat1, long1); // initializes other class first time
        GeoLocation gL2 = new GeoLocation(lat2, long2); // initializes other class second time
        System.out.print("The distance is " + gL.distanceFrom(gL2) + " miles.");
    }
}