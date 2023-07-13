package com.example.tabsviewpagerexample

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tabsviewpagerexample.databinding.FragmentFruitsBinding

class FruitsFragment: Fragment() {

    private lateinit var binding: FragmentFruitsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("onCreatedView", "Fruits")
        binding = FragmentFruitsBinding.inflate(inflater)
        return binding.root
    }
}