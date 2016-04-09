package ciclodevida.com.ciclodevida;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("exemplo", getClassName() + ".onStart() chamado.");

        setContentView(R.layout.activity_main);
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

        Button b = (Button) findViewById(R.id.buttonCicloDeVida);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, Main2Activity.class);
        startActivity(it);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
