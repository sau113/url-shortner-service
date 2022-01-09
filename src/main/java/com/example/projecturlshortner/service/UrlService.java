package com.example.projecturlshortner.service;

import org.springframework.stereotype.Service;

import com.example.projecturlshortner.model.Url;
import com.example.projecturlshortner.model.UrlDto;

@Service
public interface UrlService {
	
	public Url createShorturl(UrlDto urlDto);
	
	public Url persistShortUrl(Url url);
	
	public Url getEncodedUrl(String url);

}
