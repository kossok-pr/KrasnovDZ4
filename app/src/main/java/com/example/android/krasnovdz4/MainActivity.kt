package com.example.android.krasnovdz4

import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data: Array<Planet> = arrayOf(
                Planet("Mercury", BitmapFactory.decodeResource(resources, R.drawable.mercury),
                        70000000, BitmapFactory.decodeResource(resources, R.drawable.not_inhabited),
                        "https://en.wikipedia.org/wiki/Mercury_(planet)"),
                Planet("Venus", BitmapFactory.decodeResource(resources, R.drawable.venus),
                        108000000, BitmapFactory.decodeResource(resources, R.drawable.not_inhabited),
                        "https://en.wikipedia.org/wiki/Venus"),
                Planet("Earth", BitmapFactory.decodeResource(resources, R.drawable.earth),
                        150000000, BitmapFactory.decodeResource(resources, R.drawable.inhabited),
                        "https://en.wikipedia.org/wiki/Earth"),
                Planet("Mars", BitmapFactory.decodeResource(resources, R.drawable.mars),
                        230000000, BitmapFactory.decodeResource(resources, R.drawable.not_inhabited),
                        "https://en.wikipedia.org/wiki/Mars"),
                Planet("Jupiter", BitmapFactory.decodeResource(resources, R.drawable.jupiter),
                        778000000, BitmapFactory.decodeResource(resources, R.drawable.not_inhabited),
                        "https://en.wikipedia.org/wiki/Jupiter"),
                Planet("Saturn", BitmapFactory.decodeResource(resources, R.drawable.saturn),
                        1400000000, BitmapFactory.decodeResource(resources, R.drawable.not_inhabited),
                        "https://en.wikipedia.org/wiki/Saturn"),
                Planet("Uranus", BitmapFactory.decodeResource(resources, R.drawable.uranus),
                        3000000000, BitmapFactory.decodeResource(resources, R.drawable.not_inhabited),
                        "https://en.wikipedia.org/wiki/Uranus"),
                Planet("Neptune", BitmapFactory.decodeResource(resources, R.drawable.neptune),
                        4500000000, BitmapFactory.decodeResource(resources, R.drawable.not_inhabited),
                        "https://en.wikipedia.org/wiki/Neptune"))

        list.layoutManager = GridLayoutManager(applicationContext, 2)
        list.adapter = PlanetAdapter(data)
    }
}
