package com.gundogan.alertdialog

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gundogan.alertdialog.databinding.ActivityMainBinding
import com.gundogan.alertdialog.ui.theme.AlertDialogTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // toast massage/ alert dialog/ snackbar ile kullanıcıya mesaj gösterebiliriz.

        //Context diye bir parametre isteyecek. context andrroid işletim sisteminde nerde ne olduğunu takip etmek için androidin oluşturduğu yapı.
        // Kullanıcıyla etkileşime geçilecek yerlerde sen bunu nerede yapmak istediğini anlamak için istiyor.
        //aktivitenin içinde veya genel olarak bütün uygulama içinde olmak üzere farklı yerler için isteyebilir.

        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG).show()

        val button = findViewById<Button>(R.id.button)
        // Context
        //activity context---> this
        //application context ---> applicationContext

    }
    fun button(view: View){
       // val alert =AlertDialog.Builder(applicationContext)//yanlış kullanım
        val alert =AlertDialog.Builder(this)
        alert.setTitle("Title")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("yes",object :DialogInterface.OnClickListener{

            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(this@MainActivity,"Save",Toast.LENGTH_LONG).show()

            }

        })

        alert.show()


    }

}