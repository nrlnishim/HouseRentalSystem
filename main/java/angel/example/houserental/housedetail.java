package angel.example.houserental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class housedetail extends AppCompatActivity {
    private Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housedetail);
        btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhousedetail2();
            }
        });
    }
    private void openhousedetail2() {
        Intent intent = new Intent(this,housedetail2.class);
        startActivity(intent);
    }
}