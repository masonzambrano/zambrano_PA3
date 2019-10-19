import java.security.SecureRandom;
import java.util.Scanner;

public class problemOne {

    public static void difficultyOne(SecureRandom rand, Scanner scnr) {
        int input = problemType(scnr);
        int correct = 0;
        int incorrect = 0;

        for(int i = 0; i < 10; i++) {

            int num1 = rand.nextInt(9) + 1;
            int num2 = rand.nextInt(9) + 1;

            if(input == 5) {
                input = rand.nextInt(5) + 1;
            }

            if(input == 1) {
                System.out.println("What is " + num1 + " + " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 + num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 + num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 2) {
                System.out.println("What is " + num1 + " x " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 * num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 * num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 3) {
                System.out.println("What is " + num1 + " - " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 - num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 - num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 4) {
                System.out.println("What is " + num1 + " / " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 / num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 / num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else {
                System.out.println("That was not a valid choice.");
                problemType(scnr);
            }
        }

        System.out.println("Number of problems correct: " + correct);
        System.out.println("Number of problems incorrect: " + incorrect);

        if((correct / (double)10) * 100  < 75)
            System.out.println("Please ask your teacher for extra help.");
        else
            System.out.println("Congratulations, you are ready to go to the next level!\n\n");

        keepGoing(scnr, rand);
    }

    public static void difficultyTwo(SecureRandom rand, Scanner scnr) {
        int correct = 0;
        int incorrect = 0;
        int input = problemType(scnr);

        for(int i = 0; i < 10; i++) {

            int num1 = rand.nextInt(90) + 10;
            int num2 = rand.nextInt(90) + 10;

            if(input == 5) {
                input = rand.nextInt(5) + 1;
            }

            if(input == 1) {
                System.out.println("What is " + num1 + " + " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 + num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 + num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 2) {
                System.out.println("What is " + num1 + " x " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 * num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 * num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 3) {
                System.out.println("What is " + num1 + " - " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 - num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 - num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 4) {
                System.out.println("What is " + num1 + " / " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 / num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 / num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else {
                System.out.println("That was not a valid choice.");
                problemType(scnr);
            }
        }

        System.out.println("Number of problems correct: " + correct);
        System.out.println("Number of problems incorrect: " + incorrect);

        if((correct / (double)10) * 100  < 75)
            System.out.println("Please ask your teacher for extra help.");
        else
            System.out.println("Congratulations, you are ready to go to the next level!\n\n");

        keepGoing(scnr, rand);
    }

    public static void difficultyThree(SecureRandom rand, Scanner scnr) {
        int correct = 0;
        int incorrect = 0;
        int input = problemType(scnr);

        for(int i = 0; i < 10; i++) {

            int num1 = rand.nextInt(900) + 100;
            int num2 = rand.nextInt(900) + 100;

            if(input == 5) {
                input = rand.nextInt(5) + 1;
            }

            if(input == 1) {
                System.out.println("What is " + num1 + " + " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 + num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 + num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 2) {
                System.out.println("What is " + num1 + " x " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 * num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 * num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 3) {
                System.out.println("What is " + num1 + " - " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 - num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 - num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 4) {
                System.out.println("What is " + num1 + " / " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 / num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 / num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else {
                System.out.println("That was not a valid choice.");
                problemType(scnr);
            }
        }

        System.out.println("Number of problems correct: " + correct);
        System.out.println("Number of problems incorrect: " + incorrect);

        if((correct / (double)10) * 100  < 75)
            System.out.println("Please ask your teacher for extra help.");
        else
            System.out.println("Congratulations, you are ready to go to the next level!\n\n");

        keepGoing(scnr, rand);
    }

    public static void difficultyFour(SecureRandom rand, Scanner scnr) {
        int correct = 0;
        int incorrect = 0;
        int input = problemType(scnr);

        for(int i = 0; i < 10; i++) {

            int num1 = rand.nextInt(9000) + 1000;
            int num2 = rand.nextInt(9000) + 1000;

            if(input == 5) {
                input = rand.nextInt(5) + 1;
            }

            if(input == 1) {
                System.out.println("What is " + num1 + " + " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 + num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 + num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 2) {
                System.out.println("What is " + num1 + " x " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 * num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 * num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 3) {
                System.out.println("What is " + num1 + " - " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 - num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 - num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else if(input == 4) {
                System.out.println("What is " + num1 + " / " + num2 + "?");
                double result = scnr.nextDouble();

                if (result == num1 / num2) {
                    correctComment(rand);
                    correct++;
                }

                if (result != num1 / num2) {
                    incorrectComment(rand);
                    incorrect++;
                }
            }

            else {
                System.out.println("That was not a valid choice.");
                problemType(scnr);
            }
        }

        System.out.println("Number of problems correct: " + correct);
        System.out.println("Number of problems incorrect: " + incorrect);

        if((correct / (double)10) * 100  < 75)
            System.out.println("Please ask your teacher for extra help.");
        else
            System.out.println("Congratulations, you are ready to go to the next level!\n\n");

        keepGoing(scnr, rand);
    }

    public static void correctComment(SecureRandom rand) {
        int comment = rand.nextInt(4) + 1;

        switch(comment) {
            case 1:
                System.out.println("Very good!\n");
                break;
            case 2:
                System.out.println("Excellent!\n");
                break;
            case 3:
                System.out.println("Nice work!\n");
                break;
            case 4:
                System.out.println("Keep up the good work!\n");
                break;
        }
    }

    public static void incorrectComment(SecureRandom rand) {
        int comment = rand.nextInt(4) + 1;

        switch(comment) {
            case 1:
                System.out.println("No. Please try again.\n");
                break;
            case 2:
                System.out.println("Wrong. Try once more.\n");
                break;
            case 3:
                System.out.println("Don't give up!\n");
                break;
            case 4:
                System.out.println("No. Keep trying.\n");
                break;
        }
    }

    public static void difficulty(Scanner scnr, SecureRandom rand) {
        System.out.println("Please select a difficulty between 1 and 4.");

        int input = scnr.nextInt();

        switch(input){
            case 1:
                difficultyOne(rand, scnr);
                break;
            case 2:
                difficultyTwo(rand, scnr);
                break;
            case 3:
                difficultyThree(rand, scnr);
                break;
            case 4:
                difficultyFour(rand, scnr);
                 break;
            default:
                System.out.println("That is not a valid choice.");
                difficulty(scnr, rand);
                break;
        }
    }

    public static void keepGoing(Scanner scnr, SecureRandom rand) {
        System.out.println("Would you like to begin a new session? Enter 1 to continue and 0 to quit.");
        int input = scnr.nextInt();

        if(input == 1)
            difficulty(scnr, rand);
        else if(input == 0)
            return;
        else {
            System.out.println("Not a valid choice.");
            keepGoing(scnr, rand);
        }

    }

    public static int problemType(Scanner scnr) {
        System.out.println("Please select the type of problems you want to solve.\nEnter 1 for Addition\nEnter 2 for Multiplication\nEnter 3 for Subtraction\nEnter 4 for Division\nEnter 5 for a mix of all\n");
        int input = scnr.nextInt();
        return input;
    }

    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Scanner scnr = new Scanner(System.in);

        difficulty(scnr, rand);

    }
}
