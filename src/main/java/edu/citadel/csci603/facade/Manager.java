package edu.citadel.csci603.facade;

public class Manager {

    public static void main(String[] args) {
        Aaron aaron = new Aaron();

        System.out.println("Call John for me. Now!");
        aaron.callJohn();

        System.out.println("Call Jane for me. Now!");
        aaron.callJane();

        System.out.println("Text John and ask him if he's hungry");
        System.out.println("Text the same thing to Jane");
        aaron.textJohn("Yo homie, you hungry? You know the boss wants JJ's");
        aaron.textJane("Yo homie, you hungry? You know the boss wants JJ's");

        System.out.println("I'm hungry! Order me a sandwich now. #13 Beach Club");
        aaron.orderJimmyJohns("#13 Beach Club");
    }

}
