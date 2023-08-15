package com.gundogan.storingdata

import android.content.SharedPreferences
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
import com.gundogan.storingdata.databinding.ActivityMainBinding
import com.gundogan.storingdata.ui.theme.StoringDataTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPref:SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        //shared preferences --- bir xml dosyası-- key/value
      sharedPref= getSharedPreferences("com.gundogan.storingdata", MODE_PRIVATE)//oluşturacağım xml e sadece benim uygulamam oluşacak.

        val userAgePref = sharedPref.getInt("age",-1)

        if (userAgePref == -1){
            binding.textView.text= "yourage: "

        }else{
            binding.textView.text="your age: ${userAgePref}"
        }

    }

    fun save(view: View){
     val myAge=   binding.editText.text.toString().toIntOrNull()

     if(myAge!= null){
         binding.textView.text="your age: "+myAge
         sharedPref.edit().putInt("age",myAge).apply()

     }





    }
    fun delete(view: View){

        val userAgePref =sharedPref.getInt("age",-1)

        if (userAgePref!=-1){
            sharedPref.edit().remove("age").apply()
            binding.textView.text="your age "

        }else{

        }

    }

}


