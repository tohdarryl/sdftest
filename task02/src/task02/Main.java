package task02;

import java.io.Console;


public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome.");
        Console cons = System.console();
        Boolean stop = false;
        Float sum = 0f;
        Float last = 0f;
        String $last = "$last";

        while (!stop) {
            String line = cons.readLine("> ");
            line = line.trim();

            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Bye bye");
                stop = true;

            } else {

                String[] terms = line.split(" ");
                String command = terms[1];
                // System.out.println("Command:" + command);
                
                //Calculator
                switch (command) {
                    case "+":
                        sum = Float.parseFloat(terms[0]) + Float.parseFloat(terms[2]);
                        System.out.println(sum);
                        last = sum;
                        break;

                    case "-":
                        sum = Float.parseFloat(terms[0]) - Float.parseFloat(terms[2]);
                        System.out.println(sum);
                        last = sum;
                        break;

                    case "/":
                        sum = Float.parseFloat(terms[0]) / Float.parseFloat(terms[2]);
                        System.out.println(sum);
                        last = sum;
                        break;

                    case "*":
                        sum = Float.parseFloat(terms[0]) * Float.parseFloat(terms[2]);
                        System.out.println(sum);
                        last = sum;
                        break;

                }

            } 


        }

    }

    //Create $last method
    public static void last (String $last){
    }

}
