package com.lj.tipboax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lj.toastlibrary.LToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LToast.init(this);
    }
}