package com.example.meningmahallam.fragmnet.selectFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.meningmahallam.R
import com.example.meningmahallam.databinding.FragmentSelectBinding
import viewBinding

class SelectFragment : Fragment(R.layout.fragment_select) {

    private val binding by viewBinding { FragmentSelectBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        //click
        click()
    }

    private fun click() {
        //backward
        binding.ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        //Nuroniylar
        binding.btnNuroniylar.setOnClickListener {
            binding.llNuroniy.visibility =
                if (binding.llNuroniy.visibility == View.VISIBLE) View.GONE else View.VISIBLE
        }

        //Nuroniylar
        binding.btnYetim.setOnClickListener {
            binding.llYetim.visibility =
                if (binding.llYetim.visibility == View.VISIBLE) View.GONE else View.VISIBLE
        }

        //Nuroniylar
        binding.btnPoor.setOnClickListener {
            binding.llPoor.visibility =
                if (binding.llPoor.visibility == View.VISIBLE) View.GONE else View.VISIBLE
        }
    }
}