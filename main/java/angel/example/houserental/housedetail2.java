package angel.example.houserental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class housedetail2 extends AppCompatActivity {
    private Button btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housedetail2);
        btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhouseinfo();
            }
        });
    }
    private void openhouseinfo() {
        Intent intent = new Intent(this,houseinfo.class);
        startActivity(intent);
    }
}