package com.example.navigation

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val button = view.findViewById<Button>(R.id.button)
        val button1 = view.findViewById<Button>(R.id.button1)
        val button2 = view.findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_wireFragment)
        }
        button1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_conduit)
        }
        button2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_conduitBodiesFragment)
        }
        return view
    }




}