package com.aboiyon.mycolletions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BooksActivity extends AppCompatActivity {
    private TextView mBooksTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        mBooksTextView = (TextView) findViewById(R.id.booksTextView);
        Intent intent = getIntent();
        String books = intent.getStringExtra("books");
        mBooksTextView.setText("Here are some common books: " + books);
    }
}