package com.app.nb.ejemplofragment.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.app.nb.ejemplofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {

    EditText etData;
    Button button;
    private DataListener callback;


    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            //llega contexto del activity, verificamos que implementa la interface DataListener
            callback = (DataListener) context;
        } catch (Exception e) {
            Log.i("Error", e.getMessage());
            throw new ClassCastException(context.toString() + "deberia implementar DataListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_data, container, false);

        etData = view.findViewById(R.id.etData);
        button = view.findViewById(R.id.btnEnviar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData(etData.getText().toString());
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    private void sendData(String text) {
        callback.sendData(text);
    }

    public interface DataListener {
        void sendData(String text);
    }

}
