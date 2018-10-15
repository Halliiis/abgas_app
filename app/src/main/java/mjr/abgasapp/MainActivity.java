package mjr.abgasapp;

import android.app.Activity;
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

        _startbutton.setOnClickListener(this);
        _helpbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v == _startbutton){

            Intent rechner = new Intent(this, Rechner.class);
            startActivity(rechner);
        }
        else if (v == _helpbutton){

            Intent help = new Intent(this, Hilfe.class);
            startActivity(help);
        }
    }
}
