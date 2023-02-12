package com.example.codingchallenge1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.codingchallenge1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var count =0


    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ViewModelDemo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var btnCount = binding.btnCount
        var displayText =binding.tvCount

        viewModel = ViewModelProvider(this).get(ViewModelDemo::class.java)




//        displayText.text = "0"
        displayText.text = viewModel.count.toString()
        btnCount.setOnClickListener {
//            count++
//            displayText.text = count.toString()
            viewModel.countUpdate()
            displayText.text = viewModel.count.toString()





        }
    }
}