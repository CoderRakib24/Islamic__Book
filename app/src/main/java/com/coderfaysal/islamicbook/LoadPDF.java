package com.coderfaysal.islamicbook;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoadPDF extends AppCompatActivity {

    WebView webView;
    public static String WEBSITE_LINK = "";
    public static String TITLE = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_pdf);


        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle(TITLE);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // ---------- Tool Bar -----------


        webView = findViewById(R.id.webView);


        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(WEBSITE_LINK);






    }
}