package com.example.android.krasnovdz4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_browser.*

class BrowserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browser)

        planet_web_view.webViewClient = WebViewClient()
        planet_web_view.loadUrl(intent.getStringExtra(Intent.EXTRA_TEXT))
    }
}
