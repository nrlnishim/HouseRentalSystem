package angel.example.houserental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class updaterent extends AppCompatActivity {
    private Button btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updaterent);
        btn13 = (Button) findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrented();
            }
        });
    }
    private void openrented() {
        Intent intent = new Intent(this,rented.class);
        startActivity(intent);
    }
}