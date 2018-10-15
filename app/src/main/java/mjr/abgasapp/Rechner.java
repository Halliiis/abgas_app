package mjr.abgasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Rechner extends AppCompatActivity implements View.OnClickListener{


    protected EditText _verbrauch = null;
    protected RadioButton _benzin = null;
    protected RadioButton _diesel = null;
    protected Button _berechne = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechner);


        _verbrauch = findViewById(R.id.verbrauch);
        _benzin = findViewById(R.id.radioBenzin);
        _diesel = findViewById(R.id.radioDiesel);
        _berechne = findViewById(R.id.berechnebutton);

    }

    @Override
    public void onClick(View v) {

        if (v == _berechne) {

        }
    }


}
