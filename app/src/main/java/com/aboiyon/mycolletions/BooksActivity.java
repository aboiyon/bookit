package com.aboiyon.mycolletions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.aboiyon.mycolletions.databinding.ActivityBooksBinding;

public class BooksActivity extends AppCompatActivity {
    private ActivityBooksBinding binding;
    private String[] books = new String[] {"Java", "Kotlin", "JavaScript", "TypeScript", "Python", "Ruby", "C++", "C#", "c", "Go"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBooksBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, books);
        binding.listView.setAdapter(adapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String book = ((TextView)view).getText().toString();
                Toast.makeText(BooksActivity.this, book, Toast.LENGTH_LONG).show();
            }
        });
        Intent intent = getIntent();
        String books = intent.getStringExtra("books");
        binding.booksTextView.setText("Here are some common books: " + books);
    }
}