package com.example.projecturlshortner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.projecturlshortner.model.Url;
import com.example.projecturlshortner.model.UrlDto;
import com.example.projecturlshortner.repository.UrlRepository;
import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

@Component
public class UrlServiceImpl implements UrlService {
	
	
	@Autowired
	private UrlRepository urlRepository;

	@Override
	public Url createShorturl(UrlDto urlDto) {
		// TODO Auto-generated method stub
		
		String encodedUrl = encodeUrl(urlDto.getUrl());
		
		Url urlToPersist = new Url(urlDto.getUrl(), encodedUrl);
		
	
		Url urlToRet = persistShortUrl(urlToPersist);
		
		return urlToRet!=null?urlToRet:null;
	}

	private String encodeUrl(String url) {
		// TODO Auto-generated method stub
		
		String encodedUrl = "";
		
		encodedUrl = Hashing.murmur3_32_fixed()
				.hashString(encodedUrl, Charsets.UTF_8).toString(); 
		
		return encodedUrl;
	}

	@Override
	public Url persistShortUrl(Url url) {
		// TODO Auto-generated method stub
		
		Url urlReturn = urlRepository.save(url);
		
		return urlReturn;
	}

	@Override
	public Url getEncodedUrl(String url) {
		
		Url urlReturn = urlRepository.findByShortUrl(url);
		
		return urlReturn;
		
		
	}

}
