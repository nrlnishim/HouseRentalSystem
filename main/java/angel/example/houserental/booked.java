package angel.example.houserental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class booked extends AppCompatActivity {
    private Button btn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booked);
        btn12 = (Button) findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openupdaterent();
            }
        });
    }
    private void openupdaterent() {
        Intent intent = new Intent(this,updaterent.class);
        startActivity(intent);
    }
}