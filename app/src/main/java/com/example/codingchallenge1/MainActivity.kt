package com.example.codingchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.codingchallenge1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var btnCount = binding.btnCount

        var displayText =binding.tvCount


        var count:Int =0
        displayText.text = "0"
        btnCount.setOnClickListener {
            count++
            displayText.text = count.toString()




        }
    }
}