package com.terry.view.swipeanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.terry.view.swipeanimationbutton.SwipeAnimationButton;
import com.terry.view.swipeanimationbutton.SwipeAnimationListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeAnimationButton bsb = (SwipeAnimationButton) findViewById(R.id.swipe_btn);
        bsb.setOnSwipeAnimationListener(new SwipeAnimationListener() {
            @Override
            public void onSwiped(boolean isRight) {
                if (isRight) {
                    Toast.makeText(getApplicationContext(), "right Swipe!!!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "left Swipe!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
