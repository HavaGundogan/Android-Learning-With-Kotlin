package com.example.layoutcomplete

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.layoutcomplete.ui.theme.LayoutCompleteTheme

class MainActivity : ComponentActivity() {
    lateinit var myTextView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//bunu nasıl unuttum?


        myTextView=findViewById(R.id.textView)




    }

    fun buttononclick(view: View){
        myTextView.text="Button clicked"
    }
}
