package com.gundogan.countdowntimer

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gundogan.countdowntimer.databinding.ActivityMainBinding
import com.gundogan.countdowntimer.ui.theme.CountDownTimerTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //abstract-interface-ıntheritance

        object: CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {
              binding.textView.setText("seconds remaining: " + p0 / 1000)

                // binding.textView.text = "Left: ${p0/1000}"
            }

            override fun onFinish() {
                binding.textView.text= "Left : 0"
            }

        }.start()

    }
}

