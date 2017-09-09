package com.example.viktory.kotlinintrolbta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private class Student(val name: String, val age: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val thisIsAVariable = "some String"
//        Log.d("onCreate",thisIsAVariable)

        val student = Student("Henry", 200)
        val student1 = Student("Valerian",300)
        val student2 = Student(age=150,name="Kissinger")

        Log.i("Student's name is",student.name.toString())
        Log.d("Student1's age is", student1.age.toString())
        Log.i("Student2's name is",student2.name.toString())

        for (i in 0..50){
            if (i % 15 ==0){
                Log.i("FizzBuzz", i.toString())
            } else if (i % 3 == 0){
                Log.i("Fizz", i.toString())
            } else if (i % 5 == 0){
                Log.i("Buzz",i.toString())
            }
        }



    }
}
