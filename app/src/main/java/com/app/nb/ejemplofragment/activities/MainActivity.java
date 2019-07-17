package com.app.nb.ejemplofragment.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.app.nb.ejemplofragment.R;
import com.app.nb.ejemplofragment.fragments.DataFragment;
import com.app.nb.ejemplofragment.fragments.DetailsFragment;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void sendData(String text) {
        //LLama al metodo rendeText del DetailsFragment
        // pasado el texto que recibimos por parametro del DataFragment

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetails);
        detailsFragment.renderText(text);
    }
}
