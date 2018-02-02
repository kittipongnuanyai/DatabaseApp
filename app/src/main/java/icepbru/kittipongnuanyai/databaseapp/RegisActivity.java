package icepbru.kittipongnuanyai.databaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText,surnameEditText,
            usernameEditText,passwordEditText,
            phoneEditText, emailEditText;

    private String nameString, surnameString,
            usernameString,passwordString,
            phoneString, emailString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        //Bind Widget
        bindWidget();



    } //Main Class

    public void clickSingUp(View view) {

        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        usernameString = usernameEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();

        //Check Space
        if (checkSpace()) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง", "กรุณากรอกข้อมูลให้ครบทุกช่อง");

        } else {
            //No Space

        }


    }

    private boolean checkSpace() {
        return nameString.equals("")||
                surnameString.equals("")||
                usernameString.equals("")||
                passwordString.equals("")||
                emailString.equals("")||
                phoneString.equals("");
    }










    private void bindWidget() {
        nameEditText = findViewById(R.id.editText3);
        surnameEditText = findViewById(R.id.editText4);
        usernameEditText = findViewById(R.id.editText5);
        passwordEditText = findViewById(R.id.editText6);
        phoneEditText = findViewById(R.id.editText8);
        emailEditText = findViewById(R.id.editText7);

    }
}











