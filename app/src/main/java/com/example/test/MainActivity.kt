package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewBooks: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewBooks = findViewById(R.id.recyclerViewsBooks)

        val items = listOf(
            Book("L'Aquarelle, guide pour les débutants", "Ceci est la description du livre", R.drawable.aquarelle_guide_debutant, 3.2F, "Sully"),
            Book("La Brume des bois", "Ceci est la description du livre", R.drawable.la_brume_des_bois, 4.2F, "Axel"),
            Book("La couverture de Jane", "Ceci est la description du livre", R.drawable.la_couverture_de_jane, 5.0F, "Jean"),
            Book("Un appart' de rêve", "Ceci est la description du livre", R.drawable.un_appart_de_reve, 2.8F, "Joe"),
        )

        recyclerViewBooks.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = BooksAdapter(items)
        }

    }
}