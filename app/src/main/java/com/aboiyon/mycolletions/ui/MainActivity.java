package com.aboiyon.mycolletions.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.findBooksButton.setOnClickListener(this);
    }
    @Override
        public void onClick(View view) {
        if (view == binding.findBooksButton) {
            String books = binding.booksEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, BooksActivity.class);
            intent.putExtra("books", books);
            startActivity(intent);
        }
    }
}
