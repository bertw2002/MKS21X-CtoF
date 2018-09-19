public class CtoFTester{
  public static double celsiusToFahrenheit(double x){
    return (x * 9.0/5) + 32;
}
  public static double fahrenheitToCelsius(double x){
    return (x - 32.0) * 5.0/9;
}
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(3.0));
    System.out.println(fahrenheitToCelsius(0.0));
}
}
