package com.example.assignment


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment.R

class ZoneViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val tvName: TextView = view.findViewById(R.id.tvZoneName)
    private val tvDesc: TextView = view.findViewById(R.id.tvZoneDesc)
    fun bind(zone: Zone, click: (Zone) -> Unit, longClick: (Zone) -> Unit) {
        tvName.text = zone.name
        tvDesc.text = "Radius ${zone.radius}m · Lat:${"%.3f".format(zone.lat)} Lon:${"%.3f".format(zone.lon)}"
        itemView.setOnClickListener { click(zone) }
        itemView.setOnLongClickListener { longClick(zone); true }
    }
}
