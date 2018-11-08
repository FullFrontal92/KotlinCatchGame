package com.example.adambenyahia.kotlincatchgame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var score : Int 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        score = 0

        object : CountDownTimer(10000, 1000){
            override fun onFinish() {
                timeText.text = "Time's Out"
            }

            override fun onTick(p0: Long) {
                timeText.text = "Time:" + p0 / 1000
            }

        }.start()
    }

    fun increaseScore(view: View){

        score++

        scoreText.text="Score:" + score

    }

}
