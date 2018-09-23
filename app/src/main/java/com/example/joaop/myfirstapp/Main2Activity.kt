package com.example.joaop.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.joaop.myfirstapp.R.id.button2
import com.example.joaop.myfirstapp.R.id.text_progress
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*
import java.util.concurrent.TimeUnit


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val timer:Long = 0
        val millisInFuture:Long = (timer * 1440) + (timer * 155) + (1000 * 10)
        val countDownInterval:Long = 5

        timer(millisInFuture,countDownInterval).start()
    }

    fun timer(millisInFuture:Long,countDownInterval:Long): CountDownTimer {
        val twoAct = Intent(this, MainActivity::class.java)
        return object: CountDownTimer(millisInFuture,countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                val timeRemaining = timeString(millisUntilFinished)
                button2.text = timeRemaining
                text_progress.text = timeRemaining
            }

            override fun onFinish() {
                startActivity(twoAct)
            }
        }
    }

    private fun timeString(millisUntilFinished:Long):String{
        var millisUntilFinished:Long = millisUntilFinished

        val seconds = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished)

        // Format the string
        return String.format(
                Locale.getDefault(),
                "%02d",
                seconds
        )
    }
}
