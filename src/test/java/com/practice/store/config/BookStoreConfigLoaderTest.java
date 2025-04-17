package com.practice.store.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.practice.store.exception.BookStoreIOException;

	class BookStoreConfigLoaderTest {

	    @Test
	    void shouldReturnTrueIfBooksAreLoadedSuccessfully() throws BookStoreIOException {
	    	
	    	BookStoreConfigLoader configLoader = new BookStoreConfigLoader();
	    	
	    	configLoader.initialize();

	        Assertions.assertTrue(configLoader.isConfigLoaded());
	    }

	    @Test
	    void shouldThrowExceptionIfLoadFailure() {
	    	
	    	BookStoreConfigLoader configLoader = new BookStoreConfigLoader();
	    	
            ReflectionTestUtils.setField(configLoader, "filePath", "./BookShel.json");

	        Assertions.assertThrows(BookStoreIOException.class, configLoader::load);
	    }
	}

