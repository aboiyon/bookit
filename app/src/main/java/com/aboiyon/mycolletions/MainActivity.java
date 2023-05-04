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

import com.aboiyon.mycolletions.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
//    @BindView(R.id.findBooksButton) Button mFindBooksButton;
//    @BindView(R.id.booksEditText) EditText mBooksEditText;
//    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.findBooksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String books = binding.booksEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, BooksActivity.class);
                intent.putExtra("books", books);
                startActivity(intent);
            }
        });
    }
}

