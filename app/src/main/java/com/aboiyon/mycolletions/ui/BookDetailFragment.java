package com.aboiyon.mycolletions.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.aboiyon.mycolletions.databinding.FragmentBookDetailBinding;
import com.aboiyon.mycolletions.models.Book;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BookDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BookDetailFragment extends Fragment {

    private FragmentBookDetailBinding binding;
    private Book mBook;

    public BookDetailFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BookDetailFragment newInstance(Book book) {
        BookDetailFragment bookDetailFragment = new BookDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("book", book);
        bookDetailFragment.setArguments(args);
        return bookDetailFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getArguments() != null;
        mBook = getArguments().getParcelable("book");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment using view binding
        binding = FragmentBookDetailBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        Picasso.get().load(mBook.getImage()).into(binding.bookImageView);

        binding.bookTitleTextView.setText(mBook.getTitle());
        binding.subtitleTextView.setText(mBook.getSubtitle());
        binding.priceTextView.setText(mBook.getPrice());
        binding.isbnTextView.setText(mBook.getIsbn13());
        binding.urlTextView.setText(mBook.getUrl());
        return view;
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        binding = null; // Clear the binding reference to avoid memory leaks
    }
}