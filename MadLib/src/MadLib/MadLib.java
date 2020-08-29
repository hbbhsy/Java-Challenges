package MadLib;

import java.util.Random;
import java.util.Scanner;

public class MadLib {

    Scanner sc = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    // Getters
    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getAdj1() {
        return adjective1;
    }

    public String getAdj2() {
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun1;
    }

    public String getNoun3() {
        return noun1;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    // Setters
    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdj1(String newAdj1) {
        this.adjective1 = newAdj1;
    }

    public void setAdj2(String newAdj2) {
        this.adjective2 = newAdj2;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public void setAdv(String newAdverb) {
        this.adverb = newAdverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3]; // Array
        while(index < numberHolder.length) {
            numberHolder[index] =num + index;
            index++;
        }
        randomNums = "not " + numberHolder[0] +", not "+numberHolder[1] +", but " + numberHolder[2];
    }

    public void printInstructions() {
        System.out.println("Welcome");
    }

    public void enterName() {
        System.out.println("Give me a name: ");
        setName(sc.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun: ");
        setNoun1(sc.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun: ");
        setNoun2(sc.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me the last noun: ");
        setNoun3(sc.nextLine());
    }

    public void enterAdj1() {
        System.out.println("Give me an adjective: ");
        setAdj1(sc.nextLine());
    }

    public void enterAdj2() {
        System.out.println("Give me another adjective: ");
        setAdj2(sc.nextLine());
    }

    public void enterAdv() {
        System.out.println("Give me an adverb: ");
        setAdv(sc.nextLine());
    }

    public void putTogetherStory() {
//        String story;
        int num = Math.abs(rand.nextInt())%2;
        if (num==0) {
            story = "Jess and her best friend " + getName() + " went to Disney World today!"
                    + " They saw a " + getNoun1() + " in a show at the Magic Kingdom "
                    + "and ate a " + getAdj1() + " feast for dinner. The next day I"
                    + " ran " + getAdj2() + " to meet Mikey Mouse in his " + getNoun2() + " "
                    + "and then that night I gazed in the" + getRandomNums() + " " +
                    getAdj2() + " fireword shooting from the " + getNoun3() + ".";
        } else {
            story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. " +
                    "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2() + ". That night"
                    + " they decided to climb " + getAdverb() + " into the " + getNoun3() + " to get a closer look. "
                    + "The zoo was " + getAdj1() + " at night, but they didn't care... "
                    + "until " + getRandomNums() + " " + getAdj2() + " apes yelled in their faces, making "
                    + "Amanda and " + getName() + " sprint all the way back home.";
        }
        setStory(story);
    }

    public void play() {
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdj1();
        enterAdj2();
        enterAdv();
        setRandomNums();
        putTogetherStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLib game = new MadLib();
        game.printInstructions();
        game.play();
    }
}
