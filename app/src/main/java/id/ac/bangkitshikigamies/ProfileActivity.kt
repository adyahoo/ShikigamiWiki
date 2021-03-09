package id.ac.bangkitshikigamies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ProfileActivity : AppCompatActivity() {
    private lateinit var imgAbout: ImageView
    private lateinit var btnBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        imgAbout = findViewById(R.id.img_about)
        Glide.with(this)
            .load(R.drawable.profile_about)
            .apply(RequestOptions())
            .into(imgAbout)

        btnBack = findViewById(R.id.back_to_main)
        btnBack.setOnClickListener{
            finish()
        }
    }
}