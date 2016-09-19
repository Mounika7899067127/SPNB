package com.example.priga7.spnb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.priga7.spnb.R;

import java.util.zip.Inflater;

/**
 * Created by priga7 on 9/18/2016.
 */
public class contact_us_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.contact_us_branch_list_fragment, null, false);
        return view;
    }
}
