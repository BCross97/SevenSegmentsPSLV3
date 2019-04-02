package com.company.logic;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private PreProcessing preProcessing;
    private List<SSNumber> ssNumbers;
    private BufferedReader br;
    private BufferedWriter bw;

    public Controller() {
        preProcessing = new PreProcessing();
        ssNumbers = new ArrayList<SSNumber>();
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public void startProgram() {
        try {
            bw.write("Welcome, this is the pure Java version of the Seven Segments code challenge\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        inputByConsole();

    }

    public void inputByConsole() {
        try {
            bw.write("Input numbers");
            bw.flush();
            for (String number : preProcessing.numbers()) {
                ssNumbers.add(new SSNumber(number));
            }
            getAndPrintNumbers();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                boolean exit = true;
                do {
                    bw.write("Something went wrong, do you wish to try again? (Y/N)");
                    bw.flush();
                    if (br.readLine().charAt(0) == 'y' || br.readLine().charAt(0) == 'Y') {
                        startProgram();
                        return;
                    } else if (br.readLine().charAt(0) == 'n' || br.readLine().charAt(0) == 'N') {
                        bw.write("Bye bye");
                        bw.flush();
                        return;
                    }
                    exit = false;
                } while (!exit);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void getAndPrintNumbers() {
        try {
            for (SSNumber number : ssNumbers) {
                number.setNumber(DecideNumber.getInstance().calculateNumber(number.getSevenSegmentsRepresentation()));
                int n = number.getNumber();
                bw.write(n + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
