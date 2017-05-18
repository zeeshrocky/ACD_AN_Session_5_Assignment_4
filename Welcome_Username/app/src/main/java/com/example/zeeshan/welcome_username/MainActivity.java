package com.example.zeeshan.welcome_username;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_useridtext;
    EditText et_passwordtext;
    Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_useridtext =(EditText) findViewById(R.id.et_useridtext);
        et_passwordtext = (EditText) findViewById(R.id.et_passwordtext);
        button_login = (Button) findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_useridtext.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"Username cannot be blank",Toast.LENGTH_SHORT).show();
                    et_useridtext.setError("Userid cannot be Empty");
                    Log.e("MainActivity","user id blank");
                    return;

                }
                else if (et_passwordtext.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"Password cannot be blank",Toast.LENGTH_SHORT).show();
                    et_passwordtext.setError("Password cannot be Empty");
                    Log.e("MainActivity","password blank");
                    return;

                }
                else{

                    Toast.makeText(MainActivity.this, "Validation succesfull", Toast.LENGTH_SHORT).show();
                    Log.e("MainActivity","Login succesfull");
                    String usermessage = et_useridtext.getText().toString();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("usermessage",usermessage);
                    startActivity(intent);


                }

            }
        });
    }
}