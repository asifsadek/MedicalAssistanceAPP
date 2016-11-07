package com.sorry.band.activity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.sorry.band.R;

public class MyPostActivity extends BaseActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_post_activity);
        webView = (WebView)findViewById(R.id.postWebView);

        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);//设置js可以直接打开窗口，如window.open()，默认为false
        webView.getSettings().setJavaScriptEnabled(true);//是否允许执行js，默认为false。设置true时，会提醒可能造成XSS漏洞
        webView.getSettings().setSupportZoom(true);//是否可以缩放，默认true
        webView.getSettings().setBuiltInZoomControls(true);//是否显示缩放按钮，默认false
        webView.getSettings().setUseWideViewPort(true);//设置此属性，可任意比例缩放。大视图模式
        webView.getSettings().setLoadWithOverviewMode(true);//和setUseWideViewPort(true)一起解决网页自适应问题
        webView.getSettings().setAppCacheEnabled(true);//是否使用缓存
        webView.getSettings().setDomStorageEnabled(true);//DOM Storage
        webView.loadUrl("http://115.159.200.151/mobile_post.php?account="+application.getAccount()+"&name="+application.getPersonalData().getName());
        Log.i("URL","http://115.159.200.151/mobile_post.php?account="+application.getAccount()+"&name="+application.getPersonalData().getName());
    }
}
