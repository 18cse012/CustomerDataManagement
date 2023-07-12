package com.tarun.CustomerDataManagement.Dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private Integer StatusCode;
	private T data;
	private String message;
	private LocalDateTime timeStamp;

}
