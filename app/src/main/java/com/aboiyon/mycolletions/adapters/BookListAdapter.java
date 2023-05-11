package com.aboiyon.mycolletions.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.aboiyon.mycolletions.databinding.ActivityBooksBinding;
import com.aboiyon.mycolletions.databinding.BookListItemBinding;
import com.aboiyon.mycolletions.models.Book;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder> {
    private List<Book> mBooks;
    private Context mContext;

    public BookListAdapter(Context context, List<Book> books){
        mContext = context;
        mBooks = books;
    }
    public class BookViewHolder extends RecyclerView.ViewHolder {
        private BookListItemBinding mBinding;

        public BookViewHolder(BookListItemBinding binding){
            super(binding.getRoot());
            mBinding = binding;
        }
        public void bindBook(Book book){
//            mBinding.bookImageView.setImageAlpha(book.getImage());
            mBinding.bookNameTextView.setText(book.getTitle());
            mBinding.categoryTextView.setText(book.getSubtitle());
            mBinding.isbnTextView.setText(book.getIsbn13());
        }
    }
    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        BookListItemBinding binding = BookListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new BookViewHolder(binding);
    }
    @Override
    public void onBindViewHolder(BookViewHolder holder, int position){
        Book book = mBooks.get(position);
        holder.bindBook(book);
    }
    @Override
    public int getItemCount(){
        return mBooks.size();
    }
}
