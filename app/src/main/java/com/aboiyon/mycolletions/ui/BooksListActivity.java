package com.aboiyon.mycolletions.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aboiyon.mycolletions.Constants;
import com.aboiyon.mycolletions.adapters.BookListAdapter;
import com.aboiyon.mycolletions.databinding.ActivityBooksBinding;
import com.aboiyon.mycolletions.models.Book;
import com.aboiyon.mycolletions.models.BookStoreSearchResponse;
import com.aboiyon.mycolletions.network.BookStoreApi;
import com.aboiyon.mycolletions.network.BookStoreClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class BooksListActivity extends AppCompatActivity {
    private static final String TAG = BooksListActivity.class.getSimpleName();
    private ActivityBooksBinding binding;
    private BookListAdapter mAdapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBooksBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        mRecyclerView = binding.recyclerView;

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        binding.recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
                View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if (child != null && motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    int position = recyclerView.getChildAdapterPosition(child);
                    String book = ((TextView) child).getText().toString();
                    Toast.makeText(BooksListActivity.this, book, Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
                // Do nothing
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
                // Do nothing
            }
        });

        Intent intent = getIntent();
        String books = intent.getStringExtra("books");
//        binding.booksTextView.setText("Home: ");

//        search books by keyword
        String searchUrl = String.format(Constants.SEARCH_URL, "android, machine learning, A.I");
        Call<BookStoreSearchResponse> searchResponseCall = BookStoreClient.getClient().searchBooks(searchUrl);

//        Get new books
        Call<BookStoreSearchResponse> newBooksCall = BookStoreClient.getClient().getNewBooks();

//        Get books in programming category, page 10
        Call<BookStoreSearchResponse> booksByCategoryCall = BookStoreClient.getClient().getBooksByCategory("programming", 1);

//        make the API calls
        BookStoreApi client = BookStoreClient.getClient();
        Call<BookStoreSearchResponse> call = client.searchBooks("books");

        call.enqueue(new Callback<BookStoreSearchResponse>() {
            @Override
            public void onResponse(Call<BookStoreSearchResponse> call, Response<BookStoreSearchResponse> response) {
                if (response.isSuccessful()){
                    List<Book> bookList = response.body().getBooks();
                    RecyclerView.Adapter adapter = new BookListAdapter(BooksListActivity.this, bookList);
                    binding.recyclerView.setAdapter(adapter);
                    showBooks();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<BookStoreSearchResponse> call, Throwable t) {
                Log.e("Error message", "onFailure: ", t);
                hideProgressBar();
                showFailureMessage();
            }
        });
    }
    private void showFailureMessage(){
        binding.errorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        binding.errorTextView.setVisibility(View.VISIBLE);
    }
    private void showUnsuccessfulMessage(){
        binding.errorTextView.setText("Something went wrong. Please try again later");
        binding.errorTextView.setVisibility(View.VISIBLE);
    }
    private void showBooks(){
        binding.recyclerView.setVisibility(View.VISIBLE);
    }
    private void hideProgressBar(){
        binding.progressBar.setVisibility(View.GONE);
    }
}