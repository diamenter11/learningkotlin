package com.example.learningkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerview : RecyclerView
    private lateinit var countryarray : ArrayList<countries>
    lateinit var imageId : Array<Int>
    lateinit var countryname : Array<String>
    lateinit var countrycode : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageId = arrayOf(
            R.drawable.cameroon, R.drawable.cocos,R.drawable.espagne,R.drawable.ethiopia,
            R.drawable.finland,R.drawable.irland,R.drawable.nigeria,R.drawable.senegal,
            R.drawable.pakistant, R.drawable.southgeorgia,R.drawable.spain,R.drawable.sunflower,
            R.drawable.daisy,R.drawable.dahlia


        )
        countryname = arrayOf(
            "camroon","cocos","espagne","ethiopia","finland","irland","nigeria" ,
                    "senegal","pakistant","southgeorgia","spain","sunflower","daisy","dahlia"
        )

        countrycode = arrayOf(
            "1","2","3","4","5","6","7","8","9","10","11","12","13","14"

                )

        newRecyclerview = findViewById(R.id.title_image)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        countryarray = arrayListOf<countries>()
        getuserdata()






    }0

    private fun getuserdata() {
        for(i in imageId.indices){
            val countries = countries(imageId[i], countryname[i], countrycode[i] )
            countryarray.add(countries)
        }

        newRecyclerview.adapter = countryadapter(countryarray)
    }

}