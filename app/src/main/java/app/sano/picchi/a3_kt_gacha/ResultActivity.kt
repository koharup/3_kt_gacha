package app.sano.picchi.a3_kt_gacha

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*
import java.util.*


class ResultActivity : AppCompatActivity() {
    val random = Random()
    val number = random.nextInt(3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        check()
    }

    fun check(){

        Log.d("test",number.toString())
        when(number){
            0 -> {
                mainImage.setImageResource(R.drawable.aris)
                nameText.text = "Alice"
            }
            1 -> {
                mainImage.setImageResource(R.drawable.bel)
                nameText.text = "Bell"
            }
            2 -> {
                mainImage.setImageResource(R.drawable.snow)
                nameText.text = "Snow White"
            }
        }
    }

    fun back(v:View){
        finish()
    }



}
