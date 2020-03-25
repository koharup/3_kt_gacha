package app.sano.picchi.a3_kt_gacha

import android.content.Intent
import android.icu.util.ValueIterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(v: View){
        val intent = Intent(this,ResultActivity::class.java)
        startActivity(intent)


    }

}
