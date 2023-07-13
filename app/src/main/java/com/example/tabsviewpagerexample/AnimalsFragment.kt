package com.example.tabsviewpagerexample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tabsviewpagerexample.databinding.FragmentAnimalsBinding

class AnimalsFragment: Fragment() {

    private lateinit var binding: FragmentAnimalsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("onCreatedView", "Animals")
        binding = FragmentAnimalsBinding.inflate(inflater)
        return binding.root
    }
}