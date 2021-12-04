package com.example.buttonwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HowItWork extends AppCompatActivity {
    WebView W;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_it_work_web);
        W = (WebView) findViewById(R.id.webViewHowItWork);
        W.getSettings().setJavaScriptEnabled(true);
        W.setWebViewClient(new WebViewClient());
        W.loadUrl("http://www.includehelp.com");
    }
}
