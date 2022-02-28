package com.example.ladm_u1_p2_almacenamientoarchivosplanos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentViewHolder

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val titles=arrayOf("EmmanuelZ", "Ingeniero","Sistemas","18401212")
    val details=arrayOf("Detalles", "jejeje","xdxd","ultimo")
    val images=intArrayOf(R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
      val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text=titles[i]
        viewHolder.itemDetails.text=details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int{
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetails: TextView

        init{
            itemImage= itemView.findViewById(R.id.item_image)
            itemTitle= itemView.findViewById(R.id.item_title)
            itemDetails= itemView.findViewById(R.id.item_detal)
        }
    }
}