package com.example.newsappprojectsm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.webkit.WebView;

public class webView extends AppCompatActivity {

    Toolbar toolbar;
    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_web_view);
        toolbar.findViewById(R.id.toolbar);
        webView2.findViewById(R.id.webview);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl(url);
    }

}