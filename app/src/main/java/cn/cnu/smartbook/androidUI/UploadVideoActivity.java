package cn.cnu.smartbook.androidUI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import cn.cnu.smartbook.R;

public class UploadVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_video);
        getSupportActionBar().hide();
    }
}
