package cn.cnu.smartbook.androidUI.fragment;



import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import cn.cnu.smartbook.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class RightEmptyFragment extends Fragment {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    public RightEmptyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_right_empty, container, false);
        textView1=(TextView)view.findViewById(R.id.textView1);

        textView2=(TextView)view.findViewById(R.id.textView2);
        textView3=(TextView)view.findViewById(R.id.textView3);
        textView4=(TextView)view.findViewById(R.id.textView4);
        return  view;
    }

}
