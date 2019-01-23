package e.sleeping.encryption;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textPassword;
    Button click;
    TextView textView;
    String pass = "swati";
    int a=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPassword = findViewById(R.id.editText);
        click = findViewById(R.id.button);
        textView = findViewById(R.id.editText2);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = textPassword.getText().toString();
                if (s.equals(pass))
                {
                    textView.setText("You have logged in");
                }
                else
                {
                    a++;
                    if(a<=3)
                    {
                        textView.setText("try again");
                    }
                    else
                    {
                        click.setEnabled(false);
                        textView.setText("Warning");
                    }
                }
            }
        });
    }
}
