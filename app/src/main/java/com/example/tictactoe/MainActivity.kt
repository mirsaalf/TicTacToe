package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val playerX = "X"
    val playerY = "O"
    var playersTurn = "Player $playerX's turn"
    var winner = "$playerX Wins!"
    var cell1 = "1"
    var cell2 = "2"
    var cell3 = "3"
    var cell4 = "4"
    var cell5 = "5"
    var cell6 = "6"
    var cell7 = "7"
    var cell8 = "8"
    var cell9 = "9"
    var cellsClicked = 0


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
            if (btn1.isClickable) {
                btn1.text = textArea()
                textView.text = playersTurn
                cell1 = btn1.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn1.isClickable = false
            }
        }
        btn2.text = ""
        btn2.setOnClickListener {
            if (btn2.isClickable) {
                btn2.text = textArea()
                textView.text = playersTurn
                cell2 = btn2.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn2.isClickable = false
            }
        }
        btn3.text = ""
        btn3.setOnClickListener {
            if (btn3.isClickable) {
                btn3.text = textArea()
                textView.text = playersTurn
                cell3 = btn3.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn3.isClickable = false
            }
        }
        btn4.text = ""
        btn4.setOnClickListener {
            if (btn4.isClickable) {
                btn4.text = textArea()
                textView.text = playersTurn
                cell4 = btn4.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn4.isClickable = false
            }
        }
        btn5.text = ""
        btn5.setOnClickListener {
            if (btn5.isClickable) {
                btn5.text = textArea()
                textView.text = playersTurn
                cell5 = btn5.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn5.isClickable = false
            }
        }
        btn6.text = ""
        btn6.setOnClickListener {
            if (btn6.isClickable) {
                btn6.text = textArea()
                textView.text = playersTurn
                cell6 = btn6.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn6.isClickable = false
            }
        }
        btn7.text = ""
        btn7.setOnClickListener {
            if (btn7.isClickable) {
                btn7.text = textArea()
                textView.text = playersTurn
                cell7 = btn7.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn7.isClickable = false
            }
        }
        btn8.text = ""
        btn8.setOnClickListener {
            if (btn8.isClickable) {
                btn8.text = textArea()
                textView.text = playersTurn
                cell8 = btn8.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn8.isClickable = false
            }
        }
        btn9.text = ""
        btn9.setOnClickListener {
            if (btn9.isClickable) {
                btn9.text = textArea()
                textView.text = playersTurn
                cell9 = btn9.text.toString()
                if (winnerCheck()) {
                    textView.text = winner
                }
                else if (cellsClicked == 9) {
                    textView.text = "Draw!"
                }
                btn9.isClickable = false
            }
        }

        newGame.setOnClickListener {
            btn1.text = ""
            btn1.isClickable = true
            btn2.text = ""
            btn2.isClickable = true
            btn3.text = ""
            btn3.isClickable = true
            btn4.text = ""
            btn4.isClickable = true
            btn5.text = ""
            btn5.isClickable = true
            btn6.text = ""
            btn6.isClickable = true
            btn7.text = ""
            btn7.isClickable = true
            btn8.text = ""
            btn8.isClickable = true
            btn9.text = ""
            btn9.isClickable = true
            textView.text = "Player X's turn"
        }

    }

    private fun textArea(): String {
        return if (playersTurn == "Player X's turn") {
            playersTurn = "Player $playerY's turn"
            winner = "$playerX Wins!"
            playerX
        } else {
            playersTurn = "Player $playerX's turn"
            winner = "$playerY Wins!"
            playerY
        }
    }

    fun winnerCheck(): Boolean {
        if((cell1 == cell2) && (cell1 == cell3)) {
            return true
        }
        if((cell1 == cell4) && (cell1 == cell7)) {
            return true
        }
        if ((cell1 == cell5) && (cell1 == cell9)) {
            return true
        }
        if ((cell2 == cell5) && (cell2 == cell8)) {
            return true
        }
        if ((cell7 == cell8) && (cell7 == cell9)) {
            return true
        }
        if ((cell4 == cell5) && (cell4 == cell6)) {
            return true
        }
        if ((cell7 == cell8) && (cell7 == cell9)) {
            return true
        }
        return false
    }

}