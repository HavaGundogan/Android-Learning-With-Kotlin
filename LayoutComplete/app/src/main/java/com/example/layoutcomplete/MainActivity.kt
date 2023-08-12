package com.example.layoutcomplete

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private lateinit var myTextView:TextView
    private lateinit var button: Button
    private lateinit var nameText: EditText
    private lateinit var ageText: EditText
    private lateinit var jobText: EditText
    var name=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//bunu nasıl unuttum?


        myTextView=findViewById(R.id.textView)
        button=findViewById(R.id.button)
        nameText=findViewById(R.id.nameText)
        ageText=findViewById(R.id.ageTe3xt)
        jobText=findViewById(R.id.jobText)




    }

    fun buttononclick(view: View){
        //scope = kapsam, kendi içinde bulunduğu kod bloğunda geçerli.
        name=nameText.text.toString()
        val age=ageText.text.toString().toIntOrNull()
        val job=jobText.text.toString()


        if (age != null){
            val simpson=Simpson(name,age!!,job)
            myTextView.text = "Name: ${simpson.name}  Age: ${simpson.age} Job: ${simpson.job}"
        }else
        {
            myTextView.text= "Enter your age!"
        }

    }

}
