package com.aboiyon.mycolletions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.findBooksButton) Button mFindBooksButton;
    @BindView(R.id.booksEditText) EditText mBooksEditText;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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

