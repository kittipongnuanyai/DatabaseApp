package icepbru.kittipongnuanyai.databaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void clickSingUp(View view) {
        startActivity(new Intent(LoginActivity.this,RegisActivity.class));
    }

    public void clickSingIn(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }


}
