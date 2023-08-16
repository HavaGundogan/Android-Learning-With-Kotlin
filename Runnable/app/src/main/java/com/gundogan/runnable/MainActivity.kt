package com.gundogan.runnable

import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
import com.gundogan.runnable.databinding.ActivityMainBinding
import com.gundogan.runnable.ui.theme.RunnableTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    var number= 0
    var runnable:Runnable= Runnable {}
    var handler:Handler= Handler(Looper.getMainLooper())

    // theareding paralel çekirdekler içinde işlemler yapılabilir. İşlemci birden fazla çekşirdekli ise ya da tek çekirdekte aynı anda farklı işlemleri yapmak için kullanılır.
    //thread yerine runnable diye bir yapı oluşturmuşlar.
    //runnable kullanmak için handler denen bir yapı lazım. Bunun tek amacı runnable objelerini yönetebilmek yani yardımcı.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }


    fun buttonStart(view: View){
        number=0
        runnable=object :Runnable{
            override fun run() {
               number=number+1
                binding.textView.text= "Time: ${number}"

                handler.postDelayed(this,1000)
            }

        }


        handler.post(runnable)
        binding.buttonStart.isEnabled= false

    }

    fun buttonFinish(view: View){
        binding.buttonStart.isEnabled=true
        number=0
        binding.textView.text= "Time: 0"
        handler.removeCallbacks(runnable)

    }
}

