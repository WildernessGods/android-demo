package com.wilderness.androiddemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.wilderness.androiddemo.fragment.AnotherRightFragment;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
//        replaceFragment(new RightFragment());

        Button btnLeftFragment = findViewById(R.id.btnLeftFragment);
        btnLeftFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new AnotherRightFragment());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.right_layout, fragment);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }
}