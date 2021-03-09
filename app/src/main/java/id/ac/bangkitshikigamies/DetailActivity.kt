package id.ac.bangkitshikigamies

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.net.URI

class DetailActivity : AppCompatActivity() {
    private lateinit var btnBack: ImageView
    private lateinit var shikigamiName: TextView
    private lateinit var shikigamiRole: TextView
    private lateinit var shikigamiSpeciality: TextView
    private lateinit var shikigamiDifficulty: TextView
    private lateinit var shikigamiIntro: TextView
    private lateinit var shikigamiImg: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        shikigamiName = findViewById(R.id.tv_shikigami_name)
        shikigamiRole = findViewById(R.id.tv_shikigami_role)
        shikigamiSpeciality = findViewById(R.id.tv_shikigami_speciality)
        shikigamiDifficulty = findViewById(R.id.tv_shikigami_difficulty)
        shikigamiIntro = findViewById(R.id.tv_shikigami_intro)
        shikigamiImg = findViewById(R.id.img_shikigami)
        btnBack = findViewById(R.id.back_to_main)

        val name = intent.getStringExtra(NAME)
        val role = intent.getStringExtra(ROLE)
        val speciality = intent.getStringExtra(SPECIALITY)
        val difficulty = intent.getStringExtra(DIFFICULTY)
        val intro = intent.getStringExtra(INTRO)
        val img = intent.getIntArrayExtra(IMG)

        btnBack.setOnClickListener{
            finish()
        }
        shikigamiImg.setOnClickListener{
            var move = Intent(this, ImageFullscreenActivity::class.java)
            move.putExtra(ImageFullscreenActivity.IMG_FULL, img)
            startActivity(move)
        }

        shikigamiName.text = name
        shikigamiRole.text = role
        shikigamiSpeciality.text = speciality
        shikigamiDifficulty.text = difficulty
        shikigamiIntro.text = intro
        Glide.with(this)
            .load(img.first())
            .apply(RequestOptions())
            .into(shikigamiImg)
    }

    companion object{
        const val NAME = "name"
        const val ROLE = "role"
        const val SPECIALITY = "speciality"
        const val DIFFICULTY = "difficulty"
        const val INTRO = "intro"
        const val IMG = "1"
    }
}