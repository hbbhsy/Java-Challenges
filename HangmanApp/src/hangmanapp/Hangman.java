package hangmanapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    String mysteryWord;
    StringBuilder currentGuess;// StringBuilder allows you to change char inside a string, (regular string are immutable)
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    public Hangman() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();

    }

    public void initializeStreams() throws IOException{
        try {
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedFileReader = new BufferedReader(fileReader);
            String currentLine = bufferedFileReader.readLine();
            while (currentLine != null) {
                dictionary.add(currentLine);
            }
            bufferedFileReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Could not init streams.");
        }
    }

    public String pickWord() {
        Random rand = new Random();
        int wordIndex = Math.abs(rand.nextInt()) % dictionary.size();
        return dictionary.get(wordIndex);
    }

    public StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if (i % 2 == 0) {
                current.append("_");
            } else {
                current.append(" ");
            }
        }
        return current;
    }

    public String getFormalCurrentGuess() {
        return "Current Guess:" + currentGuess.toString();
    }

    public boolean gameOver() {
        return true;
    }

    public String drawPicture() {
        switch(currentTry) {
            case 0: return noPersonDraw();
            case 1: return addHeadDraw();
            case 2: return addBodyDraw();
            case 3: return addOneArmDraw();
            case 4: return addSecondArmDraw();
            case 5: return addFirstLegDraw();
            default: return fullPersonDraw();
        }
    }

    private String noPersonDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        \n" +
                "|       \n"+
                "|        \n" +
                "|       \n" +
                "|\n" +
                "|\n";
    }

    private String addHeadDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|       \n"+
                "|        \n" +
                "|       \n" +
                "|\n" +
                "|\n";
    }

    private String addBodyDraw() {
        return " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|        | \n"+
                "|        |\n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addOneArmDraw() {
        return   " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / |  \n"+
                "|        |\n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addSecondArmDraw() {
        return  " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / | \\ \n"+
                "|        |\n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addFirstLegDraw() {
        return   " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / | \\ \n"+
                "|        |\n" +
                "|       / \n" +
                "|\n" +
                "|\n";
    }

    private String fullPersonDraw() {
        return   " - - - - -\n"+
                "|        |\n"+
                "|        O\n" +
                "|      / | \\ \n"+
                "|        |\n" +
                "|       / \\ \n" +
                "|\n" +
                "|\n";
    }




}
