package com.example.projecturlshortner.model;

public class UrlDto {
	
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public UrlDto(String url) {
		super();
		this.url = url;
	}
	
	public UrlDto()
	{
		
	}

	@Override
	public String toString() {
		return "UrlDto [url=" + url + "]";
	}
	
	
	

}
