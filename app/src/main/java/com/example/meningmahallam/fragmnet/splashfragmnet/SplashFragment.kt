package com.example.meningmahallam.fragmnet.splashfragmnet

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.meningmahallam.R
import com.example.meningmahallam.activity.MainActivity
import kotlinx.coroutines.*

class SplashFragment : Fragment(R.layout.fragment_splash) {
    // private val binding by { FragmentSplashBinding.bind(it) }
    private var timer: CountDownTimer? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initviews()
    }

    private fun initviews() {
        timer()
    }

    private fun timer() {
        timer = object : CountDownTimer(3000, 1500) {
            override fun onTick(p0: Long) {
                Log.d("RRR", "Splash $p0")
            }

            override fun onFinish() {
                Log.d("RRR", "Splash finish")
                findNavController ()
                    .navigate(R.id.homeFragment ,
                        null,
                        NavOptions.Builder()
                            .setPopUpTo(R.id.splashFragment ,
                                true).build()
                    )
            }

        }.start()
    }


}