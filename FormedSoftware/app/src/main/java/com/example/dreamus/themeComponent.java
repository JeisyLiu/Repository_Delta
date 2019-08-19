package com.example.dreamus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class themeComponent extends AppCompatActivity {

    Button btnOrange, btnGreen, btnBlue, btnDark, btnWhite, btnSave;
    View holderbg,dynamicbg;
    String SHARED_REFS= "code_Theme";
    TextView clickedTheme;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.theme_main);

        btnSave=findViewById(R.id.button6);

        //btnCLicked;

        btnOrange=findViewById(R.id.button3);
        btnGreen=findViewById(R.id.button2);
        btnBlue=findViewById(R.id.button);
        btnDark=findViewById(R.id.button4);
        btnWhite=findViewById(R.id.button5);

        holderbg=findViewById(R.id.theme_holder);
        dynamicbg=findViewById(R.id.theme_dynamic);

        holderbg.setBackgroundResource(R.drawable.theme_blue);
        holderbg.setScaleX(3);
        holderbg.setScaleY(3);

        btnBlue.setScaleX(1.5f);
        btnBlue.setScaleY(1.5f);
        //sharedPreferences

    }
    public void themeTest(){
        clickedTheme=findViewById(R.id.theme_color_text);
        clickedTheme.setText(R.string.confirm);

    }

}
