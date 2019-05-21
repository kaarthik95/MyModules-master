package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346 , c382;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate() called.");

        c346 = (TextView) findViewById(R.id.C346);
        c346.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("AY","2019");
                intent.putExtra("SM","1");
                intent.putExtra("Mc","4");
                intent.putExtra("Ven","W66H");
                startActivity(intent);
            }
        });

        c382 = (TextView) findViewById(R.id.C382);
        c382.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C382");
                intent.putExtra("name", "IT Service Delivery");
                intent.putExtra("AY","2019");
                intent.putExtra("SM","1");
                intent.putExtra("Mc","4");
                intent.putExtra("Ven","W66H");
                startActivity(intent);

            }
        });


    }

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();

    }
}
