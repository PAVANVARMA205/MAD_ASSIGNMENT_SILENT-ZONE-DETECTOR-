package com.example.assignment


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ZoneAdapter(
    private val items: MutableList<Zone>,
    private val onClick: (Zone) -> Unit,
    private val onLongClick: (Zone) -> Unit
) : RecyclerView.Adapter<ZoneViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZoneViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_zone, parent, false)
        return ZoneViewHolder(v)
    }

    override fun onBindViewHolder(holder: ZoneViewHolder, position: Int) {
        val z = items[position]
        holder.bind(z, onClick, onLongClick)
    }

    override fun getItemCount(): Int = items.size
}
