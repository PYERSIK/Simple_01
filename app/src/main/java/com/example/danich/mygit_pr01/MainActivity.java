package com.example.danich.mygit_pr01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    Button btnActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_main);

        // Search view elements
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnActivity = (Button) findViewById(R.id.btnActivity);

        // Make click handler
        final View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Definition button by ID
                switch (view.getId()) {
                    case R.id.btnOk: {
                        //Button OK
                        tvOut.setText(R.string.pressed_ok_button);
                        break;
                    }
                    case R.id.btnCancel: {
                        //Button CANCEL
                        tvOut.setText(R.string.pressed_cancel_button);
                        break;
                    }
                    case R.id.btnActivity: {
                        Intent intent = new Intent(MainActivity.this, NotMainActivity.class);
                        startActivity(intent);
                        break;
                    }
                    default:
                        break;
                }
            }

        };

        // Handlers
        btnOk.setOnClickListener(clickListener);
        btnCancel.setOnClickListener(clickListener);
        btnActivity.setOnClickListener(clickListener);
    }
}
