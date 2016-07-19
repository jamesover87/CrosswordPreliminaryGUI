package com.example.joverholtzer.crosswordpreliminarygui;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView instructionTextView;
    private EditText clueEditText;
    private EditText answerEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instructionTextView = (TextView) findViewById(R.id.instructionTextView);
        clueEditText = (EditText) findViewById(R.id.clueEditText);
        answerEditText = (EditText) findViewById(R.id.answerEditText);
        submitButton = (Button) findViewById(R.id.submitButton);
    }
}
