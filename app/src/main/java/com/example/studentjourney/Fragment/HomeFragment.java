package com.example.studentjourney.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.studentjourney.Activity.LoginActivity;
import com.example.studentjourney.R;
import com.example.studentjourney.Utiles.TokenManager;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        AppCompatButton appCompatButton;
        appCompatButton = view.findViewById(R.id.logout);
        appCompatButton.setOnClickListener(v -> {
            // Clear token
            TokenManager.clearToken(requireContext());

            // Navigate to LoginActivity
            Intent intent = new Intent(requireActivity(), LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clear back stack
            startActivity(intent);
        });
        return  view;
    }
}