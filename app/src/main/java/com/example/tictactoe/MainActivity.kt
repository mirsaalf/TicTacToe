package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val playerX = "X"
    val playerY = "O"
    var playersTurn = "Player $playerX's turn"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button_00)
        val btn2 = findViewById<Button>(R.id.button_01)
        val btn3 = findViewById<Button>(R.id.button_02)
        val btn4 = findViewById<Button>(R.id.button_03)
        val btn5 = findViewById<Button>(R.id.button_04)
        val btn6 = findViewById<Button>(R.id.button_05)
        val btn7 = findViewById<Button>(R.id.button_06)
        val btn8 = findViewById<Button>(R.id.button_07)
        val btn9 = findViewById<Button>(R.id.button_08)
        val newGame = findViewById<Button>(R.id.button_09)
        val textView = findViewById<TextView>(R.id.text00)

        textView.text = "Player $playerX's turn"

        btn1.text = ""
        btn1.setOnClickListener {
            if (btn1.text == "") {
                btn1.text = textArea()
                textView.text = playersTurn
            }
        }
        btn2.text = ""
        btn2.setOnClickListener {
            if (btn2.text == "") {
                btn2.text = textArea()
                textView.text = playersTurn
            }
        }
        btn3.text = ""
        btn3.setOnClickListener {
            if (btn3.text == "") {
                btn3.text = textArea()
                textView.text = playersTurn
            }
        }
        btn4.text = ""
        btn4.setOnClickListener {
            if (btn4.text == "") {
                btn4.text = textArea()
                textView.text = playersTurn
            }
        }
        btn5.text = ""
        btn5.setOnClickListener {
            if (btn5.text == "") {
                btn5.text = textArea()
                textView.text = playersTurn
            }
        }
        btn6.text = ""
        btn6.setOnClickListener {
            if (btn6.text == "") {
                btn6.text = textArea()
                textView.text = playersTurn
            }
        }
        btn7.text = ""
        btn7.setOnClickListener {
            if (btn7.text == "") {
                btn7.text = textArea()
                textView.text = playersTurn
            }
        }
        btn8.text = ""
        btn8.setOnClickListener {
            if (btn8.text == "") {
                btn8.text = textArea()
                textView.text = playersTurn
            }
        }
        btn9.text = ""
        btn9.setOnClickListener {
            if (btn9.text == "") {
                btn9.text = textArea()
                textView.text = playersTurn
            }
        }

        newGame.setOnClickListener {
            btn1.text = ""
            btn2.text = ""
            btn3.text = ""
            btn4.text = ""
            btn5.text = ""
            btn6.text = ""
            btn7.text = ""
            btn8.text = ""
            btn9.text = ""
            textView.text = "Player X's turn"
        }

    }

    private fun textArea(): String {
        return if (playersTurn == "Player X's turn") {
            playersTurn = "Player $playerY's turn"
            playerX
        } else {
            playersTurn = "Player $playerX's turn"
            playerY
        }
    }

}