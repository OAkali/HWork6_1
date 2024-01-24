package com.example.hwork6_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.hwork6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)

    }
    private val viewModel: ModelViewDataLive by lazy {
        ViewModelProvider(this)[ModelViewDataLive::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.liveData.observe(this) { result ->
            binding.textV.text = result.toString()
        }
        with(binding) {
            btnPlus.setOnClickListener {
                viewModel.inc()
            }

            btnMinus.setOnClickListener {
                viewModel.dec()
            }
        }
    }
}