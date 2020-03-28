package app.sano.picchi.a3_kt_gacha

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*
import java.util.*


class ResultActivity : AppCompatActivity() {
    val random = Random()
    val number = random.nextInt(3)

    var repeat : Int = 0


    var timer : CountDownTimer = object :CountDownTimer(6500,1){

        override fun onFinish(){
            repeat = 0

        }

        //0.1秒ごとに呼ばれる
        override fun onTick(millisUnitilFinished: Long){
            repeat += 1
            imageView1.rotation = repeat.toFloat()
            imageView2.rotation = repeat.toFloat()
            imageView3.rotation = repeat.toFloat()
            imageView4.rotation = repeat.toFloat()
            imageView5.rotation = repeat.toFloat()
            imageView6.rotation = repeat.toFloat()
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        check()
        timer.start()

    }

    fun check(){

        Log.d("画像の変数",number.toString())
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
