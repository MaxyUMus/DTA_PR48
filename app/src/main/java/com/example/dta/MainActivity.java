package com.example.dta;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.library.DataModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new MainViewModel();
        Button sendDataButton = findViewById(R.id.sendDataButton);

        sendDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Создание объекта DataModel
                DataModel dataModel = new DataModel("Hello from MainActivity!");

                // Установка данных в ViewModel
                viewModel.setDataModel(dataModel);

                // Создание Intent для перехода на SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("dataModel", dataModel);
                startActivity(intent);
            }
        });
    }
}