package com.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.DotMatrixPrinter;
import com.dto.Form4_VO;
import com.service.DotMatrixPrinterService;

@Component
public class DotMatrixPrinterServiceImpl implements DotMatrixPrinterService {
	
	@Autowired
	private DotMatrixPrinter dmp;
	public String generate_ST_Data_Print(Form4_VO printVO) throws IOException, Exception {
		return dmp.generate_ST_Data_Print(printVO);
	}

}
