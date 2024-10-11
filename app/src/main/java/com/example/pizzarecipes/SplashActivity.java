package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo ;
        logo = findViewById(R.id.pizzaLogo);
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo.startAnimation(fadeIn);

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);  // Délai de 2 secondes
                    Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();  // Ferme l'activité après le lancement
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();
    }
}