package com.example.sargiskh.githubapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDialog(View view) {

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
//        if (prev != null) {
//            fragmentManager.beginTransaction().remove(prev);
//        }
//        fragmentManager.beginTransaction().addToBackStack(null);

        MyDialog myDialog = new MyDialog();
        myDialog.show(getSupportFragmentManager(), "dialog");
    }

    public void openNewActivity(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}
