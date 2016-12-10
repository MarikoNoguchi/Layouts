package edu.mnstate.cw3967me.layouts;
/*
show the screen and if the submit button was tapped move on to the next activity
Mariko Noguchi
Due 23/9/2016
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View v){
        Intent intent = new Intent(this, Activity2.class);
        this.startActivity(intent);
    }
}
