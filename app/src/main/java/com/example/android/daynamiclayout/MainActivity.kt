package com.example.android.daynamiclayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val car1: Car = Car(model = 2019, name = "BMW", make = "German", color = "black")
        val car2: Car = Car("kia", "korean", 2017, "white")
        val car3: Car = Car("QQ", "Chinese", 2008, "Green")

        val carsArray= listOf(car1,car2,car3,car2,car1)
        val adapter= CarsAdapter(carList = carsArray)

        carRecycleView.layoutManager = GridLayoutManager(this, 2)

        carRecycleView.adapter = adapter

    }


}
