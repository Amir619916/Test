package com.example.dummy6.Fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.dummy6.R
import com.example.dummy6.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //this is how you use splash fragment with navigation component
        Handler(Looper.myLooper()!!).postDelayed({

                                                 findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
        },4000)


        // Inflate the layout for this fragment
        return binding.root
    }


}