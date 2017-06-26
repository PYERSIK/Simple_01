package com.example.danich.mygit_pr01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NotMainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvOut2;
    Button btnOk2;
    Button btnCancel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_second);

        // Search for View-elements
        tvOut2 = (TextView) findViewById(R.id.tvOut2);
        btnOk2 = (Button) findViewById(R.id.btnOk2);
        btnCancel2 = (Button) findViewById(R.id.btnCancel2);

        // Handler
        btnOk2.setOnClickListener(this);
        btnCancel2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Definite button by ID:
        switch (view.getId()) {
            case R.id.btnOk2:
                tvOut2.setText(R.string.pressed_ok_button);
            break;
            case R.id.btnCancel2:
                tvOut2.setText(R.string.pressed_cancel_button);
            break;
        }
    }
}
