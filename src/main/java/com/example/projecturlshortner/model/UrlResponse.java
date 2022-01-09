package com.example.projecturlshortner.model;

public class UrlResponse {
	
	private String originalUrl;
	
	private String shortUrl;

	public UrlResponse(String originalUrl, String shortUrl) {
		super();
		this.originalUrl = originalUrl;
		this.shortUrl = shortUrl;
	}
	
	public UrlResponse()
	{
		
	}

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

	@Override
	public String toString() {
		return "UrlResponse [originalUrl=" + originalUrl + ", shortUrl=" + shortUrl + "]";
	}
	
	

}
