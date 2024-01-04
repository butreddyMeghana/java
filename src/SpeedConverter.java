public class SpeedConverter {
    public static void main(String[] args) {

printConversion(5.2);
    }

        public static long toMilesPerHour(double kilometersPerHour) {
            if (kilometersPerHour < 0) {
                return -1;
            } else {
                double tomilesPerHour = 1.609;
                double kilometerperhour = kilometersPerHour * tomilesPerHour;
                long rounded = Math.round(tomilesPerHour);


                return rounded;
            }
        }
            public static void printConversion(double kilometerPerHour){
                double toMilesPerHour = printConversion*toMilesPerHour;
                System.out.printf(kilometerPerHour + "km/h " +"="+ toMilesPerHour +"mi/hr");
            }

}