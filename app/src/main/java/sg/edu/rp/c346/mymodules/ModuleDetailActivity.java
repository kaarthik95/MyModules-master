package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView mc , mn, ay , sm , Mc , ven;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        Log.d("MainActivity", "onCreate() called.");

        mc = (TextView) findViewById(R.id.MC);
        mn = (TextView) findViewById(R.id.MN);
        ay = (TextView) findViewById(R.id.AY);
        sm = (TextView) findViewById(R.id.SM);
        Mc = (TextView) findViewById(R.id.mc);
        ven = (TextView) findViewById(R.id.Ven);
        btn = (Button) findViewById(R.id.btn);

        Intent receive = getIntent();
        String Mcode = receive.getStringExtra("code");
        String Mname = receive.getStringExtra("name");
        String Ay = receive.getStringExtra("AY");
        String Sm = receive.getStringExtra("SM");
        String Mcredit = receive.getStringExtra("Mc");
        String Venue = receive.getStringExtra("Ven");
        mc.setText("Module Code: " + Mcode);
        mn.setText("Module Name: " + Mname);
        ay.setText("Academic Year: " + Ay);
        sm.setText("Semester: " + Sm);
        Mc.setText("Module Credit: " + Mcredit);
        ven.setText("Venue: " + Venue);


        Intent received = getIntent();
        String code = received.getStringExtra("code");
        String name = received.getStringExtra("name");
        String aY = received.getStringExtra("AY");
        String sM = received.getStringExtra("SM");
        String credit = received.getStringExtra("Mc");
        String venue = received.getStringExtra("Ven");
        mc.setText("Module Code: " + code);
        mn.setText("Module Name: " + name);
        ay.setText("Academic Year: " + aY);
        sm.setText("Semester: " + sM);
        Mc.setText("Module Credit: " + credit);
        ven.setText("Venue: " + venue);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(),MainActivity.class);
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
