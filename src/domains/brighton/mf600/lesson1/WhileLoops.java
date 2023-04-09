package domains.brighton.mf600.lesson1;

public class WhileLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        // A while loop allows you to iterate through an unknown number of elements
        // The syntax is:
        // while (condition) {
        //     // code to execute
        // }



        do {
            System.out.println(i);
            i++;
        } while (i == 6);


        // A do-while loop is similar to a while loop, but the code inside the loop
        // will always execute at least once
        // The syntax is:
        // do {
        //     // code to execute
        // } while (condition);

    }
}
