package de.crmtogo.deku.crmtogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

public class consultantEvents extends AppCompatActivity implements OnClickListener {

    private Button TerminAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultant_events);
        TerminAdd = (Button) findViewById(R.id.addTermin);
        TerminAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int ce = v.getId();
        if (ce == R.id.addTermin){
            Intent intent = new Intent(consultantEvents.this, createEvents.class);
            startActivity(intent);
        }

    }
}
