package com.example.travel_helper.Screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.travel_helper.R;

public class CheckListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, CheckListActivity.class);
        return intent;
    }
}
