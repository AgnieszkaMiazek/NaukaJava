// oparatory umożliwiajaą wykoananie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
float thirdNumber = 4.0F;
        int addition = firstNumber + secondNumber; // 10
        int subtraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber/secondNumber    ;
        int mod = secondNumber%firstNumber;// 6 mieści się w 4 - 0 4
        System.out.println("Wynik dodania" + addition);
        System.out.println("Odejmowanie:" + subtraction);
        System.out.println("Mnożenie:"+ multiplication);
        System.out.println("Dzielenie" + division);
        System.out.println("Modulo:" + mod);

firstNumber+=secondNumber;
System.out.println("Wynik dodania" + addition);
firstNumber-=secondNumber;
System.out.println("Odejmowanie:" + subtraction);firstNumber*=secondNumber;
System.out.println("Mnożenie:"+ multiplication);
firstNumber/=secondNumber;
System.out.println("Dzielenie" + division);
firstNumber%=secondNumber;
System.out.println("Modulo:" + mod);



}}