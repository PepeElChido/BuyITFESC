package com.automatasoftware.buyitfesc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuBuyit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_buyit);
    }

    public void Categories (View view){

        Intent categories = new Intent(getApplicationContext(), Categorias.class);
        startActivity(categories);
    }


}