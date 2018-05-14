package com.bagicode.www.bagiregisterapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    TextView oneTextView, twoTextView, threeTextView;
    LinearLayout oneLinearLayout, twoLinearLayout, threeLinearLayout;
    LinearLayout oneClickLinearLayout, twoClickLinearLayout, threeClickLinearLayout;
    Button oneButton, twoButton, submitButton;
    Button oneBackButton, twoBackButton;
    EditText userNameEditText,passwordEditText,emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the Widget Id Here
        init();
        //End
        //Using the click listener here
        listener();
        //End
    }

    private void listener() {
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(userNameEditText.getText().length()==0){
                    Toast.makeText(MainActivity.this, "Enter User Name.", Toast.LENGTH_SHORT).show();

                }
                else{

                  oneTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                  twoTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_select));
                  threeTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                  oneTextView.setTextColor(Color.parseColor("#FFF14E4E"));
                  twoTextView.setTextColor(Color.parseColor("#ffffff"));

                  oneLinearLayout.setVisibility(View.GONE);
                  twoLinearLayout.setVisibility(View.VISIBLE);
                  threeLinearLayout.setVisibility(View.GONE);


                  oneClickLinearLayout.setVisibility(View.GONE);
                  twoClickLinearLayout.setVisibility(View.VISIBLE);
                  threeClickLinearLayout.setVisibility(View.GONE);

              }
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(passwordEditText.getText().length()==0){
                    Toast.makeText(MainActivity.this, "Enter User Password.", Toast.LENGTH_SHORT).show();

                }
                else {
                    oneTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                    twoTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                    threeTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_select));
                    oneTextView.setTextColor(Color.parseColor("#FFF14E4E"));
                    twoTextView.setTextColor(Color.parseColor("#FFF14E4E"));
                    threeTextView.setTextColor(Color.parseColor("#ffffff"));

                    oneLinearLayout.setVisibility(View.GONE);
                    twoLinearLayout.setVisibility(View.GONE);
                    threeLinearLayout.setVisibility(View.VISIBLE);

                    oneClickLinearLayout.setVisibility(View.GONE);
                    twoClickLinearLayout.setVisibility(View.GONE);
                    threeClickLinearLayout.setVisibility(View.VISIBLE);
                }
            }
        });


        twoBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                twoTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_select));
                threeTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                oneTextView.setTextColor(Color.parseColor("#FFF14E4E"));
                twoTextView.setTextColor(Color.parseColor("#ffffff"));
                threeTextView.setTextColor(Color.parseColor("#FFF14E4E"));

                oneLinearLayout.setVisibility(View.GONE);
                twoLinearLayout.setVisibility(View.VISIBLE);
                threeLinearLayout.setVisibility(View.GONE);


                oneClickLinearLayout.setVisibility(View.GONE);
                twoClickLinearLayout.setVisibility(View.VISIBLE);
                threeClickLinearLayout.setVisibility(View.GONE);
            }
        });
        oneBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_select));
                twoTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                threeTextView.setBackground(getResources().getDrawable(R.drawable.rectangle_unselect));
                oneTextView.setTextColor(Color.parseColor("#ffffff"));
                twoTextView.setTextColor(Color.parseColor("#FFF14E4E"));
                threeTextView.setTextColor(Color.parseColor("#FFF14E4E"));

                oneLinearLayout.setVisibility(View.VISIBLE);
                twoLinearLayout.setVisibility(View.GONE);
                threeLinearLayout.setVisibility(View.GONE);


                oneClickLinearLayout.setVisibility(View.VISIBLE);
                twoClickLinearLayout.setVisibility(View.GONE);
                threeClickLinearLayout.setVisibility(View.GONE);
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailEditText.getText().length()==0){
                    Toast.makeText(MainActivity.this, "Please Enter User Email.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sucessfully Post.    ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void init() {
        //Here Declare the TextView ID
        oneTextView = (TextView) findViewById(R.id.txtOne);
        twoTextView = (TextView) findViewById(R.id.txtTwo);
        threeTextView = (TextView) findViewById(R.id.txtThree);
        //End
        //Here Declare the LinearLayout ID
        oneLinearLayout = (LinearLayout) findViewById(R.id.layOne);
        twoLinearLayout = (LinearLayout) findViewById(R.id.layTwo);
        threeLinearLayout = (LinearLayout) findViewById(R.id.layThree);

        oneClickLinearLayout = (LinearLayout) findViewById(R.id.layClickOne);
        twoClickLinearLayout = (LinearLayout) findViewById(R.id.layClickTwo);
        threeClickLinearLayout = (LinearLayout) findViewById(R.id.layClickThree);
        //End
        //Here Declare the Button ID
        oneButton = (Button) findViewById(R.id.btnOne);
        twoButton = (Button) findViewById(R.id.btnTwo);
        submitButton = (Button) findViewById(R.id.btnSubmit);

        oneBackButton = (Button) findViewById(R.id.btnBackOne);
        twoBackButton = (Button) findViewById(R.id.btnBackTwo);

        //Here Declarte the EditText Value
        userNameEditText=(EditText)findViewById(R.id.etUserName);
        passwordEditText=(EditText)findViewById(R.id.etUserPassword);
        emailEditText=(EditText)findViewById(R.id.etUserEmail);
        //End

    }
}
