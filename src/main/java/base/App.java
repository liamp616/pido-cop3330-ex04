/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Liam Pido
 */

package base;

import java.util.Scanner;

/*
Exercise 4 - Mad Lib

Mad libs are a simple game where you create a story template with blanks for words. You, or another player,
then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output

Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints

Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges

Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String noun = myApp.readNoun();
        String verb = myApp.readVerb();
        String adjective = myApp.readAdjective();
        String adverb = myApp.readAdverb();
        myApp.madlib(noun, verb, adjective, adverb);
    }

    public void madlib(String noun, String verb, String adjective, String adverb) {
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }

    public String readAdverb() {
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();
        return adverb;
    }

    public String readAdjective() {
        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();
        return adjective;
    }

    public String readVerb() {
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        return verb;
    }

    public String readNoun() {
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        return noun;
    }


}
