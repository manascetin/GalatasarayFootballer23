package com.devmanas.galatasarayfootballer23

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devmanas.galatasarayfootballer23.R.layout.recycler_row
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val futbolcuisimleri : ArrayList<String> , val futbolcuGorselleri : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.FutbollerVH>() {
    class FutbollerVH(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FutbollerVH {
        val itemView = LayoutInflater.from(parent.context).inflate(recycler_row,parent,false)
        return FutbollerVH(itemView)

    }

    override fun onBindViewHolder(holder: FutbollerVH, position: Int) {

        holder.itemView.recyclerViewTextView.text = futbolcuisimleri.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,InfoActivity::class.java)
            intent.putExtra("futbolcuIsmi",futbolcuisimleri.get(position))
            val  singleton = SingletonClass.secilenFutbolcu
            singleton.gorsel = futbolcuGorselleri.get(position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {

        return futbolcuisimleri.size

    }
}