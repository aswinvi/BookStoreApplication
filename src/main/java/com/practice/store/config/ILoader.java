package com.practice.store.config;

import java.util.Optional;

import com.practice.store.exception.BookStoreIOException;
import com.practice.store.model.BookStore;

public interface ILoader {

	public boolean load() throws BookStoreIOException;

	public boolean isConfigLoaded();

	public Optional<BookStore> getBookStore();
}
