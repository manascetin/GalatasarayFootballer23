package com.devmanas.galatasarayfootballer23

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var futbolcuisimleri = ArrayList<String>()

        futbolcuisimleri.add("Fernando Muslera")
        futbolcuisimleri.add("Dries Mertens")
        futbolcuisimleri.add("Mauro Icardi")
        futbolcuisimleri.add("Kerem Aktürkoğlu")
        futbolcuisimleri.add("Yunus Akgün")
        futbolcuisimleri.add("Lucas Toreira")
        futbolcuisimleri.add("Sergio Oliviera")
        futbolcuisimleri.add("Sacha Boey")
        futbolcuisimleri.add("Victor Nelsson")
        futbolcuisimleri.add("Yusuf Demir")
        futbolcuisimleri.add("Juan Mata")
        
        val musleraBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.muslera)
        val mertensBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.mertens)
        val icardiBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.icardi)
        val keremBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.kerem)
        val yunusBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.yunus)
        val toreiraBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.toreira)
        val olivieraBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.oliviera)
        val boeyBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.boey)
        val nelssonBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.nelsson)
        val yusufBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.yusuf)
        val mataBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.mata)

        var futbolcuGorselleri = ArrayList<Bitmap>()
        futbolcuGorselleri.add(musleraBitmap)
        futbolcuGorselleri.add(mertensBitmap)
        futbolcuGorselleri.add(icardiBitmap)
        futbolcuGorselleri.add(keremBitmap)
        futbolcuGorselleri.add(yunusBitmap)
        futbolcuGorselleri.add(toreiraBitmap)
        futbolcuGorselleri.add(olivieraBitmap)
        futbolcuGorselleri.add(boeyBitmap)
        futbolcuGorselleri.add(nelssonBitmap)
        futbolcuGorselleri.add(yusufBitmap)
        futbolcuGorselleri.add(mataBitmap)


        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        val adapter = RecyclerAdapter(futbolcuisimleri,futbolcuGorselleri)
        recyclerView.adapter = adapter

    }
}