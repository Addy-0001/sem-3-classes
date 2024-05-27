package com.example.gametask.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gametask.R
import com.example.gametask.databinding.ActivityBase1Binding
import com.example.gametask.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    lateinit var blankBinding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        blankBinding = FragmentBlankBinding.inflate(layoutInflater)
        var newDestinationBinding =  inflate(inflater, container, false)
        var name = newDestinationBinding.
        return newDestinationBinding.root
    }
}