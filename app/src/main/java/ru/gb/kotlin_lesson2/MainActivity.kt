package ru.gb.kotlin_lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.kotlin_lesson2.databinding.ActivityMainBinding
import ru.gb.kotlin_lesson2.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commit()
        }
    }
}