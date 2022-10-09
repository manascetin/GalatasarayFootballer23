package com.devmanas.galatasarayfootballer23

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val intent = intent
        val secilenFutbolcuIsmi = intent.getStringExtra("futbolcuIsmi")
        textView.text = secilenFutbolcuIsmi

        val secilenFutboller = SingletonClass.secilenFutbolcu
        val secilenGorsel = secilenFutboller.gorsel
        imageView6.setImageBitmap(secilenGorsel)
    }
}