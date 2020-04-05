package com.hfad.bitsandpizza;


import android.app.ListFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaFragment extends ListFragment {


    public PizzaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] pizzas = {"Diavolo","Funghi"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,pizzas);
        setListAdapter(arrayAdapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }

}
