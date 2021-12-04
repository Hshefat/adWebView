package com.example.buttonwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Faq extends AppCompatActivity {
    WebView W;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_web);


        W = (WebView) findViewById(R.id.webViewFaq);
        W.getSettings().setJavaScriptEnabled(true);
        W.setWebViewClient(new WebViewClient());
        W.loadUrl("http://www.includehelp.com");
    }
}
