package mytodolist.mehdi.djezzame.tp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by djezzame on 15/01/2018.
 */
public class TodoActivity extends Activity implements
        View.OnClickListener {
    private Button btnValider ,btndelete;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValider = (Button) findViewById(R.id.button_valider);
        btndelete = (Button) findViewById(R.id.button_delete);
        btnValider.setOnClickListener(this) ;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.button_valider:
                Toast.makeText(getApplicationContext(), "Bouton    valider  cliqué", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_delete:
                Toast.makeText(getApplicationContext(), "Bouton    delete  cliqué", Toast.LENGTH_SHORT).show();
                break;




        }




    }
}
