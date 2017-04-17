package com.example.yueding.lianxi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by yueding on 2017/4/17.
 * Login
 */

public class LoginActivity extends AppCompatActivity {

    private EditText user, pass;
    private TextView userResult, passResult;
    private Button reset, submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.password);
        reset = (Button) findViewById(R.id.reset);
        submit = (Button) findViewById(R.id.submit);
        userResult = (TextView) findViewById(R.id.userResult);
        passResult = (TextView) findViewById(R.id.passwordResult);

        loginListener submitListener = new loginListener();
        submit.setOnClickListener(submitListener);

        resetListener resetButtonListener = new resetListener();
        reset.setOnClickListener(resetButtonListener);

    }
    private class loginListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            String username = user.getText().toString();
            String password = pass.getText().toString();
            userResult.setText(username);
            passResult.setText(password);
        }
    }
    private class resetListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            user.setText("");
            pass.setText("");
            userResult.setText("");
            passResult.setText("");
        }
    }
}
