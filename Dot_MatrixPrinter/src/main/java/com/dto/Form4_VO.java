package com.dto;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Form4_VO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3386903205542283524L;

	private String manifestNo;
	private String printer_name;
	private String filename;
	private String department_name;
	private String no_of_package;
	private String FileCode;
	private String FileName;
	private String consignee_name_address;
	private String weight;
	private String invoice_no;
	private String invoice_value;
	private String clearanceOrgAddress;
	private String clearanceOrgName;
	private String duty;
	private int slno;
	private String ceth_no;
	private String flagid;
	private int flagVary;
	private String customPointCode;
	private String mawb;
	private String transitDate;
	private String originCode;
	private String consignor_name_address;

	private String rate_of_exchange;
	private String value_rs;
	private String shipper;
	private String delivery_state_name;
	private String item_details;
	private String from_Awb;
	private String to_Awb;
	private String valueUnder;
	private String additionalDutyRate;
	private String additionalDutyAmt;
	private String GSTCode;
	private String GSTRate;
	private String IGSTExemptipn;
	private String IGSTAmt;
	private String socialwalfare;
	private String socialwalfare1;
	private String receiver_company_name;
	private String  receiver_department;
	private String frtIns;
	private String ins;
	private String others;
	private String landingCharges;
	private String assableValue;
	private String CTH_Notification_no;
	private String exempNotDate;
	private String cusDutyRate;
	private String cusDutyBCDAmt;
	private String ETH_Notification_No;
	private String TotalDuty1;
	private String GSTConsNotification_No;
	private String other_charges;

	private String GSTIN_No;
	private String currencyCode;

	private String document_type;

	private String qty;
	private String uom;
	private String ind_val;
	private String freight;
	private String insurance;
	private String swsCharge;
	private String swsName;
	private String weight_to_be;
	private String invoiceNumber;
	private String senderName;
	private String senderAddress;
	private String senderPhone;
	private String receiverName;
	private String receiverPhone;
	private String receiverAddress;
	private String invoiceDate;
	private double invoiceValue;
	private String senderNumber;
	private String receiverNumber;

	private int totalCarton;
	private double totalWeight;
	private String serviceType;
	private String frieghtCharge;
	private String dutiesTax;

	private String transitTypeName;
	private String originName;
	private String deliveryLocationName;
	private String itemTypeName;
	private int deliveryStateId;
	private String weightCharge;
	private String billCharge;
	private double extraCharge;
	private double netAmount;
	private String odaAmount;
	private double totalVolWeight;

	private String paymentStatus;
	private String senderMobile;
	private String receiverMobile;
	private String receiverPin;
	private double volWeight;

	private double volLenght;
	private double volHeight;
	private double volWidth;
	private int totalvolPcs;

	private String senderPin;
	private String freightBillTo;

	private String deliveryName;
	private String deliveryAddress;
	private String deliveryPincode;
	private String deliveryMobile;
	private String greentax;
	private String matha;
	private String Destination;
	private String flag1;
	private String flag2;
	private String flag3;
	private String fsc_Charge;

	private String chargeable_weight;

	private String rcs;
	private String amount;
	private int serial;

	private byte logo[];
	private int orgId;

	private String contactPerson;
	private String senderEmailId;

	private String mailSubject;
	private String senderMailId;
	private String cc_receivermail_id;
	private String senderMailPassword;

	private String receiverMailId;
	private String fileLocation;
	private String attachmentName;
	private String text;

	private String refNo;
	private String recContPerson;

	private int originId;
	private int clientId;
	private int limit;
	private String paymentMode;

	private String orgAddress;
	private String orgName;
	private String userName;
	private String organizationName;
	private int organizationId;
	private String mobileNo;
	private String hawbNo;
	private String ewayBillNo;
	private String dnNo;
	private String consoleNo;
	private String remarks;
	private String deliveryType;
	private String gstNo;
	private String particulars;

	private String awb_type;

	private String shipping_inv_no1;
	private String shipping_inv_no2;
	private String fromDate;
	private String toDate;
	private String awbtype;

	private String billNo;
	private String total_weight;
	private String fsc;
	private String totalAmount;
	private int customerId;
	private String clientName;
	private String clientCode;
	private String address;
	private String stateName;
	private String customerState;

	private String igst;
	private String cgst;
	private String sgst;
	private String documentType;
	private String invoiceNo;

	private String billingChargeName;
	private String unitBasedAmount;
	private int totalCount;
	private String ess;
	private String Date;
	private String BillingCharge;

	private String totalCharge;

	private String billingChargeName1;
	private String unitBasedAmount1;
	private int totalCount1;

	private String billingChargeName2;

	private String date;
	private String otherCharge;
	private String charge;
	private String from_date;
	private String to_date;

	private String voicherNo;

	private String billno;
	private String awb_no;
	private String carton_no;
	private String description_goods;
	private String bill_from_date;
	private String bill_to_date;

	private String bank_name;
	private String branch_name;
	private String ifsc_code;
	private String account_no;
	private String pan_no;
	private String sac_code;

	
	
	private String hawb_no;
	
	private String fromdate;
	private String todate;
	
	private String branch_id;
	private String client_id;
	private String destination_id;
	private String transitType_id;
	private String doc_type;
	private String payment_mode;   
	private String	location;            
	
	private String	docket_no;  
	private String	docket_date;
	private String reference_no;   
	private String reciver_city;              
	private String	pincode;  
	private String	status;  
	private String	reason;  
	private String  mode;   
	private String  r_date;   
	private String  staff_name;
	private String space;
	
	
	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}

	public String getGreentax() {
		return greentax;
	}

	public void setGreentax(String greentax) {
		this.greentax = greentax;
	}

	public String getMatha() {
		return matha;
	}

	public void setMatha(String matha) {
		this.matha = matha;
	}

	public String getFsc_Charge() {
		return fsc_Charge;
	}

	public void setFsc_Charge(String fsc_Charge) {
		this.fsc_Charge = fsc_Charge;
	}

	public String getChargeable_weight() {
		return chargeable_weight;
	}

	public void setChargeable_weight(String chargeable_weight) {
		this.chargeable_weight = chargeable_weight;
	}

	public String getRcs() {
		return rcs;
	}

	public void setRcs(String rcs) {
		this.rcs = rcs;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getTotal_weight() {
		return total_weight;
	}

	public void setTotal_weight(String total_weight) {
		this.total_weight = total_weight;
	}

	public String getFsc() {
		return fsc;
	}

	public void setFsc(String fsc) {
		this.fsc = fsc;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getIgst() {
		return igst;
	}

	public void setIgst(String igst) {
		this.igst = igst;
	}

	public String getCgst() {
		return cgst;
	}

	public void setCgst(String cgst) {
		this.cgst = cgst;
	}

	public String getSgst() {
		return sgst;
	}

	public void setSgst(String sgst) {
		this.sgst = sgst;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getBillingChargeName() {
		return billingChargeName;
	}

	public void setBillingChargeName(String billingChargeName) {
		this.billingChargeName = billingChargeName;
	}

	public String getUnitBasedAmount() {
		return unitBasedAmount;
	}

	public void setUnitBasedAmount(String unitBasedAmount) {
		this.unitBasedAmount = unitBasedAmount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getEss() {
		return ess;
	}

	public void setEss(String ess) {
		this.ess = ess;
	}

	public String getBillingCharge() {
		return BillingCharge;
	}

	public void setBillingCharge(String billingCharge) {
		BillingCharge = billingCharge;
	}

	public String getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(String totalCharge) {
		this.totalCharge = totalCharge;
	}

	public String getBillingChargeName1() {
		return billingChargeName1;
	}

	public void setBillingChargeName1(String billingChargeName1) {
		this.billingChargeName1 = billingChargeName1;
	}

	public String getUnitBasedAmount1() {
		return unitBasedAmount1;
	}

	public void setUnitBasedAmount1(String unitBasedAmount1) {
		this.unitBasedAmount1 = unitBasedAmount1;
	}

	public int getTotalCount1() {
		return totalCount1;
	}

	public void setTotalCount1(int totalCount1) {
		this.totalCount1 = totalCount1;
	}

	public String getBillingChargeName2() {
		return billingChargeName2;
	}

	public void setBillingChargeName2(String billingChargeName2) {
		this.billingChargeName2 = billingChargeName2;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOtherCharge() {
		return otherCharge;
	}

	public void setOtherCharge(String otherCharge) {
		this.otherCharge = otherCharge;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getVoicherNo() {
		return voicherNo;
	}

	public void setVoicherNo(String voicherNo) {
		this.voicherNo = voicherNo;
	}

	public String getParticulars() {
		return particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	public String getHawbNo() {
		return hawbNo;
	}

	public void setHawbNo(String hawbNo) {
		this.hawbNo = hawbNo;
	}

	public String getEwayBillNo() {
		return ewayBillNo;
	}

	public void setEwayBillNo(String ewayBillNo) {
		this.ewayBillNo = ewayBillNo;
	}

	public String getDnNo() {
		return dnNo;
	}

	public void setDnNo(String dnNo) {
		this.dnNo = dnNo;
	}

	public String getConsoleNo() {
		return consoleNo;
	}

	public void setConsoleNo(String consoleNo) {
		this.consoleNo = consoleNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getWeightCharge() {
		return weightCharge;
	}

	public void setWeightCharge(String weightCharge) {
		this.weightCharge = weightCharge;
	}

	public String getBillCharge() {
		return billCharge;
	}

	public void setBillCharge(String billCharge) {
		this.billCharge = billCharge;
	}

	public String getOdaAmount() {
		return odaAmount;
	}

	public void setOdaAmount(String odaAmount) {
		this.odaAmount = odaAmount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOther_charges() {
		return other_charges;
	}

	public void setOther_charges(String other_charges) {
		this.other_charges = other_charges;
	}

	public String getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getFlagVary() {
		return flagVary;
	}

	public void setFlagVary(int flagVary) {
		this.flagVary = flagVary;
	}

	public int getOriginId() {
		return originId;
	}

	public void setOriginId(int originId) {
		this.originId = originId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRecContPerson() {
		return recContPerson;
	}

	public void setRecContPerson(String recContPerson) {
		this.recContPerson = recContPerson;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getSenderEmailId() {
		return senderEmailId;
	}

	public void setSenderEmailId(String senderEmailId) {
		this.senderEmailId = senderEmailId;
	}

	public String getMailSubject() {
		return mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public String getSenderMailId() {
		return senderMailId;
	}

	public void setSenderMailId(String senderMailId) {
		this.senderMailId = senderMailId;
	}

	public String getCc_receivermail_id() {
		return cc_receivermail_id;
	}

	public void setCc_receivermail_id(String cc_receivermail_id) {
		this.cc_receivermail_id = cc_receivermail_id;
	}

	public String getSenderMailPassword() {
		return senderMailPassword;
	}

	public void setSenderMailPassword(String senderMailPassword) {
		this.senderMailPassword = senderMailPassword;
	}

	public String getReceiverMailId() {
		return receiverMailId;
	}

	public void setReceiverMailId(String receiverMailId) {
		this.receiverMailId = receiverMailId;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getDeliveryName() {
		return deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeliveryPincode() {
		return deliveryPincode;
	}

	public void setDeliveryPincode(String deliveryPincode) {
		this.deliveryPincode = deliveryPincode;
	}

	public String getDeliveryMobile() {
		return deliveryMobile;
	}

	public void setDeliveryMobile(String deliveryMobile) {
		this.deliveryMobile = deliveryMobile;
	}

	public String getSenderPin() {
		return senderPin;
	}

	public void setSenderPin(String senderPin) {
		this.senderPin = senderPin;
	}

	public String getFreightBillTo() {
		return freightBillTo;
	}

	public void setFreightBillTo(String freightBillTo) {
		this.freightBillTo = freightBillTo;
	}

	public double getVolLenght() {
		return volLenght;
	}

	public void setVolLenght(double volLenght) {
		this.volLenght = volLenght;
	}

	public double getVolHeight() {
		return volHeight;
	}

	public void setVolHeight(double volHeight) {
		this.volHeight = volHeight;
	}

	public double getVolWidth() {
		return volWidth;
	}

	public void setVolWidth(double volWidth) {
		this.volWidth = volWidth;
	}

	public int getTotalvolPcs() {
		return totalvolPcs;
	}

	public void setTotalvolPcs(int totalvolPcs) {
		this.totalvolPcs = totalvolPcs;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getSenderMobile() {
		return senderMobile;
	}

	public void setSenderMobile(String senderMobile) {
		this.senderMobile = senderMobile;
	}

	public String getReceiverMobile() {
		return receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverPin() {
		return receiverPin;
	}

	public void setReceiverPin(String receiverPin) {
		this.receiverPin = receiverPin;
	}

	public double getVolWeight() {
		return volWeight;
	}

	public void setVolWeight(double volWeight) {
		this.volWeight = volWeight;
	}

	public double getTotalVolWeight() {
		return totalVolWeight;
	}

	public void setTotalVolWeight(double totalVolWeight) {
		this.totalVolWeight = totalVolWeight;
	}

	public String getTransitTypeName() {
		return transitTypeName;
	}

	public void setTransitTypeName(String transitTypeName) {
		this.transitTypeName = transitTypeName;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getDeliveryLocationName() {
		return deliveryLocationName;
	}

	public void setDeliveryLocationName(String deliveryLocationName) {
		this.deliveryLocationName = deliveryLocationName;
	}

	public String getItemTypeName() {
		return itemTypeName;
	}

	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}

	public int getDeliveryStateId() {
		return deliveryStateId;
	}

	public void setDeliveryStateId(int deliveryStateId) {
		this.deliveryStateId = deliveryStateId;
	}

	public double getExtraCharge() {
		return extraCharge;
	}

	public void setExtraCharge(double extraCharge) {
		this.extraCharge = extraCharge;
	}

	public double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(double netAmount) {
		this.netAmount = netAmount;
	}

	public String getSenderPhone() {
		return senderPhone;
	}

	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}

	public int getTotalCarton() {
		return totalCarton;
	}

	public void setTotalCarton(int totalCarton) {
		this.totalCarton = totalCarton;
	}

	public double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getFrieghtCharge() {
		return frieghtCharge;
	}

	public void setFrieghtCharge(String frieghtCharge) {
		this.frieghtCharge = frieghtCharge;
	}

	public String getDutiesTax() {
		return dutiesTax;
	}

	public void setDutiesTax(String dutiesTax) {
		this.dutiesTax = dutiesTax;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(double invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getInd_val() {
		return ind_val;
	}

	public void setInd_val(String ind_val) {
		this.ind_val = ind_val;
	}

	public String getFreight() {
		return freight;
	}

	public void setFreight(String freight) {
		this.freight = freight;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getSwsCharge() {
		return swsCharge;
	}

	public void setSwsCharge(String swsCharge) {
		this.swsCharge = swsCharge;
	}

	public String getSwsName() {
		return swsName;
	}

	public void setSwsName(String swsName) {
		this.swsName = swsName;
	}

	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getGSTIN_No() {
		return GSTIN_No;
	}

	public void setGSTIN_No(String gSTIN_No) {
		GSTIN_No = gSTIN_No;
	}

	public String getFrtIns() {
		return frtIns;
	}

	public void setFrtIns(String frtIns) {
		this.frtIns = frtIns;
	}

	public String getIns() {
		return ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public String getLandingCharges() {
		return landingCharges;
	}

	public void setLandingCharges(String landingCharges) {
		this.landingCharges = landingCharges;
	}

	public String getAssableValue() {
		return assableValue;
	}

	public void setAssableValue(String assableValue) {
		this.assableValue = assableValue;
	}

	public String getCTH_Notification_no() {
		return CTH_Notification_no;
	}

	public void setCTH_Notification_no(String cTH_Notification_no) {
		CTH_Notification_no = cTH_Notification_no;
	}

	public String getExempNotDate() {
		return exempNotDate;
	}

	public void setExempNotDate(String exempNotDate) {
		this.exempNotDate = exempNotDate;
	}

	public String getCusDutyRate() {
		return cusDutyRate;
	}

	public void setCusDutyRate(String cusDutyRate) {
		this.cusDutyRate = cusDutyRate;
	}

	public String getCusDutyBCDAmt() {
		return cusDutyBCDAmt;
	}

	public void setCusDutyBCDAmt(String cusDutyBCDAmt) {
		this.cusDutyBCDAmt = cusDutyBCDAmt;
	}

	public String getETH_Notification_No() {
		return ETH_Notification_No;
	}

	public void setETH_Notification_No(String eTH_Notification_No) {
		ETH_Notification_No = eTH_Notification_No;
	}

	public String getTotalDuty1() {
		return TotalDuty1;
	}

	public void setTotalDuty1(String totalDuty1) {
		TotalDuty1 = totalDuty1;
	}

	public String getGSTConsNotification_No() {
		return GSTConsNotification_No;
	}

	public void setGSTConsNotification_No(String gSTConsNotification_No) {
		GSTConsNotification_No = gSTConsNotification_No;
	}

	public String getValueUnder() {
		return valueUnder;
	}

	public void setValueUnder(String valueUnder) {
		this.valueUnder = valueUnder;
	}

	public String getAdditionalDutyRate() {
		return additionalDutyRate;
	}

	public void setAdditionalDutyRate(String additionalDutyRate) {
		this.additionalDutyRate = additionalDutyRate;
	}

	public String getAdditionalDutyAmt() {
		return additionalDutyAmt;
	}

	public void setAdditionalDutyAmt(String additionalDutyAmt) {
		this.additionalDutyAmt = additionalDutyAmt;
	}

	public String getGSTCode() {
		return GSTCode;
	}

	public void setGSTCode(String gSTCode) {
		GSTCode = gSTCode;
	}

	public String getGSTRate() {
		return GSTRate;
	}

	public void setGSTRate(String gSTRate) {
		GSTRate = gSTRate;
	}

	public String getIGSTExemptipn() {
		return IGSTExemptipn;
	}

	public void setIGSTExemptipn(String iGSTExemptipn) {
		IGSTExemptipn = iGSTExemptipn;
	}

	public String getIGSTAmt() {
		return IGSTAmt;
	}

	public void setIGSTAmt(String iGSTAmt) {
		IGSTAmt = iGSTAmt;
	}

	public String getSocialwalfare() {
		return socialwalfare;
	}

	public void setSocialwalfare(String socialwalfare) {
		this.socialwalfare = socialwalfare;
	}

	public String getSocialwalfare1() {
		return socialwalfare1;
	}

	public void setSocialwalfare1(String socialwalfare1) {
		this.socialwalfare1 = socialwalfare1;
	}

	public String getConsignor_name_address() {
		return consignor_name_address;
	}

	public void setConsignor_name_address(String consignor_name_address) {
		this.consignor_name_address = consignor_name_address;
	}

	public String getCustomPointCode() {
		return customPointCode;
	}

	public void setCustomPointCode(String customPointCode) {
		this.customPointCode = customPointCode;
	}

	public String getMawb() {
		return mawb;
	}

	public void setMawb(String mawb) {
		this.mawb = mawb;
	}

	public String getTransitDate() {
		return transitDate;
	}

	public void setTransitDate(String transitDate) {
		this.transitDate = transitDate;
	}

	public String getOriginCode() {
		return originCode;
	}

	public void setOriginCode(String originCode) {
		this.originCode = originCode;
	}

	public String getFlagid() {
		return flagid;
	}

	public void setFlagid(String flagid) {
		this.flagid = flagid;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getClearanceOrgAddress() {
		return clearanceOrgAddress;
	}

	public void setClearanceOrgAddress(String clearanceOrgAddress) {
		this.clearanceOrgAddress = clearanceOrgAddress;
	}

	public String getClearanceOrgName() {
		return clearanceOrgName;
	}

	public void setClearanceOrgName(String clearanceOrgName) {
		this.clearanceOrgName = clearanceOrgName;
	}

	public String getCeth_no() {
		return ceth_no;
	}

	public void setCeth_no(String ceth_no) {
		this.ceth_no = ceth_no;
	}

	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public String getInvoice_value() {
		return invoice_value;
	}

	public void setInvoice_value(String invoice_value) {
		this.invoice_value = invoice_value;
	}

	public String getFileCode() {
		return FileCode;
	}

	public void setFileCode(String fileCode) {
		FileCode = fileCode;
	}

	public String getNo_of_package() {
		return no_of_package;
	}

	public void setNo_of_package(String no_of_package) {
		this.no_of_package = no_of_package;
	}

	public String getConsignee_name_address() {
		return consignee_name_address;
	}

	public void setConsignee_name_address(String consignee_name_address) {
		this.consignee_name_address = consignee_name_address;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public String getRate_of_exchange() {
		return rate_of_exchange;
	}

	public void setRate_of_exchange(String rate_of_exchange) {
		this.rate_of_exchange = rate_of_exchange;
	}

	public String getValue_rs() {
		return value_rs;
	}

	public void setValue_rs(String value_rs) {
		this.value_rs = value_rs;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getDelivery_state_name() {
		return delivery_state_name;
	}

	public void setDelivery_state_name(String delivery_state_name) {
		this.delivery_state_name = delivery_state_name;
	}

	public String getItem_details() {
		return item_details;
	}

	public void setItem_details(String item_details) {
		this.item_details = item_details;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getManifestNo() {
		return manifestNo;
	}

	public void setManifestNo(String manifestNo) {
		this.manifestNo = manifestNo;
	}

	public boolean isFlag() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	private int totalBag;
	private int totalBox;

	public String getPrinter_name() {
		return printer_name;
	}

	public void setPrinter_name(String printer_name) {
		this.printer_name = printer_name;
	}

	public int getTotalBag() {
		return totalBag;
	}

	public void setTotalBag(int totalBag) {
		this.totalBag = totalBag;
	}

	public int getTotalBox() {
		return totalBox;
	}

	public void setTotalBox(int totalBox) {
		this.totalBox = totalBox;
	}

	private String purchased;
	private String opening;
	private String booked;
	private String clos_stock;

	private String client_name;
	private String flag;

	public String getPurchased() {
		return purchased;
	}

	public void setPurchased(String purchased) {
		this.purchased = purchased;
	}

	public String getOpening() {
		return opening;
	}

	public void setOpening(String opening) {
		this.opening = opening;
	}

	public String getBooked() {
		return booked;
	}

	public void setBooked(String booked) {
		this.booked = booked;
	}

	public String getClos_stock() {
		return clos_stock;
	}

	public void setClos_stock(String clos_stock) {
		this.clos_stock = clos_stock;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getAwb_type() {
		return awb_type;
	}

	public void setAwb_type(String awb_type) {
		this.awb_type = awb_type;
	}

	public String getWeight_to_be() {
		return weight_to_be;
	}

	public void setWeight_to_be(String weight_to_be) {
		this.weight_to_be = weight_to_be;
	}

	public String getShipping_inv_no1() {
		return shipping_inv_no1;
	}

	public void setShipping_inv_no1(String shipping_inv_no1) {
		this.shipping_inv_no1 = shipping_inv_no1;
	}

	public String getShipping_inv_no2() {
		return shipping_inv_no2;
	}

	public void setShipping_inv_no2(String shipping_inv_no2) {
		this.shipping_inv_no2 = shipping_inv_no2;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getAwbtype() {
		return awbtype;
	}

	public void setAwbtype(String awbtype) {
		this.awbtype = awbtype;
	}

	private String inv_no;

	public String getInv_no() {
		return inv_no;
	}

	public void setInv_no(String inv_no) {
		this.inv_no = inv_no;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getBillno() {
		return billno;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}

	public String getAwb_no() {
		return awb_no;
	}

	public void setAwb_no(String awb_no) {
		this.awb_no = awb_no;
	}

	public String getCarton_no() {
		return carton_no;
	}

	public void setCarton_no(String carton_no) {
		this.carton_no = carton_no;
	}

	public String getDescription_goods() {
		return description_goods;
	}

	public void setDescription_goods(String description_goods) {
		this.description_goods = description_goods;
	}

	public String getBill_from_date() {
		return bill_from_date;
	}

	public void setBill_from_date(String bill_from_date) {
		this.bill_from_date = bill_from_date;
	}

	public String getBill_to_date() {
		return bill_to_date;
	}

	public void setBill_to_date(String bill_to_date) {
		this.bill_to_date = bill_to_date;
	}

	public String getFlag1() {
		return flag1;
	}

	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	public String getFlag2() {
		return flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	public String getFlag3() {
		return flag3;
	}

	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getPan_no() {
		return pan_no;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public String getSac_code() {
		return sac_code;
	}

	public void setSac_code(String sac_code) {
		this.sac_code = sac_code;
	}

	public String getReceiver_company_name() {
		return receiver_company_name;
	}

	public void setReceiver_company_name(String receiver_company_name) {
		this.receiver_company_name = receiver_company_name;
	}

	public String getReceiver_department() {
		return receiver_department;
	}

	public void setReceiver_department(String receiver_department) {
		this.receiver_department = receiver_department;
	}

	
	
	public String getHawb_no() {
		return hawb_no;
	}

	public void setHawb_no(String hawb_no) {
		this.hawb_no = hawb_no;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getDestination_id() {
		return destination_id;
	}

	public void setDestination_id(String destination_id) {
		this.destination_id = destination_id;
	}

	public String getTransitType_id() {
		return transitType_id;
	}

	public void setTransitType_id(String transitType_id) {
		this.transitType_id = transitType_id;
	}

	public String getDoc_type() {
		return doc_type;
	}

	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDocket_no() {
		return docket_no;
	}

	public void setDocket_no(String docket_no) {
		this.docket_no = docket_no;
	}

	public String getDocket_date() {
		return docket_date;
	}

	public void setDocket_date(String docket_date) {
		this.docket_date = docket_date;
	}

	public String getReference_no() {
		return reference_no;
	}

	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}

	public String getReciver_city() {
		return reciver_city;
	}

	public void setReciver_city(String reciver_city) {
		this.reciver_city = reciver_city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	@Override
	public String toString() {
		return "Form4_VO [manifestNo=" + manifestNo + ", filename=" + filename + ", no_of_package=" + no_of_package
				+ ", FileCode=" + FileCode + ", FileName=" + FileName + ", consignee_name_address="
				+ consignee_name_address + ", weight=" + weight + ", invoice_no=" + invoice_no + ", invoice_value="
				+ invoice_value + ", clearanceOrgAddress=" + clearanceOrgAddress + ", clearanceOrgName="
				+ clearanceOrgName + ", duty=" + duty + ", slno=" + slno + ", ceth_no=" + ceth_no + ", flagid=" + flagid
				+ ", flagVary=" + flagVary + ", customPointCode=" + customPointCode + ", mawb=" + mawb
				+ ", transitDate=" + transitDate + ", originCode=" + originCode + ", consignor_name_address="
				+ consignor_name_address + ", rate_of_exchange=" + rate_of_exchange + ", value_rs=" + value_rs
				+ ", shipper=" + shipper + ", delivery_state_name=" + delivery_state_name + ", item_details="
				+ item_details + ", valueUnder=" + valueUnder + ", additionalDutyRate=" + additionalDutyRate
				+ ", additionalDutyAmt=" + additionalDutyAmt + ", GSTCode=" + GSTCode + ", GSTRate=" + GSTRate
				+ ", IGSTExemptipn=" + IGSTExemptipn + ", IGSTAmt=" + IGSTAmt + ", socialwalfare=" + socialwalfare
				+ ", socialwalfare1=" + socialwalfare1 + ", frtIns=" + frtIns + ", ins=" + ins + ", others=" + others
				+ ", landingCharges=" + landingCharges + ", assableValue=" + assableValue + ", CTH_Notification_no="
				+ CTH_Notification_no + ", exempNotDate=" + exempNotDate + ", cusDutyRate=" + cusDutyRate
				+ ", cusDutyBCDAmt=" + cusDutyBCDAmt + ", ETH_Notification_No=" + ETH_Notification_No + ", TotalDuty1="
				+ TotalDuty1 + ", GSTConsNotification_No=" + GSTConsNotification_No + ", other_charges=" + other_charges
				+ ", GSTIN_No=" + GSTIN_No + ", currencyCode=" + currencyCode + ", document_type=" + document_type
				+ ", qty=" + qty + ", uom=" + uom + ", ind_val=" + ind_val + ", freight=" + freight + ", insurance="
				+ insurance + ", swsCharge=" + swsCharge + ", swsName=" + swsName + ", weight_to_be=" + weight_to_be
				+ ", invoiceNumber=" + invoiceNumber + ", senderName=" + senderName + ", senderAddress=" + senderAddress
				+ ", senderPhone=" + senderPhone + ", receiverName=" + receiverName + ", receiverPhone=" + receiverPhone
				+ ", receiverAddress=" + receiverAddress + ", invoiceDate=" + invoiceDate + ", invoiceValue="
				+ invoiceValue + ", totalCarton=" + totalCarton + ", totalWeight=" + totalWeight + ", serviceType="
				+ serviceType + ", frieghtCharge=" + frieghtCharge + ", dutiesTax=" + dutiesTax + ", transitTypeName="
				+ transitTypeName + ", originName=" + originName + ", deliveryLocationName=" + deliveryLocationName
				+ ", itemTypeName=" + itemTypeName + ", deliveryStateId=" + deliveryStateId + ", weightCharge="
				+ weightCharge + ", billCharge=" + billCharge + ", extraCharge=" + extraCharge + ", netAmount="
				+ netAmount + ", odaAmount=" + odaAmount + ", totalVolWeight=" + totalVolWeight + ", paymentStatus="
				+ paymentStatus + ", senderMobile=" + senderMobile + ", receiverMobile=" + receiverMobile
				+ ", receiverPin=" + receiverPin + ", volWeight=" + volWeight + ", volLenght=" + volLenght
				+ ", volHeight=" + volHeight + ", volWidth=" + volWidth + ", totalvolPcs=" + totalvolPcs
				+ ", senderPin=" + senderPin + ", freightBillTo=" + freightBillTo + ", deliveryName=" + deliveryName
				+ ", deliveryAddress=" + deliveryAddress + ", deliveryPincode=" + deliveryPincode + ", deliveryMobile="
				+ deliveryMobile + ", greentax=" + greentax + ", matha=" + matha + ", Destination=" + Destination
				+ ", flag1=" + flag1 + ", flag2=" + flag2 + ", flag3=" + flag3 + ", fsc_Charge=" + fsc_Charge
				+ ", chargeable_weight=" + chargeable_weight + ", rcs=" + rcs + ", amount=" + amount + ", serial="
				+ serial + ", logo=" + Arrays.toString(logo) + ", orgId=" + orgId + ", contactPerson=" + contactPerson
				+ ", senderEmailId=" + senderEmailId + ", mailSubject=" + mailSubject + ", senderMailId=" + senderMailId
				+ ", cc_receivermail_id=" + cc_receivermail_id + ", senderMailPassword=" + senderMailPassword
				+ ", receiverMailId=" + receiverMailId + ", fileLocation=" + fileLocation + ", attachmentName="
				+ attachmentName + ", text=" + text + ", refNo=" + refNo + ", recContPerson=" + recContPerson
				+ ", originId=" + originId + ", clientId=" + clientId + ", limit=" + limit + ", paymentMode="
				+ paymentMode + ", orgAddress=" + orgAddress + ", orgName=" + orgName + ", userName=" + userName
				+ ", organizationName=" + organizationName + ", organizationId=" + organizationId + ", mobileNo="
				+ mobileNo + ", hawbNo=" + hawbNo + ", ewayBillNo=" + ewayBillNo + ", dnNo=" + dnNo + ", consoleNo="
				+ consoleNo + ", remarks=" + remarks + ", deliveryType=" + deliveryType + ", gstNo=" + gstNo
				+ ", particulars=" + particulars + ", awb_type=" + awb_type + ", shipping_inv_no1=" + shipping_inv_no1
				+ ", shipping_inv_no2=" + shipping_inv_no2 + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", awbtype=" + awbtype + ", billNo=" + billNo + ", total_weight=" + total_weight + ", fsc=" + fsc
				+ ", totalAmount=" + totalAmount + ", customerId=" + customerId + ", clientName=" + clientName
				+ ", clientCode=" + clientCode + ", address=" + address + ", stateName=" + stateName
				+ ", customerState=" + customerState + ", igst=" + igst + ", cgst=" + cgst + ", sgst=" + sgst
				+ ", documentType=" + documentType + ", invoiceNo=" + invoiceNo + ", billingChargeName="
				+ billingChargeName + ", unitBasedAmount=" + unitBasedAmount + ", totalCount=" + totalCount + ", ess="
				+ ess + ", Date=" + Date + ", BillingCharge=" + BillingCharge + ", totalCharge=" + totalCharge
				+ ", billingChargeName1=" + billingChargeName1 + ", unitBasedAmount1=" + unitBasedAmount1
				+ ", totalCount1=" + totalCount1 + ", billingChargeName2=" + billingChargeName2 + ", date=" + date
				+ ", otherCharge=" + otherCharge + ", charge=" + charge + ", from_date=" + from_date + ", to_date="
				+ to_date + ", voicherNo=" + voicherNo + ", billno=" + billno + ", awb_no=" + awb_no + ", carton_no="
				+ carton_no + ", description_goods=" + description_goods + ", bill_from_date=" + bill_from_date
				+ ", bill_to_date=" + bill_to_date + ", bank_name=" + bank_name + ", branch_name=" + branch_name
				+ ", ifsc_code=" + ifsc_code + ", account_no=" + account_no + ", pan_no=" + pan_no + ", sac_code="
				+ sac_code + ", totalBag=" + totalBag + ", totalBox=" + totalBox + ", purchased=" + purchased
				+ ", opening=" + opening + ", booked=" + booked + ", clos_stock=" + clos_stock + ", client_name="
				+ client_name + ", flag=" + flag + ", inv_no=" + inv_no + "]";
	}

	private String receiver_name;
	private String unit;


	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getFrom_Awb() {
		return from_Awb;
	}

	public void setFrom_Awb(String from_Awb) {
		this.from_Awb = from_Awb;
	}

	public String getTo_Awb() {
		return to_Awb;
	}

	public void setTo_Awb(String to_Awb) {
		this.to_Awb = to_Awb;
	}

	public String getSenderNumber() {
		return senderNumber;
	}

	public void setSenderNumber(String senderNumber) {
		this.senderNumber = senderNumber;
	}

	public String getReceiverNumber() {
		return receiverNumber;
	}

	public void setReceiverNumber(String receiverNumber) {
		this.receiverNumber = receiverNumber;
	}
	
	
	
	
	
}
