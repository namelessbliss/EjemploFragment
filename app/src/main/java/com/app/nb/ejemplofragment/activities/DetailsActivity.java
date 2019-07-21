package com.app.nb.ejemplofragment.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.app.nb.ejemplofragment.R;
import com.app.nb.ejemplofragment.fragments.DetailsFragment;

public class DetailsActivity extends AppCompatActivity {

    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if (getIntent().getExtras() != null) {
            text = getIntent().getStringExtra("text");
        }

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetails);
        detailsFragment.renderText(text);

    }
}
