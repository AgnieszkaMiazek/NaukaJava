public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true; // boolean firstValue = 2 > 1;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || lub => true gdy jedno wyrażenie jest równe true (mniej restrykcyjne) wystarczy jedno true
        System.out.println(firstValue || secondValue);
        System.out.println(firstValue || fourthValue);

        // ! negacja - zwraaca wartośc przeciwną do wyrażenia przed którym się znajduje

        System.out.println(!firstValue); // false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue&&secondValue)); // true
    }
}
