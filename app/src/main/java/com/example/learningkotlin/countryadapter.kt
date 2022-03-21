package com.example.learningkotlin

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class countryadapter(val countrieslist:ArrayList<countries>):
    RecyclerView.Adapter<countryadapter.myviewholder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {
      val itemview = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return myviewholder(itemview)
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        val currentitem = countrieslist[position]
        holder.countryimage.setImageResource(currentitem.countryimage)
        holder.countryname.text = currentitem.countryname
        holder.countrycode.text= currentitem.countrycode
        //holder.textview.text = currentitem.
    }

    override fun getItemCount(): Int {
        return countrieslist.size
    }

    class myviewholder(itemview: View):RecyclerView.ViewHolder(itemview)
    {
       val countryimage: ImageView = itemView.findViewById(R.id.title_image)
        val countryname: TextView = itemView.findViewById(R.id.tvheading)
        val countrycode: TextView = itemview.findViewById(R.id.textView)

    }
}