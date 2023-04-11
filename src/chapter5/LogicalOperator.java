package chapter5;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional AND (&&)", "false && false",
                (false && false), "true && false", (true && false), "false && true",
                (false && true), "true && true", (true && true));


        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional OR (||)", "false || false",
                (false || false), "true || false", (true || false), "false || true",
                (false || true), "true && true", (true || true));


        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean Logical AND (&)", "false & false",
                (false & false), "true && false", (true & false), "false && true",
                (false & true), "true && true", (true & true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean Logical exclusive OR (^)", "false ^ false",
                (false ^ false), "true ^ false", (true ^ false), "false ^ true",
                (false ^ true), "true ^ true", (true ^ true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean Logical inclusive OR (|)", "false | false",
                (false | false), "true ^ false", (true | false), "false | true",
                (false | true), "true ^ true", (true | true));


        System.out.printf("%s%n%s:  %b%n%s: %b%n%n", "logical NOT(!)", "!false", (!false), "!true", (!true));
//    int count = 0;
//    do{
//        System.out.printf("d ", count);
//        count++;
//    }
//    while(count < 10) ;
//        System.out.println();
//    }
    }
} 
