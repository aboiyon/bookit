package com.aboiyon.mycolletions.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.aboiyon.mycolletions.databinding.BookListItemBinding;
import com.aboiyon.mycolletions.models.Book;
import com.aboiyon.mycolletions.ui.BookDetailActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder> {
    private List<Book> mBooks;
    private Context mContext;

    public BookListAdapter(Context context, List<Book> books){
        mContext = context;
        mBooks = books;
    }
    public class BookViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private BookListItemBinding mBinding;
        private Context mContext;
        private List<Book> mBooks;

        public BookViewHolder(BookListItemBinding binding){
            super(binding.getRoot());
            mBinding = binding;
            mContext = itemView.getContext();

            itemView.setOnClickListener(this);
        }
        public void bindBook(Book book){
            Picasso.get().load(book.getImage()).into(mBinding.bookImageView);
            mBinding.bookNameTextView.setText(book.getTitle());
            mBinding.categoryTextView.setText(book.getSubtitle());
            mBinding.isbnTextView.setText(book.getIsbn13());
        }

        @Override
        public void onClick(View view) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, BookDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("books", (CharSequence) mBooks);
            mContext.startActivity(intent);
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
