package com.aboiyon.mycolletions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindBooksButton;
    public static final String TAG = MainActivity.class.getSimpleName();
    private EditText mBooksEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBooksEditText = (EditText) findViewById(R.id.booksEditText);
        mFindBooksButton = findViewById(R.id.findBooksButton);
        mFindBooksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String books = mBooksEditText.getText().toString();
//                Log.d(TAG, books);
                Intent intent = new Intent(MainActivity.this, BooksActivity.class);
                intent.putExtra("books", books);
                startActivity(intent);
            }
        });
    }
}

