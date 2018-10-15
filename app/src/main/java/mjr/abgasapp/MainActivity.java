package mjr.abgasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button _startbutton = null;
    protected Button _helpbutton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _startbutton = findViewById(R.id.main_startbutton);
        _helpbutton = findViewById(R.id.main_helpbutton);

    }

    @Override
    public void onClick(View v) {

        if(v == _startbutton){
            Intent calc = new Intent(this, Calculator.class);
        }
    }
}
