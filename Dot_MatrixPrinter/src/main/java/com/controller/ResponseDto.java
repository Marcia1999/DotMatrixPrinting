package com.controller;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name="error")
public class ResponseDto {
        
	
	  public ResponseDto(String message, List<String> details) {
		   super();
		   this.message = message;
		   this.description = details;
	  }
	  
	  @JsonProperty("messageCode")
	  private String message;
	  
	  @JsonProperty("message")
	  private List<String> description;
}
