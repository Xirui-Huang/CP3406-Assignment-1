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
            BookItem("Book 1", "Sub Item 1", R.drawable.book1),
            BookItem("Book 2", "Sub Item 2", R.drawable.book2),
            BookItem("Book 3", "Sub Item 3", R.drawable.book3),
            BookItem("Book 4", "Sub Item 4", R.drawable.book1),
            BookItem("Book 5", "Sub Item 5", R.drawable.book2),
            BookItem("Book 6", "Sub Item 6", R.drawable.book3),
            BookItem("Book 7", "Sub Item 7", R.drawable.book1),
            BookItem("Book 8", "Sub Item 8", R.drawable.book2),
            BookItem("Book 9", "Sub Item 9", R.drawable.book3),
            BookItem("Book 10", "Sub Item 10", R.drawable.book1)
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
