package com.company;

import javafx.stage.FileChooser;
import javafx.stage.Window;

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
        ssNumbers = new ArrayList<>();
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public void startProgram(){
        try {
            bw.write("Welcome, this is the pure Java version of the Seven Segments code challenge\n");
            bw.write("Do you want to load the numbers from a .txt or write it in the console? (txt/console)\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String firstAnswer = br.readLine();
            if(firstAnswer.equals("txt")){
                FileChooser fc = new FileChooser();
                int returnValue = fc.showOpenDialog(null);
            }else if(firstAnswer.equals("console")){

            }else{
                bw.write("Wrong input, try again\n");
                bw.close();
                startProgram();
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
