package com.example.laboratorio03guerra


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCentsImageView: ImageView
    private lateinit var cashTextView: TextView
    private lateinit var tenCentsImageView: ImageView
    private lateinit var quarterImageView: ImageView
    private lateinit var oneDollarImageView: ImageView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addlisterners()
    }
    @SuppressLint("SetTextI18n")
    private fun addlisterners(){
        fiveCentsImageView.setOnClickListener(){
            cash+=0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
        tenCentsImageView.setOnClickListener(){
            cash+=0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
        quarterImageView.setOnClickListener(){
            cash+=0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }
        oneDollarImageView.setOnClickListener(){
            cash+=1.00
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"

        }
    }
    private fun bind(){
        fiveCentsImageView = findViewById(R.id.five_cents_image_view)
        cashTextView = findViewById(R.id.cash_text_View)
        tenCentsImageView = findViewById(R.id.ten_Cents_image_View)
        quarterImageView = findViewById(R.id.quarter_image_View3)
        oneDollarImageView = findViewById(R.id.one_dollar_image_View3)
    }
}