package com.gundogan.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables
        var x=5
        var y=9
        var age=35
        var myLong: Long= 233
        println(age/x*7)
        age=36
        println(age)

        //Constants

        val name= "Buse"
       // name= "Hava"------- değişmiyor
        //val olarak tanımlanan değerler değiştirilemez sabittir.

        //Integer --- tam sayılar
        var xy= 67
        var result= age/7*5
        println(result)

        //aşağıdaki ise defining yani tanımlamak
        val myInteger : Int //myInteger integer bir değer alabilir.Başka tip tanımlanamaz


        myInteger=10 //bu başlatmak , ilk değerini atamak yani initialize etmek
       //myInteger=20---bu olmaz tek değer atandı

        val a : Int=5 //defining ve initialize aynı anda da yapılabilir.

        //kesirli sayılar double & float
        val pi = 3.14
        println(pi*2)
        val myFloat=3.14f
        println(myFloat*2)

        var myAge: Double
        myAge=38.0

        //camelCase-- genelde kotlinde bu kullanılır.
        //snake_case

        println("------------String ifadeler-----------")
        val myString:String="Hava Gundogan"
        val namee ="james"
        val surname="Hetfield"
        val fullname=namee+" "+surname
println(fullname)
        val larsName :String="Lars"


        //boolean değerler
        var myBoolean:Boolean= true
        myBoolean=false

        var isAlive =true
        //bunu kontrollerde kullanacağız

        println(3<5)
        println(6<2)

        //birbirine döndürme, conversion
        println("------conversion-----")

        var myNumber=5
       var myLongNumber= myNumber.toLong()
        println(myLongNumber)

        var input = "10"

        println(input.toInt()*5)








    }
}