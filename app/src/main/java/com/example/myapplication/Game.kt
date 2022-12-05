package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView


class Game : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val higherButton = findViewById<ImageButton>(R.id.higherButton)
        val lowerButton = findViewById<ImageButton>(R.id.lowerButton)
        val cardImageView = findViewById<ImageView>(R.id.cardImageView)
        var lastCard = 0
        var score = 0
        val currentScore = findViewById<TextView>(R.id.currentScore)

        currentScore.text = score.toString()

        higherButton.setOnClickListener {
            val newCard = drawCard(cardImageView)
            if(newCard > lastCard) {
                score++
            } else {
                score = 0
            }
            lastCard = newCard
            currentScore.text = score.toString()

            if(score == 10) {
                currentScore.text = "du vann!"
                score=0
                cardImageView.setImageResource(R.drawable.cardback)
            }
        }

        lowerButton.setOnClickListener {

            val newCard = drawCard(cardImageView)
            if(newCard < lastCard) {
                score++
            } else {
                score = 0
            }
            lastCard = newCard
            currentScore.text = score.toString()

            if(score == 5) {
                currentScore.text = "du vann!"
                score=0
                cardImageView.setImageResource(R.drawable.cardback)
            }
        }
    }

    private fun drawCard(cardImageView : ImageView) : Int{
        val randomNumber = (1..52).random()
        when(randomNumber) {
            1 -> cardImageView.setImageResource(R.drawable.ace_of_clubs)
            2 -> cardImageView.setImageResource(R.drawable.ace_of_diamonds)
            3 -> cardImageView.setImageResource(R.drawable.ace_of_hearts)
            4 -> cardImageView.setImageResource(R.drawable.ace_of_spades)
            5 -> cardImageView.setImageResource(R.drawable.of_clubs2)
            6 -> cardImageView.setImageResource(R.drawable.of_clubs3)
            7 -> cardImageView.setImageResource(R.drawable.of_clubs4)
            8 -> cardImageView.setImageResource(R.drawable.of_clubs5)
            9 -> cardImageView.setImageResource(R.drawable.of_clubs6)
            10 -> cardImageView.setImageResource(R.drawable.of_clubs7)
            11 -> cardImageView.setImageResource(R.drawable.of_clubs8)
            12 -> cardImageView.setImageResource(R.drawable.of_clubs9)
            13 -> cardImageView.setImageResource(R.drawable.of_clubs10)
            14 -> cardImageView.setImageResource(R.drawable.jack_of_clubs)
            15 -> cardImageView.setImageResource(R.drawable.queen_of_clubs)
            16-> cardImageView.setImageResource(R.drawable.king_of_clubs)
            17-> cardImageView.setImageResource(R.drawable.of_spades2)
            18-> cardImageView.setImageResource(R.drawable.of_spades3)
            19-> cardImageView.setImageResource(R.drawable.of_spades4)
            20 -> cardImageView.setImageResource(R.drawable.of_spades5)
            21 -> cardImageView.setImageResource(R.drawable.of_spades6)
            22 -> cardImageView.setImageResource(R.drawable.of_spades7)
            23-> cardImageView.setImageResource(R.drawable.of_spades8)
            24-> cardImageView.setImageResource(R.drawable.of_spades9)
            25-> cardImageView.setImageResource(R.drawable.of_spades10)
            26 -> cardImageView.setImageResource(R.drawable.jack_of_spades)
            27 -> cardImageView.setImageResource(R.drawable.queen_of_spades)
            28 -> cardImageView.setImageResource(R.drawable.king_of_spades)
            29-> cardImageView.setImageResource(R.drawable.of_hearts2)
            30-> cardImageView.setImageResource(R.drawable.of_hearts3)
            31-> cardImageView.setImageResource(R.drawable.of_hearts4)
            32-> cardImageView.setImageResource(R.drawable.of_hearts5)
            33-> cardImageView.setImageResource(R.drawable.of_hearts6)
            34 -> cardImageView.setImageResource(R.drawable.of_hearts7)
            35 -> cardImageView.setImageResource(R.drawable.of_hearts8)
            36 -> cardImageView.setImageResource(R.drawable.of_hearts9)
            37-> cardImageView.setImageResource(R.drawable.of_hearts10)
            38-> cardImageView.setImageResource(R.drawable.jack_of_hearts)
            39-> cardImageView.setImageResource(R.drawable.queen_of_hearts)
            40 -> cardImageView.setImageResource(R.drawable.king_of_hearts)
            41 -> cardImageView.setImageResource(R.drawable.of_diamonds2)
            42 -> cardImageView.setImageResource(R.drawable.of_diamonds3)
            43-> cardImageView.setImageResource(R.drawable.of_diamonds4)
            44-> cardImageView.setImageResource(R.drawable.of_diamonds5)
            45-> cardImageView.setImageResource(R.drawable.of_diamonds6)
            46-> cardImageView.setImageResource(R.drawable.of_diamonds7)
            47-> cardImageView.setImageResource(R.drawable.of_diamonds8)
            48-> cardImageView.setImageResource(R.drawable.of_diamonds9)
            49 -> cardImageView.setImageResource(R.drawable.of_diamonds10)
            50 -> cardImageView.setImageResource(R.drawable.jack_of_diamonds)
            51 -> cardImageView.setImageResource(R.drawable.queen_of_diamonds)
            52-> cardImageView.setImageResource(R.drawable.king_of_diamonds)

        }
        return randomNumber
    }
}