package com.example.squadzframes.ui.friends;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.squadzframes.FriendPage;
import com.example.squadzframes.R;

public class FriendFragment extends Fragment {



    private FriendViewModel mViewModel;

    public static FriendFragment newInstance() {
        return new FriendFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.friend_fragment, container, false);


        ImageView btn = (ImageView) root.findViewById(R.id.image2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });



        return root;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FriendViewModel.class);
        // TODO: Use the ViewModel

    }

    public void openProfile(){
        Intent intent = new Intent(getActivity(), FriendPage.class);
        startActivity(intent);
    }

}