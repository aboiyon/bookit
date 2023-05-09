package com.aboiyon.mycolletions;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookStoreApi {
    @GET ("search")
    Call<BookStoreSearchResponse> getBooks(
            @Query("book") String book
    );
}
