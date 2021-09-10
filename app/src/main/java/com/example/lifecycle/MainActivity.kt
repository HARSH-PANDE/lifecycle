package com.example.lifecycle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("On create Called")
            //finish() //finish method called in onCreate()
        }
    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy Called")
    }
    override fun onPause() {
        super.onPause()
        println("On Pause Called")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop Called")
    }
}