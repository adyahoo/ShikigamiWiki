package id.ac.bangkitshikigamies

import android.content.Intent
import android.content.res.Resources
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.transition.Slide
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import java.io.File
import java.lang.Exception

class ImageFullscreenActivity : AppCompatActivity() {
//    private lateinit var img_full: ImageView
    private lateinit var img_slider: ImageSlider
    private lateinit var btn_close: ImageView
    private lateinit var btn_share: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img_fullscreen2)

        val img = intent.getIntArrayExtra(IMG_FULL)
//        img_full = findViewById(R.id.img_fullscreen)
        img_slider = findViewById(R.id.img_fullscreen_slider)
        btn_close = findViewById(R.id.btn_close_fullscreen)
        btn_share = findViewById(R.id.btn_share)

        val listModels = ArrayList<SlideModel>()
        for(image in img){
            listModels.add(SlideModel(image))
        }
        img_slider.setImageList(listModels)
        img_slider.setItemClickListener(object: ItemClickListener{
            override fun onItemSelected(position: Int){
                btn_share.setOnClickListener{
                    shareImage(img[position])
                }
            }
        })

//        Glide.with(this)
//            .load(img)
//            .apply(RequestOptions())
//            .into(img_full)
        btn_close.setOnClickListener{
            finish()
        }
        onWindowFocusChanged(true)
    }

    private fun shareImage(img: Int) {
//        val imgName = resources.getResourceEntryName(img)
//        val imgUri = Uri.parse("android.resource://id.ac.bangkitshikigamies/drawable/"+imgName+".png")

        //get the bitmap of the image and turn into an URI
        val bitmapDrawable = BitmapFactory.decodeResource(resources, img)
        val bitmapPath = MediaStore.Images.Media.insertImage(contentResolver, bitmapDrawable, "WhatsApp", null)
        val imgUri = Uri.parse(bitmapPath)

        val shareImg = Intent(Intent.ACTION_SEND)
        shareImg.setPackage("com.whatsapp")
        shareImg.putExtra(Intent.EXTRA_STREAM, imgUri)
        shareImg.setType("image/*")
        shareImg.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)

        try {
            startActivity(shareImg)
        }catch (e: Exception){
            Toast.makeText(this, "WhatsApp is not exist", Toast.LENGTH_SHORT).show()
        }
    }

    companion object{
        const val IMG_FULL = "1"
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }
}