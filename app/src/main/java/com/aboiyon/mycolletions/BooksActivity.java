package com.aboiyon.mycolletions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class BooksActivity extends AppCompatActivity {
    private TextView mBooksTextView;
    private ListView mListView;
    private String[] books = new String[] {"Java", "Kotlin", "JavaScript", "TypeScript", "Python", "Ruby", "C++", "C#", "c", "Go"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        mBooksTextView = (TextView) findViewById(R.id.booksTextView);

        mListView = (ListView) findViewById(R.id.ListView);
        mBooksTextView = (TextView) findViewById(R.id.booksTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, books);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String book = ((TextView)view).getText().toString();
                Toast.makeText(BooksActivity.this, book, Toast.LENGTH_LONG).show();
            }
        });
        Intent intent = getIntent();
        String books = intent.getStringExtra("books");
        mBooksTextView.setText("Here are some common books: " + books);
    }
}