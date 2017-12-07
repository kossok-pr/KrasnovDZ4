package com.example.android.krasnovdz4

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item.view.*

class PlanetAdapter(private val planets: Array<Planet>) : RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    override fun getItemCount() = planets.size

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.name.text = planets[position].name
        holder.pImg.setImageBitmap(planets[position].img)
        holder.distance.text = String.format((planets[position].distance / 1000000).toString() + " mln km from the Sun")
        holder.iImg.setImageBitmap(planets[position].inhabited)
        holder.view.setOnClickListener({
            val webIntent = Intent(holder.view.context, BrowserActivity::class.java)
            webIntent.putExtra(Intent.EXTRA_TEXT, planets[position].link)
            holder.view.context.startActivity(webIntent)
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            PlanetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

    class PlanetViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var name: TextView = view.item_name_text
        var pImg: ImageView = view.item_img_planet
        var distance: TextView = view.item_distance_text
        var iImg: ImageView = view.item_img_inhabited
        var link: TextView = view.item_link_text
    }
}