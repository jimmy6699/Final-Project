/*package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class deliveryandreport extends AppCompatActivity {

   private Button send_btn;
    private EditText set_drink;
    private RadioGroup rg1,rg2,rg3;

    private String ingredient = "野菇";
    private String sauce = "茄汁";
    private String extra = "5元";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deliveryandreport);

        rg1 = findViewById(R.id.pastaingredient);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.pastaingredient1:
                        ingredient= "野菇";
                        break;
                    case R.id.pastaingredient2:
                        ingredient = "嫩雞";
                        break;
                    case R.id.pastaingredient3:
                        ingredient = "德式香腸";
                        break;
                    case R.id.pastaingredient4:
                        ingredient = "培根";
                        break;
                    case R.id.pastaingredient5:
                        ingredient = "明太子";
                        break;
                    case R.id.pastaingredient6:
                        ingredient = "海鮮";
                        break;
                }
            }
        });

        rg2 = findViewById(R.id.noodleselect);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.noodleselectbtn:
                        sauce = "微冰";
                        break;
                    case R.id.noodleselectbtn1:
                        sauce = "少冰";
                        break;
                    case R.id.noodleselectbtn2:
                        sauce = "正常冰";
                        break;
                    case R.id.noodleselectbtn3:
                        sauce = "正常冰";
                        break;
                }
            }
        });

        rg3 = findViewById(R.id.extranoodle);
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.extranoodle1:
                        sauce = "5元";
                        break;
                    case R.id.extranoodle2:
                        sauce = "10元";
                        break;

                }
            }
        });

    }
}*/