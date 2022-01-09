package com.example.projecturlshortner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projecturlshortner.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {

	public Url findByShortUrl(String shortUrl);
	
}
