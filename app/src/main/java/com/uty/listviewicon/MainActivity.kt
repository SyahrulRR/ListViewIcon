package com.uty.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.listviewicon.ListPirateAdapter
import com.uty.listviewicon.model.Pirate
import com.uty.listviewicon.model.PirateData

class MainActivity : AppCompatActivity() {
    private lateinit var rvPirate: RecyclerView
    private var list: ArrayList<Pirate> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPirate = findViewById(R.id.rv_pirate)
        rvPirate.setHasFixedSize(true)
        list.addAll(PirateData.listPirate)
        showPirateList()
    }

    private fun showPirateList() {
        rvPirate.layoutManager = LinearLayoutManager(this)
        val listPirateAdapter = ListPirateAdapter(list)
        rvPirate.adapter = listPirateAdapter
    }
}
