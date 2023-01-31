package com.example.warmup

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.warmup.Model.*

class UserAdapter(val context: Context, val items: ArrayList<UserModelClass>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_user_layout,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.type.text = item.type
        holder.teaserText.text = item.teaserText
        holder.teaserVideo.text = item.teaserVideo.toString()
        holder.showurl.text = item.showurl
        holder.teaserImage.text = item.teaserImage.toString()
        holder.id.text = item.id
        holder.description.text = item.description
        holder.title.text = item.title
    }

    /**
     * Gets the number of items in the list
     */
    override fun getItemCount(): Int {
        return items.size
    }

    /**
     * A ViewHolder describes an item view and metadata about its place within the RecyclerView.
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        // Holds the TextView that will add each item to
        val type = view.findViewById<TextView>(R.id.type)
        val teaserText = view.findViewById<TextView>(R.id.teaserText)
        val teaserVideo = view.findViewById<TextView>(R.id.teaserVideo)
        val showurl = view.findViewById<TextView>(R.id.showurl)
        val teaserImage = view.findViewById<TextView>(R.id.teaserImage)
        val id = view.findViewById<TextView>(R.id.id)
        val description = view.findViewById<TextView>(R.id.description)
        val title = view.findViewById<TextView>(R.id.title)
    }
}