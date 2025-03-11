package fr.ynov.java.easy;

public class EvenOrOdd {
    public static void main(String[]args){
       Scanner scanner = new Scanner (System.in);
        System.out.println("entre un nombre pour savoir si il est paire ou impaire");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("you're pair");
        }
        else if (number % 2 != 0) {
            System.out.println("you're not pair");


        }
    }
}
