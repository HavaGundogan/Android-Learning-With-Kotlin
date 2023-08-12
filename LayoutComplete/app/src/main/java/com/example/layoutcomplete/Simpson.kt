package com.example.layoutcomplete

class Simpson(
    var name: String, var age: Int
    , var job:String){
   private var height =0
    fun setHeight(num:Int){
        if(num>100){
            height=num
        }
    }
}