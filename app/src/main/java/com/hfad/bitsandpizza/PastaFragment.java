package com.hfad.bitsandpizza;


import android.app.ListFragment;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PastaFragment extends ListFragment {


    public PastaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] pastas = {"Spaghetti Bolognese","Lasagne"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,pastas);
        setListAdapter(arrayAdapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

}
