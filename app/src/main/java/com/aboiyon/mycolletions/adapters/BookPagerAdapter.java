package com.aboiyon.mycolletions.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.aboiyon.mycolletions.models.Book;
import com.aboiyon.mycolletions.ui.BookDetailFragment;

import java.util.List;

public class BookPagerAdapter extends FragmentStateAdapter {
    private List<Book> mBooks;

    public BookPagerAdapter(@NonNull FragmentManager fragmentManager, Lifecycle lifecycle, List<Book> books){
        super(fragmentManager, lifecycle);
        mBooks = books;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position){
        return BookDetailFragment.newInstance(mBooks.get(position));
    }

    @Override
    public int getItemCount(){
        return mBooks.size();
    }
}
