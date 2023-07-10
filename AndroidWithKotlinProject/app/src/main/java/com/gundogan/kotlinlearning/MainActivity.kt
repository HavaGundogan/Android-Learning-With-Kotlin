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

        //Collections
        //Arrays

        println("------------Arrays-------")
        val myArray = arrayOf("James","kİrk","Larce")
        //index
        println(myArray[0])
        myArray[0]="hava"
        println("yeni değer "+myArray[0])
        myArray.get(0)
        myArray.set(1,"Ayse")
        println(myArray[1])

        // myArray[4]="atıl"  //bu eklenmedi sebebi array oluştuğunda boyutu belirlenmiş olur.
       // println(myArray[4])

        //boyut sorunuyla karşılaşmamak için listeler kullanılır.

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)
        val mixedArray= arrayOf("hava",2,5)
        println(mixedArray[0])

        //list array list

        println("------------Array List ---------")

        val musician= arrayListOf<String>("hava","ayse")
        musician.add("betul")
        println(musician[2])

        val myMixedArrayList=ArrayList<Any>()
        myMixedArrayList.add("hava")
        myMixedArrayList.add(2)
        println(myMixedArrayList[0])

        //set
        println("--------------Set-----------")

        val myExampleArray= arrayOf(1,1,2,30,4)
        println("element 1 : ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size) // set lerde aynı eleman iki kere bulunamaz onu bir kere sayar.


        //For Each

        mySet.forEach{ println(it) } //lambda gösterimi bu

        val myStringSet =HashSet<String>()
        myStringSet.add("hava")
        myStringSet.add("hava")
        myStringSet.add("recep")
        println(myStringSet.size)

        //map - hashmap
        println("------------map----------")
        //dizileri veya verileri birbiri ile eşleştirmeyi sağlar key-value

        val fruitArray = arrayOf("Apple","Banana")
        val caloriesArray= arrayOf(100,200)
        println("${fruitArray[0]} : ${caloriesArray[0]}")


        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("apple",100)
        fruitCalorieMap.put("banana",200)
        println(fruitCalorieMap["apple"])
        //veriler genelde bu formatta çekilip kaydedilir.

        val myNewMap= hashMapOf<String,Int>("a" to 1,"b" to 4, "c" to 7)
        println(myNewMap["a"])

        //operatörler
        // <,>,||,&&,==-









    }
}