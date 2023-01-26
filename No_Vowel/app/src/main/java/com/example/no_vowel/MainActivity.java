package com.example.no_vowel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkForInput(View trigger){
        TextView displayTV = (TextView)findViewById(R.id.displayTV);
        TextView phraseET = (TextView)findViewById(R.id.phraseET);
        System.out.println(trigger);
        System.out.println("Wow. Mutate Button Pressed. Checking for input now.");

        if(phraseET.getText() != ""){
            System.out.println("Wow! Input found!");
            String string_to_change = String.valueOf(phraseET.getText());
            String changed_string;
            changed_string = mutate(string_to_change);
            System.out.println(changed_string);
            displayTV.setText(changed_string);
        }
        else{
            System.out.println("Wow! No input found!");
            String str = "Wow! No input found!";
            displayTV.setText(str);
        }

    }

    public String mutate(String string_in){
        //For loop to check each character for vowel
        String new_string = "";

        for(int i = 0; i < string_in.length(); i++){
            if(string_in.charAt(i) == 'a'
                    || string_in.charAt(i) == 'e'
                    || string_in.charAt(i) == 'i'
                    || string_in.charAt(i) == 'o'
                    || string_in.charAt(i) == 'u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Not a Vowel");
                new_string += string_in.charAt(i);
            }
        }

        return new_string;
    }

    public String xOut(String string_in){
        String new_string = "";

        return new_string;
    }

    public String cycle(String string_in){
        String new_string = "";

        return new_string;
    }

    public String doubleString(String string_in){
        String new_string = "";

        return new_string;
    }
}