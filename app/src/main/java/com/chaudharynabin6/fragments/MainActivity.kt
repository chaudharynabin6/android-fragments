package com.chaudharynabin6.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.chaudharynabin6.fragments.fragment_basics.FragmentBasics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FragmentBasics>(R.id.fragment_container_view)
            }
        }
        setContentView(R.layout.activity_main)
    }
}