public class MethodsPractice {
    public static void main(String[] args) {

        int a = 5;
        int b= 6;
        // add above both methods d
        int c = 6;
//        need to sutract d from c
        double d = 6.6;
        double f =6.5;

        add(a,b);
        add(d,f);


    }

    public static int add(int  a , int b ){

        return (a+b);
    }
    public static double add(double  a , double b ){

        return (a+b);
    }

    public static int subtract(int a, int b) {
        int c = (a - b);
        return c;
    }
        public static String sony(){
            System.out.println("test");
            System.out.println("okay");
        return "cooking";
    }
}
