package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView : ListView = findViewById(R.id.listItem)
        val listItem = arrayOf("android development in morning" ," break fast ", " interview preparation " , "Dsa")

        val listAdapter = ArrayAdapter(this , android.R.layout.simple_list_item_1 , listItem)
        listView.adapter = listAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectView = parent.getItemAtPosition(position) as String
            Toast.makeText(this , "you have clicked $selectView " , Toast.LENGTH_SHORT).show()
        }

    }
}