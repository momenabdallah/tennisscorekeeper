package com.example.android.tennisscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // set of all variables
    int addPointForF = 0, addPointForN =0;
    int set1ForF = 1, set2ForF = 1, set3ForF = 1, set4ForF = 1, set5ForF = 1, Set6ForF = 1;
    int set1ForN = 1, set2ForN = 1, set3ForN = 1, set4ForN = 1, set5ForN = 1, set6ForN = 1;
    String adForF ="AD";

    // method to count main points for first player "Federer"
    public void displayPointForF (int points) {
        TextView showMainPoint = findViewById(R.id.fBoardPoints);
        showMainPoint.setText("" + points);
    }

    // method to count the main points for second player "Nadal"
    public void displayPointForN (int points) {
        TextView showMainPoint = findViewById(R.id.nBoardPoints);
        showMainPoint.setText("" + points);
    }

    // set of methods for every set point for the first player "Federer" table
    public void displaySet1WinForF (int setForF){
        TextView showSetWinForF = findViewById(R.id.set1ForF);
        showSetWinForF.setText("" + setForF);
    }
    public void displaySet2WinForF (int setForF){
        TextView showSetWinForF = findViewById(R.id.set2ForF);
        showSetWinForF.setText("" + setForF);
    }
    public void displaySet3WinForF (int setForF){
        TextView showSetWinForF = findViewById(R.id.set3ForF);
        showSetWinForF.setText("" + setForF);
    }
    public void displaySet4WinForF (int setForF){
        TextView showSetWinForF = findViewById(R.id.set4ForF);
        showSetWinForF.setText("" + setForF);
    }
    public void displaySe51WinForF (int setForF){
        TextView showSetWinForF = findViewById(R.id.set5ForF);
        showSetWinForF.setText("" + setForF);
    }

    // set of methods for every set point for the second player "Nadal" table
    public void displaySet1winForN (int setForN){
        TextView showSetWinForN = findViewById(R.id.set1ForN);
        showSetWinForN.setText("" + setForN);
    }
    public void displaySet2winForN (int setForN){
        TextView showSetWinForN = findViewById(R.id.set2ForN);
        showSetWinForN.setText("" + setForN);
    }
    public void displaySet3winForN (int setForN){
        TextView showSetWinForN = findViewById(R.id.set3ForN);
        showSetWinForN.setText("" + setForN);
    }
    public void displaySet4winForN (int setForN){
        TextView showSetWinForN = findViewById(R.id.set4ForN);
        showSetWinForN.setText("" + setForN);
    }
    public void displaySet5winForN (int setForN){
        TextView showSetWinForN = findViewById(R.id.set5ForN);
        showSetWinForN.setText("" + setForN);
    }

    // onClick method for first player "Federer"
    public void incrementPForF(View view){
        addPointForF = addPointForF + 15;
        if (addPointForF == 45)
            addPointForF = 40;
        if(addPointForF == 55){
            if (set1ForF > 6)
                set1ForF = 6;
            displaySet1WinForF(set1ForF);
            set1ForF = set1ForF +1;
            addPointForF = 0;
            addPointForN = 0;
            }
        displayPointForF(addPointForF);
        displayPointForN(addPointForN);
    }

    // onClick method for the second player "Nadal"
    public void incrementPForN(View view) {
        addPointForN = addPointForN + 15;
        if (addPointForN == 45)
            addPointForN = 40;
        if(addPointForN == 55){
            if (set1ForN > 6)
                set1ForN = 6;
            displaySet1winForN(set1ForN);
            set1ForN = set1ForN + 1;
            addPointForN = 0;
            addPointForF = 0;
        }
        displayPointForN(addPointForN);
        displayPointForF(addPointForF);
    }

    // onClick listen method for the reset button
    public void resetAll (View view){
        addPointForF = 0;
        addPointForN = 0;
        set1ForF = 0;
        set1ForN = 0;
        displayPointForF(addPointForF);
        displayPointForN(addPointForN);
        displaySet1WinForF(set1ForF);
        displaySet1winForN(set1ForN);
        // the below variable declared here in order to make those variable start from 1 instead of 0
        set1ForF = 1;
        set1ForN = 1;
    }
}
