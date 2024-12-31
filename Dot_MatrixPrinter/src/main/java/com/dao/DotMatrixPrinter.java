package com.dao;

import javax.print.*;
import javax.print.attribute.*;

import org.springframework.stereotype.Repository;

import com.config.ConnectionManager;
import com.dto.Form4_VO;
import com.utils.DeleteFiles_DAO;
import com.utils.FilePath;

import java.io.*;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class DotMatrixPrinter {

	String Fname = null;
	Form4_VO currprintVO = null;
	List<Form4_VO> al = new ArrayList<>();
	int rowCount = 0;

	// Initialize a StringBuilder to collect multiple copies of printData
	StringBuilder multipleData = new StringBuilder();

	// Method to generate the print data and save it to a file
	public StringBuilder getPrintData(List<Form4_VO> al, int rowCount) throws IOException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		int areaWidth = 35; // Define the width of the area

		System.out.println(rowCount);
		for (int i = 0; i < rowCount; i++) {


			Form4_VO printVO = new Form4_VO();

			String fromAddress = al.get(i).getSenderName() + " " + al.get(i).getSenderAddress() + " "
					+ al.get(i).getSenderNumber();
			String toAddress = al.get(i).getReceiverName() + " " + al.get(i).getReceiverAddress() + " "
					+ al.get(i).getReceiverNumber();

			// Split address1 by length of 20 chars
			String[] fromAddressArray = IntStream.iterate(0, z -> z + 35)
					.limit((int) Math.ceil(fromAddress.length() / 35.0))
					.mapToObj(z -> fromAddress.substring(z, Math.min(z + 35, fromAddress.length())))
					.toArray(String[]::new);

			// Split address2 by length of 20 chars
			String[] toAddressArray = IntStream.iterate(0, z -> z + 35)
					.limit((int) Math.ceil(toAddress.length() / 35.0))
					.mapToObj(z -> toAddress.substring(z, Math.min(z + 35, toAddress.length()))).toArray(String[]::new);


			String printData = """
					                                              {0}


					                                                 {1}                    {2}


					         {3}



					""";

			

			Object[] arguments = { al.get(i).getInvoiceDate().substring(0, 10), "QTY:" + al.get(i).getTotalCarton(),
					al.get(i).getServiceType(), al.get(i).getTransitTypeName(), al.get(i).getSenderName(),
					al.get(i).getReceiverName(), al.get(i).getSenderAddress(), al.get(i).getReceiverAddress(),
					al.get(i).getSenderNumber(), al.get(i).getReceiverNumber(), };


			String formattedData = MessageFormat.format(printData, arguments);
			multipleData.append(formattedData);
			multipleData.append(String.format("%15s%-43s%-40s%n", " ", al.get(i).getSenderName(), al.get(i).getReceiverName()));
			multipleData.append(String.format("%15s%-43s%-40s%n", " ", al.get(i).getSenderAddress(),al.get(i).getReceiverAddress()));
			multipleData.append(String.format("%15s%-43s%-40s%n%n%n", " ", al.get(i).getSenderNumber(),al.get(i).getReceiverNumber()));

			// Optional: Add spacing between entries
			multipleData.append("\n\n\n\n\n\n\n\n\n"); // Add extra spacing between copies

		}

		// Write the combined data to output.txt
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddhmmss");
		String filename = (sdf.format(new Timestamp(date.getTime())));
		Fname = "ST_" + filename + ".txt";
		FilePath filepath = new FilePath();
		String path = filepath.getFilePath();
		System.out.println("mypath--->" + path);
		FileWriter fw = new FileWriter(path + Fname);
		fw.write(multipleData.toString());

		System.out.println("Data written to output.txt:");
	//	System.out.println(multipleData);

		fw.close();

		printGeneratedFile(Fname);

		return multipleData;
	}

	public void printGeneratedFile(String Fname) {

		FilePath filepath = new FilePath();
		String path = filepath.getFilePath();
		// String filePath = "./output.txt";
		File filePath = new File(path + Fname);

		if (!filePath.exists()) {
			System.err.println("File does not exist: " + filePath);
			return;
		}

		try (FileInputStream fis = new FileInputStream(filePath)) {
			PrintService defaultPrinter = PrintServiceLookup.lookupDefaultPrintService();
			if (defaultPrinter == null) {
				System.err.println("No default printer found.");
				return;
			}

			DocPrintJob printJob = defaultPrinter.createPrintJob();
			Doc document = new SimpleDoc(fis, DocFlavor.INPUT_STREAM.AUTOSENSE, null);
			PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();

			printJob.print(document, attributes);
			System.out.println("Printing completed successfully on: " + defaultPrinter.getName());
		} catch (Exception e) {
			System.err.println("Error during printing: " + e.getMessage());
		}
		PrintService defaultPrinter = PrintServiceLookup.lookupDefaultPrintService();
		if (defaultPrinter != null) {
			System.out.println("Default printer detected: " + defaultPrinter.getName());
		} else {
			System.err.println("No default printer found.");
		}

	}

	public String generate_ST_Data_Print(Form4_VO printVO) throws IOException, Exception {

		DeleteFiles_DAO dt = new DeleteFiles_DAO();
		dt.deleteAllFiles();
		
		Connection con = null;
		String filePath = null;
		PreparedStatement prest = null;
		ResultSet rs = null;
		String storeProcedure = "";
		PreparedStatement prest1 = null;
		ResultSet rs1 = null;
		String storeProcedure1 = "";
		PreparedStatement prest2 = null;
		ResultSet rs2 = null;
		String storeProcedure2 = "";
		Form4_VO currprintVO = null;
		int rowCount = 0;
		if (con == null) {
			con = ConnectionManager.getConnection();
		}
		storeProcedure2 = "{call SP_Report_get_bulk_invoice_all_filter('" + printVO.getFrom_Awb() + "','"
				+ printVO.getTo_Awb() + "','" + printVO.getAwb_type() + "','" + printVO.getFromDate() + "','"
				+ printVO.getToDate() + "','" + printVO.getClient_id() + "')}";
		prest2 = con.prepareStatement(storeProcedure2);
		rs2 = prest2.executeQuery();
		System.out.println("ST_Courier_pod_Copy" + prest2.toString());
		while (rs2.next()) {
			rowCount++;
			printVO.setInv_no(rs2.getString(1));
		}

		try {

			storeProcedure1 = "{call SP_Report_get_bulk_invoice_all_filter('" + printVO.getFrom_Awb() + "','"
					+ printVO.getTo_Awb() + "','" + printVO.getAwb_type() + "','" + printVO.getFromDate() + "','"
					+ printVO.getToDate() + "','" + printVO.getClient_id() + "')}";
			prest1 = con.prepareStatement(storeProcedure1);
			rs1 = prest1.executeQuery();
			System.out.println("data--->" + printVO.getFromDate());
			System.out.println("ST_Courier_pod_Copy" + prest1.toString());
			while (rs1.next()) {

				printVO.setInv_no(rs1.getString(1));

				storeProcedure = "{call commercial_SP_Ds_Report_AWB_Booking_bulk('" + printVO.getFromDate() + "','"
						+ printVO.getToDate() + "','" + printVO.getInv_no() + "','" + printVO.getInv_no() + "','"
						+ printVO.getClient_id() + "','" + printVO.getAwb_type() + "')}";
				prest = con.prepareStatement(storeProcedure);
				rs = prest.executeQuery();

				System.out.println("ST_Courier_pod_Copy" + prest.toString());

				while (rs.next()) {
					currprintVO = new Form4_VO();

					currprintVO.setInvoiceNumber(rs.getString(1));
					currprintVO.setSenderName(rs.getString(2));
					if (rs.getString(3) != null) {
						currprintVO.setSenderAddress(rs.getString(55)); // 3
					} else {
						currprintVO.setSenderAddress("");
					}
					currprintVO.setSenderPhone(rs.getString(4));
					currprintVO.setReceiverName(rs.getString(5).trim());

					currprintVO.setReceiverAddress(rs.getString(56).trim()); // 6
					currprintVO.setReceiverPhone(rs.getString(7));
					currprintVO.setInvoiceValue(rs.getDouble(8));
					currprintVO.setTotalCarton(rs.getInt(9));
					currprintVO.setTotalWeight(rs.getDouble(10));
					currprintVO.setInvoiceDate(rs.getString(11));
					currprintVO.setServiceType(rs.getString(12));

					if (currprintVO.getServiceType().equalsIgnoreCase("NON_DOCUMENTS")) {
						currprintVO.setServiceType("NON DOX");
					}
					if (currprintVO.getServiceType().equalsIgnoreCase("DOCUMENTS")) {
						currprintVO.setServiceType("DOX");
					}

					currprintVO.setFrieghtCharge(rs.getString(13));
					currprintVO.setDutiesTax(rs.getString(14));
					currprintVO.setTransitTypeName(rs.getString(15));
					currprintVO.setOriginName(rs.getString(16));
					currprintVO.setDeliveryLocationName(rs.getString(17));
					currprintVO.setItemTypeName(rs.getString(18));
					currprintVO.setDeliveryStateId(rs.getInt(19));
					currprintVO.setWeightCharge(rs.getString(20));
					currprintVO.setBillCharge(rs.getString(21));
					currprintVO.setExtraCharge(rs.getDouble(22));
					currprintVO.setNetAmount(rs.getDouble(23));
					currprintVO.setVolWeight(rs.getFloat(26));
					// System.out.println("VolWeight" +rs.getFloat(26));
					currprintVO.setPaymentStatus(rs.getString(27));
					currprintVO.setSenderMobile(rs.getString(28));
					currprintVO.setReceiverMobile(rs.getString(29));
					currprintVO.setReceiverPin(rs.getString(30));
					currprintVO.setOdaAmount(rs.getString(33));
					currprintVO.setRefNo(rs.getString(34));
					currprintVO.setPaymentMode(rs.getString(35));
					currprintVO.setOrgName(rs.getString(36));
					currprintVO.setOrgAddress(rs.getString(37));
					currprintVO.setLogo(rs.getBytes(38));
					currprintVO.setIns(rs.getString(39));
					currprintVO.setOther_charges(rs.getString(40));
					currprintVO.setTotalDuty1(rs.getString(41));
					// System.out.println("hai" +rs.getString(41));
					currprintVO.setTotalVolWeight(rs.getDouble(42));
					// System.out.println("TotalVolWeight" +rs.getDouble(42));
					currprintVO.setUserName(rs.getString(43));
					currprintVO.setHawbNo(rs.getString(44));
					currprintVO.setEwayBillNo(rs.getString(45));
					currprintVO.setDnNo(rs.getString(46));
					currprintVO.setConsoleNo(rs.getString(47));
					currprintVO.setRemarks(rs.getString(48));
					currprintVO.setDeliveryType(rs.getString(49));
					currprintVO.setGstNo(rs.getString(50));
					if (String.valueOf(rs.getInt(51)) != null) {
						currprintVO.setTotalBag(rs.getInt(51));
					} else {
						currprintVO.setTotalBag(0);
					}
					if (String.valueOf(rs.getInt(52)) != null) {
						currprintVO.setTotalBox(rs.getInt(52));
					} else {
						currprintVO.setTotalBox(0);
					}
					if (rs.getString(54) != null) {
						currprintVO.setWeight_to_be(rs.getString(54));
					} else {
						currprintVO.setWeight_to_be("");
					}
					currprintVO.setShipping_inv_no1(rs.getString(57));
					currprintVO.setShipping_inv_no2(rs.getString(58));

					if (currprintVO.getSenderPhone() == null || currprintVO.getSenderPhone().equals("")
							|| currprintVO.getSenderPhone().equals(" ")) {
						currprintVO.setSenderNumber(currprintVO.getSenderMobile());
					} else {
						currprintVO.setSenderNumber(currprintVO.getSenderPhone());
					}

					if (currprintVO.getReceiverPhone() == null || currprintVO.getReceiverPhone().equals("")
							|| currprintVO.getReceiverPhone().equals(" ")) {
						currprintVO.setReceiverNumber(currprintVO.getReceiverMobile().trim());
					} else {
						currprintVO.setReceiverNumber(currprintVO.getReceiverPhone().trim());
					}

					currprintVO.setSpace(" ");

					al.add(currprintVO);

				}
			}

			getPrintData(al, rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (rs != null) {
					rs.close();
				}
				if (prest != null) {
					prest.close();
				}
				if (rs1 != null) {
					rs1.close();
				}
				if (prest1 != null) {
					prest1.close();
				}
				if (rs2 != null) {
					rs2.close();
				}
				if (prest2 != null) {
					prest2.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return Fname;

	}

}
