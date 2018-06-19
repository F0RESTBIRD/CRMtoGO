package de.crmtogo.deku.crmtogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createEvents extends AppCompatActivity implements View.OnClickListener {

    private Button TerminSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_events);
        TerminSave = (Button) findViewById(R.id.saveTermin);
        TerminSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int ce = v.getId();
        if (ce == R.id.saveTermin){
            Intent intent = new Intent(createEvents.this, consultantEvents.class);
            startActivity(intent);
        }

    }


}
