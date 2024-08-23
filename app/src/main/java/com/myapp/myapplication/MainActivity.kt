package com.myapp.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myapp.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.openBtn.setOnClickListener {
            TestDialog().show(supportFragmentManager, null)
        }
    }
}