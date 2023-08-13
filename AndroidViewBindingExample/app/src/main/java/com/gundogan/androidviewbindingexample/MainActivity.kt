package com.gundogan.androidviewbindingexample

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
import com.gundogan.androidviewbindingexample.databinding.MainActivityBinding
import com.gundogan.androidviewbindingexample.ui.theme.AndroidViewBindingExampleTheme


//findviewvbyid kötü bir şey çünkü R.id her çalıştığında arka planda programı yoruyor.Gezerek buluyor.
class MainActivity : ComponentActivity() {

    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root //görünümü aldı ve birbirine eşitledi
        setContentView(view)
    }
     fun mySum(view:View){
        val number1=binding.sayi1.text.toString().toDoubleOrNull()
        val number2=binding.sayi2.text.toString().toDoubleOrNull()

        if (number1!=null && number2!=null){
            val result =number1+ number2
            binding.sonu.text="result: ${result}"
        }else
        {
            binding.sonu.text= "Enter Number!"
        }


    }
     fun mySub(view:View){
        val number1=binding.sayi1.text.toString().toDoubleOrNull()
        val number2=binding.sayi2.text.toString().toDoubleOrNull()

        if (number1!=null && number2!=null){
            val result =number1-number2
            binding.sonu.text="result: ${result}"
        }else
        {
            binding.sonu.text= "Enter Number!"
        }


    }
     fun myMultiply(view:View){
        val number1=binding.sayi1.text.toString().toDoubleOrNull()
        val number2=binding.sayi2.text.toString().toDoubleOrNull()

        if (number1!=null && number2!=null){
            val result =number1* number2
            binding.sonu.text="result: ${result}"
        }else
        {
            binding.sonu.text= "Enter Number!"
        }


    }
     fun myDiv(view:View){

        val number1=binding.sayi1.text.toString().toDoubleOrNull()
        val number2=binding.sayi2.text.toString().toDoubleOrNull()

        if (number1!=null && number2!=null){
            val result =number1/number2
            binding.sonu.text="result: ${result}"
        }else
        {
            binding.sonu.text= "Enter Number!"
        }

    }


}

