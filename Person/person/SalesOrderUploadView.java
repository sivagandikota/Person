package person;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.myfaces.custom.fileupload.UploadedFile;
import org.apache.myfaces.custom.fileupload.UploadedFileDefaultFileImpl;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.SalesOrder;

import org.apache.commons.fileupload.FileItem;


@ManagedBean
@SessionScoped
public class SalesOrderUploadView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(SalesOrderUploadView.class);
	private UploadedFile uploadedFile;// = new UploadedFileDefaultFileImpl(new org.apache.commons.fileupload.disk.DiskFileItem("fun","fun",true,"fun",10,new File("")));

    private javax.servlet.http.Part file;
    private String fileContent;
	private Sheet sheet;
	private Workbook workbook =null;
	private Integer progress;
	private HashMap sales = new HashMap<Integer,model.SalesOrder>();
	private HashMap salesItems = new HashMap<Integer,model.SalesOrderItem>();
	private HashMap businessPartners = new HashMap<Integer,model.BusinessPartner>();
	private HashMap scheduleLine = new HashMap<Integer,model.ScheduleLine>();
	private HashMap addresse = new HashMap<Integer,model.Addresse>();
	private HashMap sales_salesItems = new HashMap<Integer,Integer>();
	private HashMap sales_businessPartners = new HashMap<Integer,Integer>();
	private HashMap sales_scheduleLine = new HashMap<Integer,Integer>();
	private HashMap sales_addresse = new HashMap<Integer,Integer>();
	private HashMap salesItems_businessPartners = new HashMap<Integer,Integer>();
	private HashMap salesItems_scheduleLine = new HashMap<Integer,Integer>();
	private HashMap salesItems_addresse = new HashMap<Integer,Integer>();
	private Row r;
	private service.SalesOrder client ;
	private JaxWsProxyFactoryBean factory ;
	
	
	
	public SalesOrderUploadView() {
		super();
		init();
	}
	public void init() {
		System.out.println("---------SalesOrderUploadView---------->init()");
		try {uploadedFile = new UploadedFileDefaultFileImpl(new org.apache.commons.fileupload.disk.DiskFileItem("fun","fun",true,"fun",10,new File("")));
		factory = new JaxWsProxyFactoryBean();
        factory.getFeatures().add(new LoggingFeature());
        //factory.setAddress("http://localhost:8080/Person/ws/SalesOrder?wsdl");
        factory.setAddress("https://fp2000476517trial.hanatrial.ondemand.com/Person/ws/SalesOrder?wsdl");
        client = factory.create(service.SalesOrder.class);
		}catch(Exception e) {e.printStackTrace();}
	}
	
	
    public List<model.SalesOrder> getAll() {
    	List<model.SalesOrder> list=null;
    	try {
    		
	        
    		
    		list=  client.all();
        }catch(Exception e) {e.printStackTrace();}
    	//entityManager.
    	return list;
    }
     
       
    
    
    
    
    
    
    /**
     * ============================================================================================================
     * 
     *                                             File Upload Part begins
     *                               
     * ============================================================================================================
     * @param is
     * @return
     */
    public void process(InputStream is) {
    	try {
    	try {

            //POIFSFileSystem poifs = new POIFSFileSystem(is);
            workbook = WorkbookFactory.create(is);
            sheet = workbook.getSheetAt(0);
            fileContent="";
        }
        catch (Exception e) {
        	//System.out.println(e);
        	e.printStackTrace(System.out);
        }
        
        sales = new HashMap<Integer,model.SalesOrder>();
        for( int i=0; i< workbook.getNumberOfSheets();i++){
        	sheet=workbook.getSheetAt(i);
        	if("SalesOrder".equals(sheet.getSheetName())) {
        		this.addSales(sheet);
        	}
        	else if("SalesOrderItem".equals(sheet.getSheetName())) {
        		this.addSalesItems(sheet);
        	}
        	else if("BusinessPartner".equals(sheet.getSheetName())) {
        		this.addBusinessPartner(sheet);
        	}
        	else if("ScheduleLine".equals(sheet.getSheetName())) {
        		this.addScheduleLine(sheet);
        	}
        	else if("Addresse".equals(sheet.getSheetName())) {
        		this.addAddresse(sheet);
        	}
        	
        }
        this.processSalesItems(); 	// add scheduleLine and businessPartners
    	this.processSales();
    	// add scheduleLine and businessPartners and salesItems\
    	Set keys = sales.keySet();
    	Iterator iter = keys.iterator();
    	int i=0;
    	while(iter.hasNext()) {
    		System.out.println("=================>"+i);
    		client.create((SalesOrder)sales.get(iter.next()));
    		
    	}
        //workbook.close();
        //System.out.println(fileContent + " uploaded");
       
    } catch (Exception e) {
        e.printStackTrace();
    }

    	//return "";
    }
    private void addSales(Sheet sheet) {
    	
    	System.out.println(sheet.getSheetName()+"--"+sheet.getFirstRowNum()+"--"+sheet.getPhysicalNumberOfRows());
  	  for(int j=sheet.getFirstRowNum()+1;j<sheet.getPhysicalNumberOfRows();j++) {
  		  r=sheet.getRow(j);
  		  
  		  
  		  
  		  model.SalesOrder salesOrd=new model.SalesOrder();
  		salesOrd.setSalesOrderType(r.getCell(1).getStringCellValue());
  		salesOrd.setSalesOrganization(r.getCell(2).getStringCellValue());
  		salesOrd.setDistributionChannel(r.getCell(3).getStringCellValue());
  		salesOrd.setOrganizationDivision(r.getCell(4).getStringCellValue());
  		salesOrd.setSalesGroup(r.getCell(5).getStringCellValue());
  		salesOrd.setSalesOffice(r.getCell(6).getStringCellValue());
  		salesOrd.setSalesDistrict(r.getCell(7).getStringCellValue());
  		salesOrd.setSoldToParty(r.getCell(8).getStringCellValue());
  		r.getCell(9).setCellType(CellType.NUMERIC);
  		salesOrd.setCreationDate(r.getCell(9).getDateCellValue());
  		salesOrd.setCreatedByUser(r.getCell(10).getStringCellValue());
  		r.getCell(11).setCellType(CellType.NUMERIC);
  		salesOrd.setLastChangeDate(r.getCell(11).getDateCellValue());
  		r.getCell(12).setCellType(CellType.NUMERIC);
  		salesOrd.setLastChangeDateTime(r.getCell(12).getDateCellValue());
  		salesOrd.setPurchaseOrderByCustomer(r.getCell(13).getStringCellValue());
  		salesOrd.setCustomerPurchaseOrderType(r.getCell(14).getStringCellValue());
  		r.getCell(15).setCellType(CellType.NUMERIC);
  		salesOrd.setCustomerPurchaseOrderDate(r.getCell(15).getDateCellValue());
  		r.getCell(16).setCellType(CellType.NUMERIC);
  		salesOrd.setSalesOrderDate(r.getCell(16).getDateCellValue());
  		System.out.println(r.getCell(17).getCellTypeEnum());
  		salesOrd.setTotalNetAmount(new BigDecimal(r.getCell(17).getNumericCellValue()));
  		salesOrd.setTransactionCurrency(r.getCell(18).getStringCellValue());
  		salesOrd.setSDDocumentReason(r.getCell(19).getStringCellValue());
  		r.getCell(20).setCellType(CellType.NUMERIC);
  		salesOrd.setPricingDate(r.getCell(20).getDateCellValue());
  		r.getCell(21).setCellType(CellType.NUMERIC);
  		salesOrd.setRequestedDeliveryDate(r.getCell(21).getDateCellValue());
  		salesOrd.setShippingCondition(r.getCell(22).getStringCellValue());
  		salesOrd.setCompleteDeliveryIsDefined(r.getCell(23).getBooleanCellValue());
  		salesOrd.setShippingType(r.getCell(24).getStringCellValue());
  		salesOrd.setHeaderBillingBlockReason(r.getCell(25).getStringCellValue());
  		salesOrd.setDeliveryBlockReason(r.getCell(26).getStringCellValue());
  		salesOrd.setIncotermsClassification(r.getCell(27).getStringCellValue());
  		salesOrd.setIncotermsTransferLocation(r.getCell(28).getStringCellValue());
  		salesOrd.setIncotermsLocation1(r.getCell(29).getStringCellValue());
  		salesOrd.setIncotermsLocation2(r.getCell(30).getStringCellValue());
  		salesOrd.setIncotermsVersion(r.getCell(31).getStringCellValue());
  		salesOrd.setCustomerPaymentTerms(r.getCell(32).getStringCellValue());
  		salesOrd.setPaymentMethod(r.getCell(33).getStringCellValue());
  		salesOrd.setAssignmentReference(r.getCell(34).getStringCellValue());
  		salesOrd.setOverallSDProcessStatus(r.getCell(35).getStringCellValue());
  		salesOrd.setTotalCreditCheckStatus(r.getCell(36).getStringCellValue());
  		salesOrd.setOverallTotalDeliveryStatus(r.getCell(37).getStringCellValue());
  		salesOrd.setOverallSDDocumentRejectionSts(r.getCell(18).getStringCellValue());

  		  sales.put(new Integer(j),salesOrd);
  		  System.out.println("--Row-Num-"+r.getRowNum());
  	    
  	    
  	  }

    }
    private void addSalesItems(Sheet sheet) {
    	System.out.println(sheet.getSheetName()+"--"+sheet.getFirstRowNum()+"--"+sheet.getPhysicalNumberOfRows());
    	  for(int j=sheet.getFirstRowNum()+1;j<sheet.getPhysicalNumberOfRows();j++) {
    		  r=sheet.getRow(j);
    		  
    		  
    		  
    		  model.SalesOrderItem salesOrd=new model.SalesOrderItem();
    		  this.sales_salesItems.put(Integer.valueOf((int)r.getCell(0).getNumericCellValue()), Integer.valueOf((int)r.getCell(1).getNumericCellValue()));
    		//salesOrd.setSalesOrderType(r.getCell(2).getStringCellValue());
    		  salesOrd.setHigherLevelItem(r.getCell(2).getStringCellValue());
    		  salesOrd.setSalesOrderItemCategory(r.getCell(3).getStringCellValue());
    		  salesOrd.setSalesOrderItemText(r.getCell(4).getStringCellValue());
    		  salesOrd.setPurchaseOrderByCustomer(r.getCell(5).getStringCellValue());
    		  salesOrd.setMaterial(r.getCell(6).getStringCellValue());
    		  salesOrd.setMaterialByCustomer(r.getCell(7).getStringCellValue());
    		  salesOrd.setPricingDate(r.getCell(8).getDateCellValue());
    		  r.getCell(9).setCellType(CellType.NUMERIC);
    		  salesOrd.setRequestedQuantity(r.getCell(9).getNumericCellValue());
    		  salesOrd.setRequestedQuantityUnit(r.getCell(10).getStringCellValue());
    		  r.getCell(11).setCellType(CellType.NUMERIC);
    		  salesOrd.setItemGrossWeight(r.getCell(11).getNumericCellValue());
    		  r.getCell(12).setCellType(CellType.NUMERIC);
    		  salesOrd.setItemNetWeight(r.getCell(12).getNumericCellValue());
    		  salesOrd.setItemWeightUnit(r.getCell(13).getStringCellValue());
    		  salesOrd.setItemVolume(r.getCell(14).getStringCellValue());
    		  salesOrd.setItemVolumeUnit(r.getCell(15).getStringCellValue());
    		  salesOrd.setTransactionCurrency(r.getCell(16).getStringCellValue());
    		  salesOrd.setNetAmount(r.getCell(17).getNumericCellValue()+"");
    		  salesOrd.setMaterialGroup(r.getCell(18).getStringCellValue());
    		  salesOrd.setMaterialPricingGroup(r.getCell(19).getStringCellValue());
    		  salesOrd.setBatch(r.getCell(20).getStringCellValue());
    		  salesOrd.setProductionPlant(r.getCell(21).getStringCellValue());
    		  salesOrd.setStorageLocation(r.getCell(22).getStringCellValue());
    		  salesOrd.setDeliveryGroup(r.getCell(23).getStringCellValue());
    		  salesOrd.setShippingPoint(r.getCell(24).getStringCellValue());
    		  salesOrd.setShippingType(r.getCell(25).getStringCellValue());
    		  salesOrd.setDeliveryPriority(r.getCell(26).getStringCellValue());
    		  salesOrd.setIncotermsClassification(r.getCell(27).getStringCellValue());
    		  salesOrd.setIncotermsTransferLocation(r.getCell(28).getStringCellValue());
    		  salesOrd.setIncotermsLocation1(r.getCell(29).getStringCellValue());
    		  salesOrd.setIncotermsLocation2(r.getCell(30).getStringCellValue());
    		  salesOrd.setCustomerPaymentTerms(r.getCell(31).getStringCellValue());
    		  salesOrd.setSalesDocumentRjcnReason(r.getCell(32).getStringCellValue());
    		  salesOrd.setItemBillingBlockReason(r.getCell(33).getStringCellValue());
    		  //salesOrd.setWBSElement(r.getCell(34).getStringCellValue());
    		  //salesOrd.setSDProcessStatus(r.getCell(35).getStringCellValue());
    		  salesOrd.setDeliveryStatus(r.getCell(34).getStringCellValue());
    		  salesOrd.setOrderRelatedBillingStatus(r.getCell(35).getStringCellValue());
    		  //this.sales_salesItems
    		  salesItems.put(Integer.valueOf(j),salesOrd);
    		  System.out.println("--Row-Num-"+r.getRowNum());
    	      
    	    
    	  }

    }
    
    private void addBusinessPartner(Sheet sheet) {
    	System.out.println(sheet.getSheetName()+"--"+sheet.getFirstRowNum()+"--"+sheet.getPhysicalNumberOfRows());
    	  for(int j=sheet.getFirstRowNum()+1;j<sheet.getPhysicalNumberOfRows();j++) {
    		  r=sheet.getRow(j);
    		  
    		  
    		  model.BusinessPartner busiPart=new model.BusinessPartner();
    		//salesOrd.setSalesOrderType(r.getCell(1).getStringCellValue());
    		  busiPart.setPartnerFunction(r.getCell(3).getStringCellValue());
    		  if(null !=r.getCell(2)) {
    		  System.out.println(r.getCell(2).getCellTypeEnum()==CellType.BLANK);
    		  if(r.getCell(2,Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).getNumericCellValue()>0)
    		  this.sales_businessPartners.put(Integer.valueOf((int)r.getCell(0).getNumericCellValue()), Integer.valueOf((int)r.getCell(2).getNumericCellValue()));
    		  }
    		  busiPart.setCustomer(r.getCell(4).getStringCellValue());
    		  busiPart.setSupplier(r.getCell(5).getStringCellValue());
    		  busiPart.setPersonnel(r.getCell(6).getStringCellValue());
    		  busiPart.setContactPerson(r.getCell(7).getStringCellValue());
    		  
    		  if(null !=r.getCell(1)) {
    		  if(r.getCell(1).getNumericCellValue()>0)
        		  this.salesItems_businessPartners.put(Integer.parseInt((int)r.getCell(0).getNumericCellValue()+""), Integer.valueOf((int)r.getCell(1).getNumericCellValue()+""));
    		  }
    		  
    		  this.businessPartners.put(Integer.valueOf(j),busiPart);
    		  System.out.println("--Row-Num-"+r.getRowNum());
    	    
    	    
    	  }

    }
    
    private void addScheduleLine(Sheet sheet) {
    	System.out.println(sheet.getSheetName()+"--"+sheet.getFirstRowNum()+"--"+sheet.getPhysicalNumberOfRows());
    	  for(int j=sheet.getFirstRowNum()+1;j<sheet.getPhysicalNumberOfRows();j++) {
    		  r=sheet.getRow(j);
    		  
    		  
    		  
    		  model.ScheduleLine shedLine=new model.ScheduleLine();
    		  if(null !=r.getCell(1)) {
    		  if(r.getCell(1).getNumericCellValue()>0)
        		  this.sales_scheduleLine.put(new Integer((int)r.getCell(0).getNumericCellValue()), new Integer((int)r.getCell(1).getNumericCellValue()));
    		  }
    		  
    		  if(null !=r.getCell(2)) {
    		  if(r.getCell(2).getNumericCellValue()>0)
        		  this.salesItems_scheduleLine.put(new Integer((int)r.getCell(0).getNumericCellValue()), new Integer((int)r.getCell(2).getNumericCellValue()));
    		  }
    		  //salesOrd.setSalesOrderType(r.getCell(1).getStringCellValue());
    		  shedLine.setOrderQuantityUnit(r.getCell(3).getStringCellValue());
    		  r.getCell(4).setCellType(CellType.NUMERIC);
    		  shedLine.setConfdOrderQtyByMatlAvailCheck((long)r.getCell(4).getNumericCellValue());
    		  r.getCell(5).setCellType(CellType.NUMERIC);
    		  shedLine.setDeliveredQtyInOrderQtyUnit((long)r.getCell(5).getNumericCellValue());
    		  r.getCell(6).setCellType(CellType.NUMERIC);
    		  shedLine.setOpenConfdDelivQtyInOrdQtyUnit((long)r.getCell(6).getNumericCellValue());
    		  shedLine.setDelivBlockReasonForSchedLine(r.getCell(7).getStringCellValue());
    		
    		  this.scheduleLine.put(Integer.valueOf(j),shedLine);
    		  System.out.println("--Row-Num-"+r.getRowNum());
    	    
    	    
    	  }

    }

    private void addAddresse(Sheet sheet) {
    	System.out.println(sheet.getSheetName()+"--"+sheet.getFirstRowNum()+"--"+sheet.getPhysicalNumberOfRows());
    	  for(int j=sheet.getFirstRowNum()+1;j<sheet.getPhysicalNumberOfRows();j++) {
    		  r=sheet.getRow(j);
    		  
    		  
    		  
    		  model.Addresse addr=new model.Addresse();
    		  if(null !=r.getCell(1)) {
    		  if(r.getCell(1).getNumericCellValue()>0)
        		  this.sales_addresse.put(new Integer((int)r.getCell(0).getNumericCellValue()), new Integer((int)r.getCell(1).getNumericCellValue()));
    		  }
    		  
    		  if(null !=r.getCell(2)) {
    		  if(r.getCell(2).getNumericCellValue()>0)
        		  this.salesItems_addresse.put(new Integer((int)r.getCell(0).getNumericCellValue()), new Integer((int)r.getCell(2).getNumericCellValue()));
    		  }

    		  addr.setAddressType(r.getCell(3).getStringCellValue());
    		  addr.setCompanyName(r.getCell(4).getStringCellValue());
    		  addr.setFullName(r.getCell(5).getStringCellValue());
    		  addr.setAddress1(r.getCell(6).getStringCellValue());
    		  addr.setAddress2(r.getCell(7).getStringCellValue());
    		  r.getCell(8).setCellType(CellType.STRING);
    		  addr.setZip(r.getCell(8).getStringCellValue());
    		  addr.setCity(r.getCell(9).getStringCellValue());
    		  addr.setState(r.getCell(10).getStringCellValue());
    		  addr.setCountry(r.getCell(11).getStringCellValue());
    		  addr.setPhone(r.getCell(12).getStringCellValue());


    		  this.addresse.put(Integer.valueOf(j),addr);
    		  System.out.println("--Row-Num-"+r.getRowNum());
    	    
    	    
    	  }

    }

    
    private void processSalesItems() {
    	model.BusinessPartner bp;
    	model.SalesOrderItem sItem;
    	model.ScheduleLine shed;
    	model.SalesOrder sale;
    	model.Addresse addr;
    	Iterator i ;
    	if(this.salesItems_businessPartners.size()>0) {
    		i = salesItems_businessPartners.keySet().iterator();
    		Integer key;
    		while(i.hasNext()) {
    			key=Integer.valueOf(i.next().toString());
    			bp=(model.BusinessPartner)this.businessPartners.get(key);
    			sItem=(model.SalesOrderItem)this.salesItems.get(salesItems_businessPartners.get(key));
    			sItem.setBusinessPartner(bp);
    			
    		}
    	}
    	
    	if(this.salesItems_scheduleLine.size()>0) {
    		i = salesItems_scheduleLine.keySet().iterator();
    		Integer key;
    		while(i.hasNext()) {
    			key=Integer.valueOf(i.next().toString());
    			shed=(model.ScheduleLine)this.scheduleLine.get(key);
    			sItem=(model.SalesOrderItem)this.salesItems.get(salesItems_scheduleLine.get(key));
    			sItem.setScheduleLine(shed);
    			
    		}
    	}
    	
    	if(this.salesItems_addresse.size()>0) {
    		i = salesItems_addresse.keySet().iterator();
    		Integer key;
    		while(i.hasNext()) {
    			key=Integer.valueOf(i.next().toString());
    			addr=(model.Addresse)this.addresse.get(key);
    			sItem=(model.SalesOrderItem)this.salesItems.get(salesItems_addresse.get(key));
    			sItem.setAddresse(addr);
    			
    		}
    	}
    }
    
    private void processSales() {
    	model.BusinessPartner bp;
    	model.SalesOrderItem sItem;
    	model.ScheduleLine shed;
    	model.SalesOrder sale;
    	model.Addresse addr;
    	Iterator i ;
    	if(this.sales_businessPartners.size()>0) {
    		i = sales_businessPartners.keySet().iterator();
    		Integer key;
    		while(i.hasNext()) {
    			key=Integer.valueOf(i.next().toString());
    			bp=(model.BusinessPartner)this.businessPartners.get(key);
    			sItem=(model.SalesOrderItem)this.salesItems.get(sales_businessPartners.get(key));
    			sItem.setBusinessPartner(bp);
    			
    		}
    	}
    	
    	if(this.sales_scheduleLine.size()>0) {
    		i = sales_scheduleLine.keySet().iterator();
    		Integer key;
    		while(i.hasNext()) {
    			key=Integer.valueOf(i.next().toString());
    			shed=(model.ScheduleLine)this.scheduleLine.get(key);
    			sItem=(model.SalesOrderItem)this.salesItems.get(sales_scheduleLine.get(key));
    			sItem.setScheduleLine(shed);
    			
    		}
    	}
    	
    	if(this.sales_salesItems.size()>0) {
    		i = sales_salesItems.keySet().iterator();
    		Integer key;
    		while(i.hasNext()) {
    			key=Integer.valueOf(i.next().toString());
    			sItem = (model.SalesOrderItem)this.salesItems.get(key);
    			sale = (model.SalesOrder)this.sales.get(sales_salesItems.get(key));
    			sale.getSalesOrderItem().add(sItem);
    			
    		}
    	}
    	
    	if(this.sales_addresse.size()>0) {
    		i = sales_addresse.keySet().iterator();
    		Integer key;
    		while(i.hasNext()) {
    			key=Integer.valueOf(i.next().toString());
    			addr = (model.Addresse)this.salesItems.get(key);
    			sale = (model.SalesOrder)this.sales.get(sales_addresse.get(key));
    			sale.setAddresse(addr);
    			
    		}
    	}
    	
    	
    }
    
    
    public javax.servlet.http.Part getFilePath() {
		System.out.println("----SalesOrderUploadView--getFilePath---javax.servlet.http.Part---- is called");
		return file;
	}
    
    /*public void filePathUP(UploadedFile uploadedFile) {
    	System.out.println("------Void filePathUP is called-------"+uploadedFile.getContentType()+"----"+uploadedFile.getName()+"----");
        this.uploadedFile = uploadedFile;
        try{process(uploadedFile.getInputStream());}catch(Exception e) {log.error(e.getMessage());}
    }*/
    public void setFilePathUP(UploadedFile uploadedFile) {
    	System.out.println("------Void setFilePathUP is called-------"+uploadedFile.getContentType()+"----"+uploadedFile.getName()+"----");
        this.uploadedFile = uploadedFile;
        try{process(uploadedFile.getInputStream());}catch(Exception e) {log.error(e.getMessage());}
    }
    public UploadedFile getFilePathUP() {
    	System.out.println("------UploadedFile getFilePathUP is called-------"+uploadedFile.getContentType()+"----"+uploadedFile.getName()+"----");
        return uploadedFile;
        
    }
    
    public void upload() {
        System.out.println("------Void upload is called-------");
        //process();
    }
    public void upload(String str) {
        System.out.println("------Void upload is called-------"+str);
    }
    public String getUpload() {
        System.out.println("------String get upload is called-------");
        return "Hello";
    }
    public void setUpload(String upd) {
        System.out.println("------Void set upload is called-------"+upd);
        
    }

    public Integer getProgress() {
        if(progress == null) {
            progress = 0;
        }
        else {
            //progress = progress + (int)(Math.random() * 35);

            if(progress > 100)
                progress = 100;
        }

        return progress;
    }
    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public void onComplete() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Progress Completed"));
    }
    
    /**
     * =============================================================================================================
     * 
     *                                             File Upload Part ends
     *                                
     * =============================================================================================================
     */

}
