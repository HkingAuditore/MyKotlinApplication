package com.example.kotlinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.test_layout.*

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_layout)

        button1.setOnClickListener(){
            Toast.makeText(this,"你点了一下我！",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        back.setOnClickListener(){
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"Add!",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"Remove!",Toast.LENGTH_SHORT).show()

        }
        return true
    }
}