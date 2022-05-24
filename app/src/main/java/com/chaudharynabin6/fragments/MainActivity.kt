package com.chaudharynabin6.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.chaudharynabin6.fragments.databinding.ActivityMainBinding
import com.chaudharynabin6.fragments.databinding.FragmentBasicsBinding
import com.chaudharynabin6.fragments.fragment_basics.FragmentBasics

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FragmentBasics>(R.id.fragment_container_view)
            }
        }
        setContentView(binding.root)
    }
}