package me.aslammaududy.mangacatalogue

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mangas = listOf<Manga>().toMutableList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manga_recycler.layoutManager = LinearLayoutManager(this)

        loadData()

        var mangaAdapter = MangaAdapter(mangas, this)

        manga_recycler.adapter = mangaAdapter
    }

    private fun loadData() {
        mangas.add(
            Manga(
                "Shuumatsu no Valkyrie",
                "13 manusia terhebat dalam sejarah umat manusia akan melawan 13 dewa untuk menentukan nasib umat manusia apakah akan dimusnahkan atau tetap dibiarkan hidup dalam pertarungan ragnarok satu lawan satu antara manusia dengan dewa. Bagaimanakah hasil pertarungannya?",
                R.drawable.shuumatsu
            )
        )
        mangas.add(
            Manga(
                "Tokyo Shinobi Squad",
                "Tokyo, 2049 … Berkat Reformasi Galapagos yang diberlakukan oleh pemerintah, Rusia, Cina, Amerika, dan Jepang sekarang terhubung oleh sistem Hyper Loop. Globalisasi ini telah mengubah Tokyo menjadi kota paling penuh kejahatan di dunia. karena meningkatnya kejahatan, mereka yang telah bekerja dalam bayang-bayang sejak zaman Sengoku diperlukan … Mereka adalah … Shinobi!",
                R.drawable.shinobi
            )
        )
        mangas.add(
            Manga(
                "Jujutsu Kaisen",
                "Yuuji adalah seorang jenius di jalur dan lapangan. Tapi dia memiliki minat nol, dia senang sebagai clam di Klub Penelitian Ilmu Ghaib. Meskipun Dia di Klub hanya untuk Iseng, Hal-hal menjadi serius ketika semangat nyata muncul di sekolah! Hidup akan menjadi sangat aneh Di SMA Negeri Sugisawa #3 !",
                R.drawable.jujutsu
            )
        )
        mangas.add(
            Manga(
                "Vinland Saga",
                "Thorfinn adalah anak ke salah satu pejuang terbesar Viking, tapi ketika ayahnya terbunuh dalam pertempuran dengan pemimpin tentara bayaran Askeladd, dia bersumpah untuk membalas dendam. Thorfinn bergabung dengan kelompok Askeladd dalam rangka untuk menantang dia berduel, dan berakhir terjebak di tengah perang puncak Inggris.",
                R.drawable.vinland
            )
        )
        mangas.add(
            Manga(
                "Smokin Parade",
                "he story follows Kakujou Youkou, who lives in a seemingly normal world where medical technology has skyrocketed to new heights, making it possible to completely replace any human organ. Those behind this are called the Ame No Tori (Rain of Birds), but it all turns out to be a plot against humanity where the new technology can take over its host, thus turning them into a killing machine. A task force is created called the Jackalope; its goal is to annihilate these mindless murderers before they raise any more havoc. This is where Youkou’s new life begins…",
                R.drawable.smokin
            )
        )
        mangas.add(
            Manga(
                "Platinum End",
                "It will be a story of “a human and an angel,” which will center around Mirai Kakehashi, a boy who “does not seek out hope in order to live.",
                R.drawable.platinum
            )
        )
        mangas.add(
            Manga(
                "Domestic na Kanojo",
                "From MangaHelpers: Tonight, Natsuo loses his virginity. His partner? Her name is Rui and he just met her today after school. She’s the one that brought up this whole situation, stating that she wanted to simply gain the knowledge about sex. She does not want to start a relationship, nor does she care about Natsuo. Afterwards, Natsuo feels guilty for losing his virginity to a girl he doesn’t even particularly like.",
                R.drawable.domestic
            )
        )
        mangas.add(
            Manga(
                "Tomb Raider King",
                "Makam Dewa mulai muncul di seluruh dunia. Karena relik di dalam makam ini, banyak yang bisa menggunakan kekuatan legendaris ini untuk diri mereka sendiri, sementara yang lain menjadi budak para pengguna ini. Namun, seorang Tomb Raider muncul dengan tujuan merampok peninggalan ini. The Tomb Raider King. “Sialan! Apa bajingan itu sudah menjarah tempat ini juga ?! ”Apa yang kau miliki adalah milikku. Apa yang aku miliki jelas milik miliku. Ini adalah kisah tentang Tomb Raider yang dihidupkan kembali yang akan melakukan apa saja untuk mengklaim semua makam dan relik untuk dirinya sendiri!",
                R.drawable.tomb
            )
        )
        mangas.add(
            Manga(
                "Soredemo Ayumu wa Yosetekuru",
                "Ayumu wants to beat his Senpai at Shogi so he can confess his feelings. Though the day of his victory is still nowhere to be seen, this is the story in which he may ‘checkmate’ her by other means.",
                R.drawable.soredemo
            )
        )
        mangas.add(
            Manga(
                "Kidou Senshi Gundam: The Origin",
                "Tragedi apa yang mengubah takdir Char Aznable, yang dikemudian hari menjadi pilot handal pasukan Zeon yang dijuluki \"Red Comet\", serta adiknya Sayla Mass? Ini adalah kisah perjalanan kakak beradik, yang diawali oleh kematian ayah mereka Zeon Zum Deikun, seorang pemimpin penduduk ruang angkasa, yang dikisahkan dalam 4 episode \"Kisah Char dan Sayla\" Keluarga Zabi yang memegang kuasa di Sisi-3 dan memimpin Kerajaan Zeon, sejarah dari beberapa pilot handal Zeon yang akan bertarung dalam Perang Satu Tahun, rahasia pengembangan Mobile Suit, konflik dengan Pasukan Federasi Bumi, dan asal mula terjadinya perang—semua akan terungkap.",
                R.drawable.kidou
            )
        )
    }

    fun openAboutPage(view: View) {
        startActivity(Intent(this, AboutActivity::class.java))
    }
}
