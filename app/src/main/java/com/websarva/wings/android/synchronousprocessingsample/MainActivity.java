package com.websarva.wings.android.synchronousprocessingsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.result_1);
        SlowProcessClass spc = new SlowProcessClass(this);

        String result = spc.ViewText();
        textView.setText(result);

        WebView webView = findViewById(R.id.webview);

        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setAllowContentAccess(false);

        webView.loadUrl("https://www.google.com/?hl=ja");
    }
}