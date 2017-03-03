package cn.cnu.smartbook.androidUI.fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import cn.cnu.smartbook.androidUI.StarsActivity;
import cn.cnu.smartbook.R;

public class MiddleFragment extends Fragment implements View.OnClickListener {
    private RightFragment rightFragment;
    private RightEmptyFragment rightEmptyFragment;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;

    public MiddleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_middle, container, false);//获得View对象
        textView1 = (TextView) view.findViewById(R.id.textView1);//获得fragment_middle碎片中的TextView控件实例
        textView1.setText("hello textView1");
        textView1.setGravity(Gravity.CENTER);

        textView2 = (TextView) view.findViewById(R.id.textView2);
        textView2.setText("hello textView2");
        textView3 = (TextView) view.findViewById(R.id.textView3);
        textView4 = (TextView) view.findViewById(R.id.textView4);
        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        //得到碎片管理器
        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();
//        if (rightFragment == null) {
//            rightFragment = new RightFragment();
//        }

        switch (v.getId()) {
            case R.id.textView1:
                // 使用当前Fragment的布局替代content的控件
            //    transaction.replace(R.id.right, rightFragment);
                getActivity().findViewById(R.id.right);
                StarsActivity activity=(StarsActivity)getActivity();//获得MainActivity的实例
                rightEmptyFragment=(RightEmptyFragment)activity.getFragmentManager().findFragmentById(R.id.right);//获得Fragment2碎片对象
                Drawable background=getResources().getDrawable(R.drawable.star2);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    rightEmptyFragment.textView1.setBackground(background);
                }
                rightEmptyFragment.textView1.setText("world");
                rightEmptyFragment.textView1.setGravity(Gravity.CENTER);
                break;

            case R.id.textView2:

                // 使用当前Fragment的布局替代content的控件
                transaction.replace(R.id.right, rightFragment);
                textView2.getText();
                break;
            case R.id.textView3:

                // 使用当前Fragment的布局替代content的控件
                transaction.replace(R.id.right, rightFragment);
                break;
            case R.id.textView4:

                // 使用当前Fragment的布局替代content的控件
                transaction.replace(R.id.right, rightFragment);
                break;

        }
        //添加返回栈,按back键可以返回上一个碎片
        transaction.addToBackStack(null);
        // 事务提交
        transaction.commit();

    }
}
