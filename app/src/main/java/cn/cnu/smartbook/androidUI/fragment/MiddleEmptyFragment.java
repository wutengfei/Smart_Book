package cn.cnu.smartbook.androidUI.fragment;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.cnu.smartbook.R;

public class MiddleEmptyFragment extends Fragment {

    public MiddleEmptyFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_middle_empty, container, false);
    }
}
