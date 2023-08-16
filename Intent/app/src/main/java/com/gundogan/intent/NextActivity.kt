package com.gundogan.intent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gundogan.intent.databinding.ActivityMainBinding
import com.gundogan.intent.databinding.ActivityNextBinding
import com.gundogan.intent.ui.theme.IntentTheme

class NextActivity : ComponentActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        val intentFromMain=intent //getintent()
        val name=intentFromMain.getStringExtra("name")
        binding.nametext2.text="Name: ${name}"


    }
}

