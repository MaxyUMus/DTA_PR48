package com.example.dta;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.library.DataModel;

public class MainViewModel extends ViewModel {
    private final MutableLiveData<DataModel> dataModel = new MutableLiveData<>();

    public void setDataModel(DataModel model) {
        dataModel.setValue(model);
    }

    public LiveData<DataModel> getDataModel() {
        return dataModel;
    }
}
