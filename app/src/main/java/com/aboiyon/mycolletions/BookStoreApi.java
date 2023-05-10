package com.aboiyon.mycolletions;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BookStoreApi {
    @GET ("search/{query}")
    Call<BookStoreSearchResponse> searchBooks( @Path("query") String query);
    @GET("new")
    Call<BookStoreSearchResponse> getNewBooks();
    @GET("books/{category}/{page}")
    Call<BookStoreSearchResponse> getBooksByCategory(
            @Path("category") String category,
            @Path("page") int page);
}
