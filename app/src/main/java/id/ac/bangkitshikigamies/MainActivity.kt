package id.ac.bangkitshikigamies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.ac.bangkitshikigamies.adapter.ListShikigamiAdapter
import id.ac.bangkitshikigamies.adapter.OnItemClickCallBack
import id.ac.bangkitshikigamies.model.Shikigami
import id.ac.bangkitshikigamies.model.ShikigamiData

class MainActivity : AppCompatActivity() {
    private lateinit var rvShikigami: RecyclerView
    private lateinit var btnAbout: ImageView
    private val listShikigami: ArrayList<Shikigami> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        var handler = Handler()
        handler.postDelayed({
            setContentView(R.layout.activity_main)

            rvShikigami = findViewById(R.id.rv_shikigamies)
            rvShikigami.setHasFixedSize(true)
            btnAbout = findViewById(R.id.btn_about)

            listShikigami.addAll(ShikigamiData.listShikigami)
            showShikigamiList()

            btnAbout.setOnClickListener {
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        },2000)
    }

    private fun showShikigamiList() {
        rvShikigami.layoutManager = LinearLayoutManager(this)

        val listShikigamiAdapter = ListShikigamiAdapter(listShikigami)
        rvShikigami.adapter = listShikigamiAdapter

        listShikigamiAdapter.setOnItemClickCallBack(object : OnItemClickCallBack {
            override fun onItemClicked(data: Shikigami) {
                moveToDetail(data)
            }
        })
    }

    private fun moveToDetail(data: Shikigami) {
        val move = Intent(this, DetailActivity::class.java)
        move.putExtra(DetailActivity.NAME, data.name)
        move.putExtra(DetailActivity.ROLE, data.role)
        move.putExtra(DetailActivity.SPECIALITY, data.speciality)
        move.putExtra(DetailActivity.DIFFICULTY, data.difficulty)
        move.putExtra(DetailActivity.INTRO, data.intro)
        move.putExtra(DetailActivity.IMG, data.img)
        startActivity(move)
    }
}