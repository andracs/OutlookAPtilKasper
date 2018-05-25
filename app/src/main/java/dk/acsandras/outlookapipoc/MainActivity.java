package dk.acsandras.outlookapipoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final TextView text = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                text.setText("Her er JSON fra Outlook: \n ");
                text.append(" ### Data fra OUTLOOK API \n "  );

                // Vi henter data fra API
                // https://github.com/microsoftgraph/android-java-connect-rest-sample
                // api://35134da3-6f6a-4793-9525-5a649d4c5d1a

                // Se Graph Explorer
                // https://developer.microsoft.com/en-us/graph/graph-explorer

                Arbejdsplan plan = new Arbejdsplan();

                Besog b ;
                b = (Besog) plan.dagens.get(0);
                text.append("Dagnes første besøg " + b.getBodyContent() + b.getStartDateTime().toString());


            }
        });

    }



}
