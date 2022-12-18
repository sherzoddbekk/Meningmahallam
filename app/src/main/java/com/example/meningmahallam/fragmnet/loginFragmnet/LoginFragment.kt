package com.example.meningmahallam.fragmnet.loginFragmnet

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.meningmahallam.R
import com.example.meningmahallam.databinding.FragmentLoginBinding
import viewBinding

class LoginFragment:Fragment(R.layout.fragment_login) {

    private val binding by viewBinding { FragmentLoginBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        click()


    }

    //click
    private fun click() {
        binding.ivBack.setOnClickListener { 
            findNavController().navigateUp()
        }
        //malumotlarni saqlash
        binding.btnSaveAbout.setOnClickListener {
            if (binding.edtFullName.length()>5 && binding.edtNumber.length()==13) {
                Toast.makeText(activity, "Muvaffaqiyatli amalga oshirildi", Toast.LENGTH_SHORT)
                    .show()
            }else{
                Toast.makeText(activity, "Muvaffaqiyatli amalga oshirilmadi", Toast.LENGTH_SHORT)
                    .show()
            }
            findNavController().navigate(R.id.selectFragment)
        }
    }

    
    
}