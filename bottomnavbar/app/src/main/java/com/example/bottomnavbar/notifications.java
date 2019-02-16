package com.example.bottomnavbar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link notifications.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link notifications#newInstance} factory method to
 * create an instance of this fragment.
 */
public class notifications extends Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            //just change the fragment_dashboard
            //with the fragment you want to inflate
            //like if the class is HomeFragment it should have R.layout.home_fragment
            //if it is DashboardFragment it should have R.layout.fragment_dashboard
            return inflater.inflate(R.layout.fragment_notifications, null);
        }
    }