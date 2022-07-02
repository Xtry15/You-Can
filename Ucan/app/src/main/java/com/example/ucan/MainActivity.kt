package com.example.ucan
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

private lateinit var quote: TextView

class MainActivity : AppCompatActivity() {
    fun click(view: View){
        val number = (1..4).random()

        if (number == 1){
            val one = "Beauty and wisdom are seldom found together"
            quote.text = one
        }
        else if (number == 2) {
            val two = "Better a new friend than an old enemy"
            quote.text = two
        }
        else if (number == 3){
            val three = "Better a new friend than an old enemy"
            quote.text = three
        }
        else if (number == 4) {
            val four = "Never stop dreaming!"
            quote.text = four
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        quote = findViewById(R.id.quote)
    }
}