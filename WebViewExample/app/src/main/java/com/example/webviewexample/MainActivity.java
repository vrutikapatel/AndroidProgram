package com.example.webviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    String customHtml="<html><body><h1>Hello, Android</h1>" +
            "<h1>Heding 1</h1><h2>Heding 2</h2><h3>Hedding 3</h3>" +
            "<p>This is a sample paragraph of static HTML in web View.</p></body></html>";
    Boolean CanGoBack,CanGoForword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.webView);
        //webView.loadUrl("https://www.google.com");
        webView.loadData(customHtml,"text/html","UTF-8");
    }
}