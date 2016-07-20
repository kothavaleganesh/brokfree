package wohlig.com.brokfree;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mahesh on 6/28/2016.
 */
public class LoginActivity extends Activity {
    Button login;
    TextView toolbartitle,tvusername,tvpassword;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login= (Button) findViewById(R.id.login_button);
        login.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        username= (EditText) findViewById(R.id.et_username);
        username.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        password= (EditText) findViewById(R.id.et_password);
        password.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Regular.ttf"));

        tvusername= (TextView) findViewById(R.id.tvusername);
        tvusername.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));

        tvpassword= (TextView) findViewById(R.id.tvpassword);
        tvpassword.setTypeface(Typeface.createFromAsset(getAssets(), "NotoSans-Bold.ttf"));



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hi", String.valueOf(username.getText()));
                if(String.valueOf(username.getText()).equals("wohlig") &&String.valueOf(password.getText()).equals("1234")){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }else
                {
                    Toast.makeText(LoginActivity.this, "please enter valid username and password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
