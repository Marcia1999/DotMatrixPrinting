package com.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.dto.Form4_VO;

@Service
public interface DotMatrixPrinterService {
	
	public String generate_ST_Data_Print(Form4_VO printVO) throws IOException, Exception ;

}
