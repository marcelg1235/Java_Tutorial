public class Test {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 2;
        int num3 = 3;

        //Arithmetic operators
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num3;
        int rem = num1 % num3;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Remainder: " + rem);

        //Comparison operators
        /*
            ==
            !=
            <
            <=
            >
            >=
         */

        //Logical operators
        /*
            &&
            ||
            !
         */

        int age = 24;
        boolean isStudent = true;

        if (age == 24 || !(isStudent == false)){
            System.out.println("First if");
        } else if (age == 25){
            System.out.println("Second if");
        } else {
            System.out.println("Else");
        }

        //Strings
        String st1 = "Hello";
        String st2 = "Hel";
        st2 += "lo";

        System.out.println("STR1: " +st1);
        System.out.println("STR2: " +st2);

        if (st1.equals(st2)){
            System.out.println("Equal");
        } else {
            System.out.println("NOP");
        }

    }
}
