package id.ac.poliban.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvResult = (ListView) findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia", "ASEAN", "indonesia"}, {"Palestina", "Timur Tengah", "palestine"}, {"Malaysia", "ASEAN", "malaysia"}};


        NegaraAdapter adapter = new NegaraAdapter(MainActivity.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}