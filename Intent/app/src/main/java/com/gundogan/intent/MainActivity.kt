package com.gundogan.intent

import android.content.Intent
import android.os.Bundle
import android.view.View
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
import com.gundogan.intent.ui.theme.IntentTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }



    fun nextpage1(view:View){


        //geçiş işlemi
        val intent =Intent(this@MainActivity,NextActivity::class.java)
        intent.putExtra("name",binding.editText1.text.toString())
        startActivity(intent)
    }
    }


