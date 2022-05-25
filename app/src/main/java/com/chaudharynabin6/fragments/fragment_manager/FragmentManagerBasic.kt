package com.chaudharynabin6.fragments.fragment_manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.chaudharynabin6.fragments.R

class FragmentManagerBasic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_manager_basic)
        Log.e("activity fragment manager",supportFragmentManager.fragments.toString())
//        we don't have access to child fragment manager here
//        Log.e("activity fragment manager : child fragment manager",childFragmentManager)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<Fragment3>(R.id.activity_fragment_manager_basic_fragment_container,"fragment-3")
        }
    }


}