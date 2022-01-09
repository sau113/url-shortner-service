package com.example.projecturlshortner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Url {

	@Id
	@GeneratedValue
	private long id;
	
	@Lob
	private String originalUrl;
	
	private String shortUrl;

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getShortUrl() {
		return shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}

	public Url(String originalUrl, String shortUrl) {
		super();
		this.originalUrl = originalUrl;
		this.shortUrl = shortUrl;
	}
	
	public Url()
	{
		
	}

	@Override
	public String toString() {
		return "Url [id=" + id + ", originalUrl=" + originalUrl + ", shortUrl=" + shortUrl + "]";
	}
	
	
	
}
