package com.yapayzeka.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.yapayzeka.coderswag.Adapters.CategoryAdapter
import com.yapayzeka.coderswag.Adapters.CategoryRecycleAdapter
import com.yapayzeka.coderswag.Model.Category
import com.yapayzeka.coderswag.R
import com.yapayzeka.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var adapter: ArrayAdapter<Category>
    //lateinit var adapter: CategoryAdapter
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapter = ArrayAdapter(this,
//                android.R.layout.simple_list_item_1,
//                DataService.categories)

        //adapter = CategoryAdapter(this, DataService.categories)
        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter;

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener { adapterView, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
//        }
    }
}