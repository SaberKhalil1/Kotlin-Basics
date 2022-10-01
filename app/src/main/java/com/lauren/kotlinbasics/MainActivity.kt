package com.lauren.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //  println(10 * 3)
        // println("Salih")

        println("******** variables **********")

        // Variables
        var number = 1234
        var name = "salih"

        println(number)
        println(name)

        number = 521
        name = "Mohammed"

        println(number)
        println(name)
        //Constants
        val num1 = 21
        val name2 = "Yasir"
        println(num1)
        println(name2)

        println("********Integer**********")

        var num2: Int
        num2 = 36
        println(num2 / 2)
        num2 = 55
        println(num2 / 2)

        println("********Double vs Float**********")

        val pi: Double = 5.0
        val result = pi / 3
        println(result)
        val numFloat: Float = 5.0f
        println(numFloat / 3)

        println("********String**********")

        var firstName : String

        firstName = "Sabir"
        var lastName = "Halil"
        val myFullName = "sabir halil"

        println(firstName+" "+lastName)
        println("$firstName $lastName")
        println(myFullName.capitalize())

        println("********Boolean**********")
        // false true
        val bool : Boolean = false
        val myBoolean = true

        println(3 > 5)
        println(9 > 8)

        println("********Arrays**********")
        var myArray = arrayOf("Sabir","Mohammed","Musa","Yasir","Mahmmud")

        println(myArray.size)
        myArray[3] = "Isa"
        println(myArray[3])
        println(myArray[0])

        val numbersArray = arrayOf(3,4,1,2,5)
        println(numbersArray[3])

        val doubleArray = doubleArrayOf(3.2,6.5,8.5)
        println(doubleArray[1])
        println(doubleArray[2])

        val mixedArray = arrayOf(23,"Sabir",false)
        println(mixedArray[2])

        val intArray = ArrayList<Int>()
        println(intArray.size)
        intArray.add(14)
        intArray.add(5)
        intArray.add(4)
        intArray.add(1)
        println(intArray.size)
        println(intArray[2])

        val anyArray = ArrayList<Any>()
        anyArray.add("Sabir")
        anyArray.add(55)
        anyArray.add(1.0)
        anyArray.add(false)

        println(anyArray[3])

        println("********Sets**********")

        val numbersArray1 = arrayOf(3,3,4,1,2,5)
        println(numbersArray1.size)

        val mySet = setOf<Int>(3,3,4,1,2,5)
        println(mySet.size)

        val myHashSet = HashSet<String>()
        myHashSet.add("sabir")
        myHashSet.add("sabir")
        myHashSet.add("muhammed")
        myHashSet.add("muhammed")
        println(myHashSet.size)

        println("******** HashMap **********")

        val countriesPopulation = hashMapOf<String, Int>()
        countriesPopulation.put("Turkey",84)
        countriesPopulation.put("Irak",40)
        countriesPopulation.put("Syria",24)

        println(countriesPopulation["Syria"])

        val nameHash = hashMapOf<String,String>()
        nameHash.put("sabir","halil")
        nameHash.put("Elon","Musk")
        nameHash.put("Muhammed","Hashim")

        println(nameHash["Muhammed"])

        println("******** If statements **********")
        // > , < , <= , >= , == , != , -- && -- , -- || --
        val age = 18

        if (age >= 18){
            println("You can go abroad")
        }else{
            println("You can not go abroad")
        }

        val degree = 19

        if (degree >= 40){
            println("Air condition work for 30 ")
        }else if (degree >= 30){
            println("Air condition work for 20 ")
        }else if(degree >= 20){
            println("Air condition work for 10 ")
        }else{
            println("No need to work")
        }

        if (degree >= 20 || 3 > 5){
            println("it is right")
        }else{
            println("it is not right")
        }

        println("******** When **********")
        val month = 1
        var output = ""
 /*
        if (month ==1){
            output = "jan"
        }else if (month == 2){
            output ="fab"
        }else if ( month == 3){
            output = "mar"
        }else{
            output = "apr"
        }
        println(output)
  */
        when(month){
            1 -> output = "jan"
            2 -> output = "fab"
            3 -> output = "mar"
            else -> output = "apr"
        }
        println(output)

        println("******** For Loop **********")
        // For
        val state = "Welcome to Turkey"

        for ( i in 0..10){
            println(state)
        }

        val numbers = arrayOf(1,2,3,4,5,6,7,8,9)

        for (num in numbers){
            println(num)
        }

        println("******** While Loop **********")

        var u = 0
        //   u = u + 1
        while (u < 9){
            println(u)
            u++
        }
    }
}