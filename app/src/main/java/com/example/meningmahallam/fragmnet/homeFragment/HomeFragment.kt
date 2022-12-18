package com.example.meningmahallam.fragmnet.homeFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.meningmahallam.R
import com.example.meningmahallam.databinding.FragmentHomeBinding
import viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding { FragmentHomeBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {


        clickUp()
    }

    private fun clickUp() {
        //Nuroniy
        binding.btnNuroniylar.setOnClickListener {
            binding.llNuroniy.visibility =
                if (binding.llNuroniy.visibility == View.VISIBLE) View.GONE
                else View.VISIBLE
        }
        //yetim
        binding.btnYetim.setOnClickListener {
            binding.llYetim.visibility =
                if (binding.llYetim.visibility == View.VISIBLE) View.GONE
                else View.VISIBLE
        }
        //kam tamionlangan
        binding.btnPoor.setOnClickListener {
            binding.llPoor.visibility =
                if (binding.llPoor.visibility == View.VISIBLE) View.GONE
                else View.VISIBLE
        }

        //floatactionbar
        binding.fabAdd?.setOnClickListener {
            findNavController().navigate(R.id.filloutFragment)
        }
    }

}