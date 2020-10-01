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
        mysterWord = pickWord();
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
    }

    public String drawPicture() {
        switch(currentTry) {
            case 0: return noPersonDraw();
            case 1: return addHeadDraw();
            case 2: return addBodayDraw();
            case 3: return addOneArmDraw();
            case 4: return addSecondArmDraw();
            case 5: return addFirstLegDraw();
            default: return fullPersonDraw();
        }
    }

    public String noPersonDraw() {
        return "";
    }

    public String addHeadDraw() {
        return "";
    }

    public String addBodyDraw() {
        return "";
    }

    public String


}
