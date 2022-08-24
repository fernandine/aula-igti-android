package br.com.cursoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Log.i("Aula","Passou pelo onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Aula", "Passou pelo onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Aula", "Passou pelo onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Aula", "Passou pelo onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Aula", "Passou pelo onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("Aula", "Passou pelo onDestroy")
    }
}