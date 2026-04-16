package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Arrays
import kotlin.math.log

//logs the content of an array of strings
fun logArrValues(arr: Array<String>, limit: Int = 0){
    if (limit == 0) {
        Log.v("Array Values", Arrays.toString(arr))
    } else {
        Log.v("Array Values", Arrays.toString(
            arr.sliceArray(0..limit - 1)))
    }
    Log.v("Array Values", Arrays.toString(arr))
}


class MainActivity : AppCompatActivity() {
    // team list
    val teams = arrayOf<String>("Mamelodi Sundowns FC",
        "Bidvest Wits",
        "Orlando Pirates",
        "Kaizer Chiefs",
        "Cape Town City FC")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsText = findViewById<TextView>(R.id.teamsDisplayid)

        teams[0] = "Mamelodi Sundowns FC :)"

        //calling function to display all values form the teams array
        logArrValues(arr = teams)

        //assigning array content to a variable

        //for loop to loop, to describe all the arrays and display all its values
        var teamsDisplay = ""
        for (team in teams){
            teamsDisplay += "${team}\n"
        }





//        //assigning array position of 0 teams array to a new value
//        var teamsDisplay =""
//        var count = 0
//        while(count< teams.count()) {
//            teamsDisplay += "${teams[count]}\n"
//            count++
//
//        }


//        teamsDisplay +="${teams[0]}\n"
//        teamsDisplay +="${teams[1]}\n"
//        teamsDisplay +="${teams[2]}\n"
//        teamsDisplay +="${teams[3]}\n"
//        teamsDisplay +="${teams[4]}\n"
//        teamsDisplay +="${teams[5]}\n"

        //display array content in the text view

        teamsText.text = teamsDisplay




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}