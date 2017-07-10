package com.fdm.neteasyripple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RippleAnimationView rippleAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.ImageView);
        rippleAnimationView = (RippleAnimationView) findViewById(R.id.layout_RippleAnimation);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rippleAnimationView.isRippleRunning()) {
                    rippleAnimationView.stopRippleAnimation();
                } else {
                    rippleAnimationView.startRippleAnimation();
                }
            }
        });
    }
}
