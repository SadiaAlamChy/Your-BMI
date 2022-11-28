package com.example.dell.yourbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ObesityTips extends AppCompatActivity {
    WebView mWebView;
    String mURL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesity_tips);

        mURL="https://en.wikipedia.org/w/index.php?search=Obesity&title=Special%3ASearch&fulltext=Search";
        mWebView=findViewById(R.id.wv);

        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().getLoadsImagesAutomatically();
        mWebView.getSettings().setAppCacheEnabled(true);
        mWebView.loadUrl(mURL);

        mWebView.setWebViewClient(new WebViewClient());

    }
}
