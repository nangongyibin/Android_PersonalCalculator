package com.ngyb.personalcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText mEt;
    private TextView mTv1, mTv2, mTv3;
    private HashMap<String, String> mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEt = findViewById(R.id.et);
        mTv1 = findViewById(R.id.tv1);
        mTv2 = findViewById(R.id.tv2);
        mTv3 = findViewById(R.id.tv3);
        init();
    }

    private void init() {
        mMap = new HashMap<>();
        mMap.put("南宫燚滨", "100");
        mMap.put("成青青", "100");
    }

    public void cal(View view) {
        String name = mEt.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "请输入您的姓名", Toast.LENGTH_SHORT).show();
        } else {
            String score = Score.checkMap(mMap, name);
            int scoreint;
            if (score != null) {
                scoreint = Integer.parseInt(score);
            } else {
                scoreint = Score.getResult(name);
            }
            mTv1.setText("姓名：" + name);
            mTv2.setText("评分：" + (scoreint >= 0 && scoreint <= 100 ? scoreint + "" : "溢出"));
            mTv3.setText("评价：" + Score.getValue(scoreint));
        }
    }

    public void clear(View view) {
        mEt.setText("");
        mTv1.setText("姓名：");
        mTv2.setText("评分：");
        mTv3.setText("评价：");
    }
}
