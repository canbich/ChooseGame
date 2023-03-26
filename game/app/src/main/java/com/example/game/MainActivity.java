package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView rakipImage, seninImage;
    Button one, two, three, four, five, six, seven, eight, nine;
    TextView tahmin, skor;
    int yourscore = 0;
    int rakipscore = 0;

    Random rastgele = new Random();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skor = findViewById(R.id.textScore);
        tahmin = findViewById(R.id.tahminText);
        one = findViewById(R.id.buttonOne);
        two = findViewById(R.id.buttonTwo);
        three = findViewById(R.id.buttonThree);
        four = findViewById(R.id.buttonFour);
        five = findViewById(R.id.buttonFive);
        six = findViewById(R.id.buttonSix);
        seven = findViewById(R.id.buttonSeven);
        eight = findViewById(R.id.buttonEight);
        nine = findViewById(R.id.buttonNine);
        rakipImage = findViewById(R.id.rakipImage);
        seninImage = findViewById(R.id.yourImage);


        one.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("UseCompatLoadingForDrawables")
            @Override

            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim1));
                int seninSayi = 1;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));

                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim2));


                int seninSayi = 2;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim3));
                int seninSayi = 3;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim4));
                int seninSayi = 4;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim5));
                int seninSayi = 5;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim6));
                int seninSayi = 6;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);

                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim7));
                int seninSayi = 7;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim8));
                int seninSayi = 8;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);

                }


            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seninImage.setBackground(getResources().getDrawable(R.drawable.resim9));
                int seninSayi = 9;
                int rakipSayi = (rastgele.nextInt(9) + 1);
                String path = "resim" + String.valueOf(rakipSayi);
                rakipImage.setImageResource(getResources().getIdentifier(path, "drawable", getPackageName()));
                if (rakipSayi == seninSayi) {
                    tahmin.setText("KAZANDINIZ!! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore = rakipscore;
                    yourscore += 1;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                } else {
                    tahmin.setText("KAYBETTİNİZ !! RAKİBİN SAYISI: " + rakipSayi + " SIZIN TAHMİNİNİZ: " + seninSayi);
                    rakipscore += 1;
                    yourscore = yourscore;
                    skor.setText("RAKIP: " + "" + rakipscore + " SIZ: " + yourscore);
                }


            }
        });


    }


}