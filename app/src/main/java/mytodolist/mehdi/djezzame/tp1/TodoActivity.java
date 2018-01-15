package mytodolist.mehdi.djezzame.tp1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by djezzame on 15/01/2018.
 */
public class TodoActivity extends Activity implements
        View.OnClickListener {
    private Button button_valider ,button_delete;
    private ListView ma_liste;
    private String[] lis
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
       /* button_valider = (Button) findViewById(R.id.button_valider);
        button_delete= (Button) findViewById(R.id.button_delete);
        button_valider.setOnClickListener(this) ;
        button_delete.setOnClickListener(this) ;
*/
    }


    @Override
    public void onClick(View v) {

       /* TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        switch(v.getId()) {
            case R.id.button_delete:
                textView.setText("");
                break;
            case R.id.button_valider:
                String txt= textView.getText().toString()+"\n"+ editText.getText().toString();
                textView.setText(txt);
                break;
        }


*/
    }

}
