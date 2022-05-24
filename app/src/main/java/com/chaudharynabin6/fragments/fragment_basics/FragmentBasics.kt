package com.chaudharynabin6.fragments.fragment_basics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chaudharynabin6.fragments.R
import com.chaudharynabin6.fragments.databinding.FragmentBasicsBinding


class FragmentBasics : Fragment() {

    private lateinit var binding: FragmentBasicsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBasicsBinding.inflate(inflater,container,false)
        binding.text.text = "hello"
        return binding.root

    }



}