package angel.example.houserental;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class fillinfo extends AppCompatActivity {

    public static final String NAME_KEY = "House's Name";
    public static final String LOCATION_KEY = "Location";
    public static final String SIZE_KEY = "Size";
    public static final String BED_KEY = "No. of bedrooms";
    public static final String BATH_KEY = "No. of bathrooms";
    public static final String RENT_KEY = "Monthly rent (RM)";
    /*public static final String GUARDED_KEY = "Guarded";
    public static final String UNGUARDED_KEY = "Unguarded";*/
    public static final String CONTACT_KEY = "Contact number";
    //public static final String RENTED_KEY = "House rented";
    public static final String TAG = "HouseInfo";

    private DocumentReference mDocRef = FirebaseFirestore.getInstance().document("HouseRental/House3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillinfo);
    }

    public void saveInfo (View view) {
        EditText nameView = (EditText) findViewById(R.id.Name);
        String nameText = nameView.getText().toString();
        EditText locationView = (EditText) findViewById(R.id.Location);
        String locationText = locationView.getText().toString();
        EditText sizeView = (EditText) findViewById(R.id.Size);
        String sizeText = sizeView.getText().toString();
        EditText bedView = (EditText) findViewById(R.id.Bed);
        String bedText = bedView.getText().toString();
        EditText bathView = (EditText) findViewById(R.id.Bath);
        String bathText = bathView.getText().toString();
        EditText rentView = (EditText) findViewById(R.id.Rent);
        String rentText = rentView.getText().toString();
        EditText contactView = (EditText) findViewById(R.id.Contact);
        String contactText = contactView.getText().toString();
        /*EditText guardedView = (EditText) findViewById(R.id.Guarded);
        String guardedText = guardedView.getText().toString();
        EditText unguardedView = (EditText) findViewById(R.id.Unguarded);
        String unguardedText = unguardedView.getText().toString();
        EditText rentedView = (EditText) findViewById(R.id.Rented);
        String rentedText = rentedView.getText().toString();*/

        if (nameText.isEmpty() || locationText.isEmpty() || sizeText.isEmpty() ||
                bedText.isEmpty() || bathText.isEmpty() || rentText.isEmpty() ||
                contactText.isEmpty()) { return; }

        Map<String, Object> dataToSave = new HashMap<String, Object>();
        dataToSave.put(NAME_KEY,nameText);
        dataToSave.put(LOCATION_KEY,locationText);
        dataToSave.put(SIZE_KEY, sizeText);
        dataToSave.put(BED_KEY, bedText);
        dataToSave.put(BATH_KEY, bathText);
        dataToSave.put(RENT_KEY, rentText);
        /*dataToSave.put(GUARDED_KEY, contactText);
        dataToSave.put(UNGUARDED_KEY, contactText);*/
        dataToSave.put(CONTACT_KEY, contactText);
        //dataToSave.put(RENTED_KEY, contactText);

        mDocRef.set(dataToSave).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Log.d(TAG, "House's Info has been saved!");
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w(TAG, "House's Info was not saved!", e);
            }
        });

    }
}