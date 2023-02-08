package com.example.dummy6.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.dummy6.R
import com.example.dummy6.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)


        //NavigationUI.navigateUp(findNavController(R.id.frg_host))??????






        // to use navigation component for bottom navigation
        //NavigationUI.setupWithNavController(binding.bottomNavigationMain,findNavController(R.id.frg_host))?????

        return binding.root

    }



}