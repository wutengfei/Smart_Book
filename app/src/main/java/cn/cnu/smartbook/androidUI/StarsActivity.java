package cn.cnu.smartbook.androidUI;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import cn.cnu.smartbook.androidUI.fragment.MiddleEmptyFragment;
import cn.cnu.smartbook.androidUI.fragment.MiddleFragment;
import cn.cnu.smartbook.androidUI.fragment.RightEmptyFragment;
import cn.cnu.smartbook.R;

public class StarsActivity extends AppCompatActivity {
    MiddleEmptyFragment middleEmptyFragment;
    RightEmptyFragment rightEmptyFragment;
    MiddleFragment middleFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars);
        getSupportActionBar().hide();

        // 设置默认的Fragment
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        middleEmptyFragment = new MiddleEmptyFragment();
        rightEmptyFragment = new RightEmptyFragment();
        transaction.replace(R.id.middle, middleEmptyFragment);
        transaction.replace(R.id.right, rightEmptyFragment);
        transaction.commit();
    }
    public  void star(View v){
        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();
        if(middleFragment==null){
            middleFragment=new MiddleFragment();
        }
        transaction.replace(R.id.middle, middleFragment);
        //添加返回栈,按back键可以返回上一个碎片
        transaction.addToBackStack(null);
        // 事务提交
        transaction.commit();
    }
}
