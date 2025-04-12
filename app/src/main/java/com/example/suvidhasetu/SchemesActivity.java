package com.example.suvidhasetu;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class SchemesActivity extends AppCompatActivity {

    ListView schemesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);

        schemesListView = findViewById(R.id.schemesListView);

        ArrayList<Scheme> schemes = new ArrayList<>();
        schemes.add(new Scheme("PM Awas Yojana", "Affordable homes for all by 2025."));
        schemes.add(new Scheme("Ayushman Bharat", "5 lakh free health insurance annually."));
        schemes.add(new Scheme("Ujjwala Yojana", "Free LPG connections to BPL families."));
        schemes.add(new Scheme("PM Kisan Yojana", "Rs. 6000 yearly to small/marginal farmers."));
        schemes.add(new Scheme("National Scholarship Portal", "Apply to all government scholarships."));

        SchemeAdapter adapter = new SchemeAdapter(this, schemes);
        schemesListView.setAdapter(adapter);
    }
}
