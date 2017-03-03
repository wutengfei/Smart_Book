package cn.cnu.smartbook.androidUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import cn.cnu.smartbook.R;

import java.sql.SQLOutput;

public class ShowActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView left_top;
    ImageView right_top;
    ImageView left_bottom;
    ImageView right_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        getSupportActionBar().hide();
        left_top = (ImageView) findViewById(R.id.left_top);
        right_top = (ImageView) findViewById(R.id.right_top);
        left_bottom = (ImageView) findViewById(R.id.left_bottom);
        right_bottom = (ImageView) findViewById(R.id.right_bottom);

        left_top.setImageDrawable(getResources().getDrawable(R.drawable.robot));
        right_top.setImageDrawable(getResources().getDrawable(R.drawable.audbtn));
        left_bottom.setImageDrawable(getResources().getDrawable(R.drawable.video));
        right_bottom.setImageDrawable(getResources().getDrawable(R.drawable.picbtn));

        left_top.setOnClickListener(this);
        right_top.setOnClickListener(this);
        left_bottom.setOnClickListener(this);
        right_bottom.setOnClickListener(this);
    }

    /**
     * 上传录音
     * @param view
     */
    public void record(View view) {
        Intent intent = new Intent(this, UploadRecordActivity.class);
        intent.putExtra("word", "apple");//把单词传递给下一个活动
        startActivity(intent);
    }
    /**
     * 上传视频
     * @param view
     */
    public void video(View view) {
        Intent intent = new Intent(this, UploadVideoActivity.class);
        intent.putExtra("word", "apple");//把单词传递给下一个活动
        startActivity(intent);
    }
    /**
     * 上传图片
     * @param view
     */
    public void image(View view) {
        Intent intent = new Intent(this, UploadPictureActivity.class);
        intent.putExtra("word", "apple");//把单词传递给下一个活动
        startActivity(intent);
    }
    /**
     * 下一个单词
     * @param view
     */
    public void next(View view) {
        System.out.println("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.left_top: {
                Intent intent = new Intent(this, SentenceActivity.class);
                intent.putExtra("word", "apple");//把单词传递给下一个活动
                startActivity(intent);
            }
            break;
            case R.id.left_bottom: {
                Intent intent = new Intent(this, VideoActivity.class);
                intent.putExtra("word", "apple");//把单词传递给下一个活动
                startActivity(intent);
            }
            break;
            case R.id.right_top: {
                Intent intent = new Intent(this, ParagraphActivity.class);
                intent.putExtra("word", "apple");//把单词传递给下一个活动
                startActivity(intent);
            }
            break;
            case R.id.right_bottom: {
                Intent intent = new Intent(this, WordActivity.class);
                intent.putExtra("word", "apple");//把单词传递给下一个活动
                startActivity(intent);
            }
            break;
        }

    }
}
