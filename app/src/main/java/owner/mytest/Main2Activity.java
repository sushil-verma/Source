package owner.mytest;

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
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.contaner ,new FragmentLifeCycleTest()).commit();

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/

        Log.i("Activity", "onCrete");
        System.out.print("onCreate");


    }

@Override
    public void onStart(){
        super.onStart();
    Log.i("Activity", "onStart");
    System.out.print("onStart");

}

@Override
    public  void onResume(){
        super.onResume();
    Log.i("Activity", "onResume");
    System.out.print("onResume");


}

@Override
    public void onPause() {
        super.onPause();
    Log.i("Activity", "onPause");
    System.out.print("onPause");




}

@Override
  public  void    onStop() {
        super.onStop();
    Log.i("Activity", "onStop");
    System.out.print("onStop");

}

@Override
    public void onDestroy()
{
    super.onDestroy();
    Log.i("Activity", "onDestroy");
    System.out.print("onDestroy");


}

}
