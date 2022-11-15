package com.example.bodyandiana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button3, button4, button5, button6, button7, button8, button9;
    TextView textView;
    String krestik[][] = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
    String znak, znak1;
    int r1, r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
        znak = "X";
        znak1 = "O";


    }

    /// ходы чела
    public void k1(View v) {
        krestik[0][0] = znak;
        button.setText(znak);
        button.setEnabled(false);
        proverka();
        obr_hod();
    }

    public void k2(View v) {
        krestik[0][1] = znak;
        button2.setText(znak);
        button2.setEnabled(false);
        proverka();
        obr_hod();
    }

    public void k3(View v) {
        krestik[0][2] = znak;
        button3.setText(znak);
        button3.setEnabled(false);
        proverka();
        obr_hod();

    }

    public void k4(View v) {
        krestik[1][0] = znak;
        button4.setText(znak);
        button4.setEnabled(false);
        proverka();
        obr_hod();

    }

    public void k5(View v) {
        krestik[1][1] = znak;
        button5.setText(znak);
        button5.setEnabled(false);
        proverka();
        obr_hod();

    }

    public void k6(View v) {
        krestik[1][2] = znak;
        button6.setText(znak);
        button6.setEnabled(false);
        proverka();
        obr_hod();

    }

    public void k7(View v) {
        krestik[2][0] = znak;
        button7.setText(znak);
        button7.setEnabled(false);
        proverka();
        obr_hod();

    }

    public void k8(View v) {
        krestik[2][1] = znak;
        button8.setText(znak);
        button8.setEnabled(false);
        proverka();
        obr_hod();

    }

    public void k9(View v) {
        krestik[2][2] = znak;
        button9.setText(znak);
        button9.setEnabled(false);
        proverka();
        obr_hod();


    }


    /// ходы компа
    public void random_comp() {
        r1 = (int) (0 + (Math.random() * 3));
        r2 = (int) (0 + (Math.random() * 3));
    }

    public void obr_hod() {
        random_comp();
        if (krestik[r1][r2].equals("X") || krestik[r1][r2].equals("O")) {

            random_comp();
        }

        krestik[r1][r2] = znak1;
        smotr();
        proverka();
        onStart();
    }
    public void smotr() {
        button.setText(krestik[0][0]);
        button2.setText(krestik[0][1]);
        button3.setText(krestik[0][2]);
        button4.setText(krestik[1][0]);
        button5.setText(krestik[1][1]);
        button6.setText(krestik[1][2]);
        button7.setText(krestik[2][0]);
        button8.setText(krestik[2][1]);
        button9.setText(krestik[2][2]);
    }
    public void proverka(){
        if ((button.getText().equals("X")) && (button2.getText().equals("X")) && (button3.getText().equals("X"))) {
            textView.setText("Игрок победил");
        }

        if ((button.getText().equals("X")) && (button4.getText().equals("X")) && (button7.getText().equals("X"))) {
            textView.setText("Игрок победил");
        }

        if ((button.getText().equals("X")) && (button5.getText().equals("X")) && (button9.getText().equals("X"))) {
            textView.setText("Игрок победил");
                            }
      }

    }


