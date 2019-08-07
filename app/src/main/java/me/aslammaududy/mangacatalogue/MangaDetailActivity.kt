package me.aslammaududy.mangacatalogue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_manga_detail.*

class MangaDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manga_detail)

        val title = intent.getStringExtra("title")
        val imgResId = intent.getIntExtra("image", 0)
        val description = intent.getStringExtra("description")

        detail_manga_title.text = title
        detail_manga_image.setImageResource(imgResId)
        detail_manga_desc.text = description
    }
}
