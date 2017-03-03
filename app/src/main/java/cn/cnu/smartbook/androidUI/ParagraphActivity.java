package cn.cnu.smartbook.androidUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import cn.cnu.smartbook.R;

public class ParagraphActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paragraph);
        getSupportActionBar().hide();
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String word = intent.getStringExtra("word");
        textView.setText(word);
    }




}
