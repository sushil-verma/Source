package owner.mytest;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private int i=0;
    Runnable runnable=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();

        text = (TextView) findViewById(R.id.text);

         runnable=new Runnable() {
            @Override
            public void run() {

           text.setText(String.valueOf(i));
           i++;
                handler.postDelayed(runnable,100);

            }
        };

        handler.postDelayed(runnable,100);
    }
}
