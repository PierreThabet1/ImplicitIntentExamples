package com.example.ch12implicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Web")
        menu?.add("Map")
        menu?.add("Phone number")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var m_uri:Uri
        var m_intent: Intent = Intent()
        when (item?.toString()) {
            "Web" -> {
                m_uri = Uri.parse("https://www.google.com/")
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
            }
            "Map" -> {
                m_uri = Uri.parse("https://g.page/Google-UK-6PS?share")
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
            }
            "Phone number" -> {
                m_uri = Uri.parse("tel:+123456")
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
                m_intent = Intent(Intent.ACTION_DIAL, m_uri)


            }
        }
        startActivity(m_intent)
        return super.onOptionsItemSelected(item)
    }



}