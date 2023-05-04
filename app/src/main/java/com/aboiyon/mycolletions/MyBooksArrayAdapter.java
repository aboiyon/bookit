package com.aboiyon.mycolletions;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyBooksArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mBooks;
    private String[] mUses;

    public  MyBooksArrayAdapter(Context mContext, int  resource, String[] mBooks, String[] mUses){
        super(mContext, resource);
        this.mContext = mContext;
        this.mBooks = mBooks;
        this.mUses = mUses;
    }

    @Override
    public Object getItem(int position){
        String book = mBooks[position];
        String use = mUses[position];
        return String.format("%s \nIs good for: %s", book, use);
    }

    @Override
    public int getCount(){
        return mBooks.length;
    }
}
