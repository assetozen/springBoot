import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {
    final static String salutation = "Hello! ";


    public static void main(String[] args) {

        LambdaExpressions lambdaExpression = new LambdaExpressions();

        //With Type declaration
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + lambdaExpression.operate(10,5,addition));

        //Without type declaration
        MathOperation subtraction = (a,b) -> a-b;
        System.out.println("10 - 5 = " + lambdaExpression.operate(10,5,subtraction));


        //With return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {return a * b;};
        System.out.println("10 * 5 = " + lambdaExpression.operate(10,5,multiplication));

        //Without return statement and without curly braces
        MathOperation division = (a,b) -> a/b;
        System.out.println("10 / 5 = " + lambdaExpression.operate(10,5,division));

        //without parenthesis
        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        greetingService1.sayMessage("Assu");

        //With parenthesis
        GreetingService greetingService2 = (message ) -> System.out.println("Hello " + message);
        greetingService2.sayMessage("Sari");

        //Accessing  final variable
        GreetingService greetingService3 = message -> System.out.println(salutation +" "+ message);
        greetingService3.sayMessage("Assegddddddddd");






    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
