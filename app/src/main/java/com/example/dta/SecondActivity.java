package com.example.dta;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.example.library.DataModel;

public class SecondActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.dataTextView);

        viewModel = new MainViewModel();

        // Получение данных из Intent
        DataModel dataModel = (DataModel) getIntent().getSerializableExtra("dataModel");
        if (dataModel != null) {
            viewModel.setDataModel(dataModel);
        }

        // Наблюдение за данными
        viewModel.getDataModel().observe(this, new Observer<DataModel>() {
            @Override
            public void onChanged(DataModel model) {
                if (model != null) {
                    textView.setText(model.getData());
                }
            }
        });
    }
}
