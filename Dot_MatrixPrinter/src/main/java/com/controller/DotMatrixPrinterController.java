package com.controller;

import com.dao.DotMatrixPrinter;
import com.dto.Form4_VO;
import com.service.DotMatrixPrinterService;

import java.io.IOException;
import java.util.Arrays;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


//@RequestMapping("/api/printer")
@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping(value = "/balaji/sit/private/v1/report", produces = { MediaType.APPLICATION_JSON_VALUE })
@Validated
public class DotMatrixPrinterController {
	
	@Autowired
	private DotMatrixPrinterService ser;
	private static final Logger log = LogManager.getLogger(DotMatrixPrinterController.class);

  /*  @PostMapping("/printInvoice")
    public String printInvoice() {
        DotMatrixPrinter printer = new DotMatrixPrinter();

        try {
            System.out.println("Starting the print process...");
            printer.getPrintData();
            System.out.println("Printing completed.");
            return "Printing completed successfully.";
        } catch (Exception e) {
            System.err.println("An error occurred during printing: " + e.getMessage());
            e.printStackTrace();
            return "Error occurred during printing: " + e.getMessage();
        }
    } */
    
    @PostMapping("/generate_ST_Data_Print")
	public ResponseEntity<ResponseDto> generate_ST_Data_Print(@RequestBody Form4_VO printVO)
			throws IOException, Exception {
		ResponseEntity<ResponseDto> servResponse = null;
		ResponseDto response = null;
		try {
			log.info("ST_Courier_pod_Copy-controller => begaine");
			response = new ResponseDto("0000", Arrays.asList(ser.generate_ST_Data_Print(printVO)));
			servResponse = new ResponseEntity<ResponseDto>(response, HttpStatus.OK);
			log.info("ST_Courier_pod_Copy-controller => After");
		} catch (RuntimeException e) {
			System.out.println("ST_Courier_pod_Copy-Controller() Error Message=> " + e.getMessage());
			response = new ResponseDto("1111", Arrays.asList(e.getMessage()));
			servResponse = new ResponseEntity<ResponseDto>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return servResponse;
	}

}
