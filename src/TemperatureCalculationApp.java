public class TemperatureCalculationApp {

    // main / psvm + TAB
    public static void main(String[] args) {

        double temperaturCelsius = 37.2;
        // float / => double = Gleitkomma
        // byte / short / => int / long = Ganzzahl
        // boolean
        // char c = 'a';
        // String t = "hello";

        double fahrenheit = celsius2Fahrenheit(temperaturCelsius); // call-by-value
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celsius2Fahrenheit(12.1) = " + celsius2Fahrenheit(12.1));
        System.out.println("celsius2Fahrenheit(15.7) = " + celsius2Fahrenheit(15.7));

        double temp1 = fahrenheit2Celsius(60.26);
        System.out.println(" temp1 = " +  temp1);

       // System.out.println(5 / 9.0);

        /*

        Celsius | Fahrenheit
        ----------------------
        -15 =>
        -10 =>
        -5 =>
        0
        5
        ..
        40
         */
        System.out.println("Celsius | Fahrenheit");
        System.out.println("----------------------");
        for (int i = -40; i <= 60; i+=5){
            double fh = celsius2Fahrenheit(i);
            System.out.println(i + "°C => " + fh + "°F");
        }
    }

    // void
    public static double celsius2Fahrenheit(double celsius) {
  //      System.out.println("celsius = " + celsius);
//        double result = (celsius * 1.8) + 32;
//        System.out.println(result);
//        return result;
        return (celsius * 1.8) + 32;
    }

    public static double fahrenheit2Celsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9;
    }
}
