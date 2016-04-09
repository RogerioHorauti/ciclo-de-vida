package ciclodevida.com.ciclodevida;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("exemplo", getClassName() + ".onStart() chamado.");

        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("exemplo", getClassName() + ".onStart() chamado.");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("exemplo", getClassName() + ".onRestart() chamado.");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("exemplo", getClassName() + ".onResume() chamado.");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("exemplo", getClassName() + ".onPause() chamado.");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("exemplo", getClassName() + ".onStop() chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("exemplo", getClassName() + ".onDestroy() chamado.");
    }

    private String getClassName() {
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));

    }

}
