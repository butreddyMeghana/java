public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        else{
            return
                    Math.round(kilometersPerHour/1.609);

        }
    }
    public static void printConversion(double kiloMetersPerHour){
        if(kiloMetersPerHour<0){
            System.out.print("Invalid value");
            return;
        }
long milesPerHour = toMilesPerHour(kiloMetersPerHour);
        System.out.println( kiloMetersPerHour + " km/h = " + milesPerHour + " mi/h");

    }
}