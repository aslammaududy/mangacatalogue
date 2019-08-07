package me.aslammaududy.mangacatalogue

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MangaAdapter(val mangas: MutableList<Manga>, val context: Context) :
    RecyclerView.Adapter<MangaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_manga, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mangas.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = mangas[position].title
        holder.image.setImageResource(mangas[position].imgResId)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.item_manga_title)
        var image: ImageView = itemView.findViewById(R.id.item_manga_image)

        init {
            itemView.setOnClickListener {
                var intent = Intent(context, MangaDetailActivity::class.java)
                intent.putExtra("title", mangas[adapterPosition].title)
                intent.putExtra("image", mangas[adapterPosition].imgResId)
                intent.putExtra("description", mangas[adapterPosition].description)
                context.startActivity(intent)
            }

        }
    }
}