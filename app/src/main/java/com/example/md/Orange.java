package com.example.md;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.jaeger.library.StatusBarUtil;

public class Orange extends AppCompatActivity implements View.OnClickListener {

    private Button btn_red50, btn_red100, btn_red200, btn_red300, btn_red400, btn_red500, btn_red600, btn_red700, btn_red800, btn_red900, btn_reda100,
            btn_reda200, btn_reda400, btn_reda700;
    private Intent intent;
    private ClipboardManager cm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange);
        //设置状态栏透明度（0-255,0表示全透明，255表示不透明，不透明也就是黑色）
        StatusBarUtil.setTranslucent(this, 0);
        //获取组件
        btn_red50 = findViewById(R.id.btn_red50);
        btn_red100 = findViewById(R.id.btn_red100);
        btn_red200 = findViewById(R.id.btn_red200);
        btn_red300 = findViewById(R.id.btn_red300);
        btn_red400 = findViewById(R.id.btn_red400);
        btn_red500 = findViewById(R.id.btn_red500);
        btn_red600 = findViewById(R.id.btn_red600);
        btn_red700 = findViewById(R.id.btn_red700);
        btn_red800 = findViewById(R.id.btn_red800);
        btn_red900 = findViewById(R.id.btn_red900);
        btn_reda100 = findViewById(R.id.btn_reda100);
        btn_reda200 = findViewById(R.id.btn_reda200);
        btn_reda400 = findViewById(R.id.btn_reda400);
        btn_reda700 = findViewById(R.id.btn_reda700);
        //获取监听
        btn_red50.setOnClickListener(this);
        btn_red100.setOnClickListener(this);
        btn_red200.setOnClickListener(this);
        btn_red300.setOnClickListener(this);
        btn_red400.setOnClickListener(this);
        btn_red500.setOnClickListener(this);
        btn_red600.setOnClickListener(this);
        btn_red700.setOnClickListener(this);
        btn_red800.setOnClickListener(this);
        btn_red900.setOnClickListener(this);
        btn_reda100.setOnClickListener(this);
        btn_reda200.setOnClickListener(this);
        btn_reda400.setOnClickListener(this);
        btn_reda700.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_red50:
               /* cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                // 将文本内容放到系统剪贴板里。
                cm.setText(btn_red50.getText());
                Toast.makeText(this, btn_red50.getText() + "复制成功", Toast.LENGTH_SHORT).show();*/
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red50.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red100:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red100.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red200:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red200.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red300:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red300.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red400:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red400.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red500:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red500.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red600:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red600.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red700:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red700.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red800:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red800.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_red900:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_red900.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_reda100:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_reda100.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_reda200:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_reda200.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_reda400:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_reda400.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            case R.id.btn_reda700:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, btn_reda700.getText());//注意：这里只是分享文本内容
                intent.setType("text/*");
                startActivity(Intent.createChooser(intent, "分享到"));
                break;
            default:
                break;
        }
    }
}


