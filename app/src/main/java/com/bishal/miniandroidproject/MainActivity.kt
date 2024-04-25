package com.bishal.miniandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.WindowManager
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Find the ImageView that represents the book cover
        val bookCoverImageView: ImageView = findViewById(R.id.book1_iv);
        val menuImageView: ImageView = findViewById(R.id.menu_btn)

        // Set a click listener on the book cover image
        bookCoverImageView.setOnClickListener {

            Toast.makeText(this,"Opening...",Toast.LENGTH_LONG).show();
            // Define the Google Drive PDF link
            val googleDrivePdfLink = "https://drive.google.com/file/d/1yJjINH-I41e5h-SC0fUxwASj9lxsM5F_/view?usp=sharing"

            // Create an intent to launch the WebActivity and pass the link
            val intent = Intent(this, WebActivity::class.java)
            intent.putExtra("Link", googleDrivePdfLink)

            // Start the WebActivity
            startActivity(intent)
        }
        menuImageView.setOnClickListener {
            Toast.makeText(this,"Processing...",Toast.LENGTH_LONG).show();
            val intent = Intent(this, MenuActivity::class.java)
            // Start the WebActivity
            startActivity(intent)
        }


    }
}
