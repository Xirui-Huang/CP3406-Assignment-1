package com.example.assignment1_xiruihuang

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data for ListView
        val bookList = listOf(
            BookItem("The Count Of Monte Cristo", "Alexandre Dumas", R.drawable.book1),
            BookItem("The Hunger Games", "Suzanne Collins", R.drawable.book2),
            BookItem("The Great Gatsby", "Francis Scott Key Fitzgerald", R.drawable.book3),
            BookItem("Harry Potter", "J. K. Rowling", R.drawable.book4),

        )

        // Set up the adapter
        val listView: ListView = findViewById(R.id.lvBooks)
        listView.adapter = BookAdapter(this, bookList)

        // Button click listeners
        val btnAddBook: Button = findViewById(R.id.btnAddBook)
        btnAddBook.setOnClickListener {
            Toast.makeText(this, "Add Book clicked", Toast.LENGTH_SHORT).show()
        }

        val btnRecommendations: Button = findViewById(R.id.btnRecommendations)
        btnRecommendations.setOnClickListener {
            Toast.makeText(this, "View Recommendations clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
