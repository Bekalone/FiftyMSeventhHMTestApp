package com.example.fiftymseventhhmtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fiftymseventhhmtestapp.databinding.ActivityMainBinding
import java.lang.Math

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClicker()
    }

    private fun initClicker() {
        with(binding){

                btnPlus.setOnClickListener {
                    val firstNum = etFirst.text.toString()
                    val secondNum = etSecond.text.toString()
                    val math = Math()
                tvResult.text = math.add(firstNum,secondNum)
            }
            /*btnDivide.setOnClickListener {
                tvResult.text = math.divide(firstNum,secondNum)
            }*/
        }
    }
}