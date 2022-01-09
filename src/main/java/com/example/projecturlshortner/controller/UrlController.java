package com.example.projecturlshortner.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projecturlshortner.model.Url;
import com.example.projecturlshortner.model.UrlDto;
import com.example.projecturlshortner.model.UrlResponse;
import com.example.projecturlshortner.service.UrlService;

@RestController
public class UrlController {

	@Autowired
	private UrlService urlService;
	
	@PostMapping("/generate")
	public ResponseEntity<?> generateShortUrl(@RequestBody UrlDto urlDto)
	{
		Url urlReturn = urlService.createShorturl(urlDto);
		
		if(urlReturn != null)
		{
			UrlResponse urlResponse = new UrlResponse(urlReturn.getOriginalUrl(), urlReturn.getShortUrl());
			return new ResponseEntity<UrlResponse>(urlResponse, HttpStatus.OK);	
		}
		
		return null;
		
		
		
	}
	
	@GetMapping("/{shortUrl}")
	public ResponseEntity<Void> redirectUrl(@PathVariable String shortUrl)
	{
		Url urlToRedirect = urlService.getEncodedUrl(shortUrl);
		
		return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(urlToRedirect.getOriginalUrl())).build();
	}
}
