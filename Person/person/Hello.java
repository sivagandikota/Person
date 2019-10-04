package person;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.myfaces.custom.fileupload.UploadedFile;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Person;


@ManagedBean(name = "hello")
@SessionScoped

@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces({  MediaType.APPLICATION_JSON })
public class Hello {
	private String filePath="";
	private List<Person> persons= new ArrayList<Person>();
	private int filesUploaded = 0;
	private String hello="";
	private static final Logger log = LoggerFactory.getLogger(Hello.class);


	private static final String PERSISTENCE_UNIT_NAME = "PERSONS";   
	@PersistenceContext(name=PERSISTENCE_UNIT_NAME)
	// private EntityManager em;
	
	    private static EntityManager em; //= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	
	    private static EntityTransaction transactionObj;// = em.getTransaction();
	
	 

    //javax.servlet.http.Part (Servlet 3.0 API)
	private UploadedFile uploadedFile;

    private javax.servlet.http.Part file;
    private String fileContent;
	private Sheet sheet;
    
	/*public String getFilePath() {
		if(file==null)
			return "";
		else
		return file.getName();
	}*/
	public javax.servlet.http.Part getFilePath() {
		System.out.println("------getFilePath---javax.servlet.http.Part---- is called");
		return file;
	}
	
	public void setFilePath(Object file) {
		System.out.println("------setFilePath---String---- is called---"+file.getClass().getCanonicalName());
		//this.file = file;
		//filePath=file;
		//process();
	}
	public void setFilePath(String file) {
		System.out.println("------setFilePath---String---- is called---"+file);
		//this.file = file;
		filePath=file;
		//process();
	}
	public void setFilePath(javax.servlet.http.Part  file) {
		 System.out.println("------setFilePath---javax.servlet.http.Part---- is called--"+file);
		this.file = file;
		//filePath=file;
		try{process(file.getInputStream());}catch(Exception e) {log.error(e.getStackTrace().toString());}
	}
	public void setFilePath(org.apache.catalina.core.ApplicationPart  file) {
		 System.out.println("------setFilePath---org.apache.catalina.core.ApplicationPart---- is called"+file);
		this.file = file;
		//filePath=file;
		try{process(file.getInputStream());}catch(Exception e) {log.error(e.getMessage());}
	}

	public org.apache.myfaces.custom.fileupload.UploadedFile getFilePathUP() {
        return uploadedFile;
    }

    public void setFilePathUP(UploadedFile uploadedFile) {
    	System.out.println("------Void setFilePathUP is called-------"+uploadedFile.getContentType()+"----"+uploadedFile.getName()+"----"+uploadedFile.toString());
        this.uploadedFile = uploadedFile;
        try{process(uploadedFile.getInputStream());}catch(Exception e) {log.error(e.getMessage());}
    }
    
	public List<Person> getPersons() {
		try{//Query query = em.createNamedQuery("Person.findPersons");
			Query query = em.createQuery("SELECT p FROM Person p");
         persons=  query.getResultList();
		}catch(Exception e) {e.printStackTrace();}

		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	public void upload() {
        System.out.println("------Void upload is called-------");
        //process();
    }
	
	
	public String getFileContent() {
		return fileContent;
	}
	private String process(InputStream is) {
		//if(uploadedFile!=null) {
		try {
			/*String fileName = FilenameUtils.getName(uploadedFile.getName());
	        String contentType = uploadedFile.getContentType();
	        byte[] bytes = uploadedFile.getBytes();
	        System.out.println(bytes.toString());
	        fileContent = String. valueOf(bytes);*/
            /*fileContent = new Scanner(file.getInputStream())
                    .useDelimiter("\\A").next();*/
			/*InputStream is=null;
			if(file!=null)*/
            //is = file.getInputStream();
            /*if(filePath.length()>0)
            	is = new FileInputStream(new File(filePath));*/
            //StreamingWorkbook workbook = new StreamingWorkbook(new StreamingWorkbookReader(StreamingReader.builder()));
           // StreamingWorkbookReader steamRead = new StreamingWorkbookReader(StreamingReader.builder());
           // steamRead.init(is);
           // StreamingWorkbook workbook = new StreamingWorkbook(steamRead);
                    /*.rowCacheSize(100)    // number of rows to keep in memory (defaults to 10)
                    .bufferSize(4096)     // buffer size to use when reading InputStream to file (defaults to 1024)
                    .sheetIndex(0)        // index of sheet to use (defaults to 0)
                    .sheetName("sheet1")  // name of sheet to use (overrides sheetIndex)
                    .read(is);            // InputStream or File for XLSX file (required)
*/
            Sheet sheet = null;
            Workbook workbook =null;
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
            Row r;
            persons = new ArrayList<Person>();
            for( int i=0; i< workbook.getNumberOfSheets();i++){
            	sheet=workbook.getSheetAt(i);
            	  System.out.println(sheet.getSheetName()+"--"+sheet.getFirstRowNum()+"--"+sheet.getPhysicalNumberOfRows());
            	  for(int j=sheet.getFirstRowNum();j<sheet.getPhysicalNumberOfRows();j++) {
            		  r=sheet.getRow(j);
            		  
            		  if(!transactionObj.isActive()) {
			              transactionObj.begin();
			          }
            		  
            		  Person person=new Person();
            		  person.setFirstName(r.getCell(0).getStringCellValue());
            		  person.setLastName(r.getCell(1).getStringCellValue());
            		  
            			   
            			          em.persist(person);
            			          transactionObj.commit();

            		  persons.add(person);
            		  System.out.println("--Row-Num-"+r.getRowNum());
            	    /*for (Cell c : r) {
            	    	fileContent = fileContent + c.getStringCellValue();
            	      log.debug(c.getStringCellValue());
            	    }*/
            	    fileContent = fileContent+person.toString()+"\n";
            	  }
            	}
            //workbook.close();
            System.out.println(fileContent + " uploaded");
            filesUploaded++;
        } catch (Exception e) {
            e.printStackTrace();
        }//}
		return fileContent;
	}
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
		try{em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();}catch(Exception e) {e.printStackTrace();}
		try{System.out.println("------em-->"+em);transactionObj = em.getTransaction();}catch(Exception e) {e.printStackTrace();}
	}
	public void init() {}
	public int getFilesUploaded() {
		return filesUploaded;
	}

	public void setFilesUploaded(int filesUploaded) {
		this.filesUploaded = filesUploaded;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public static EntityManager getem() {
		return em;
	}

	public static void setEm(EntityManager em) {
		Hello.em = em;
	}

	public static EntityTransaction getTransactionObj() {
		return transactionObj;
	}

	public static void setTransactionObj(EntityTransaction transactionObj) {
		Hello.transactionObj = transactionObj;
	}

	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	public javax.servlet.http.Part getFile() {
		return file;
	}

	public void setFile(javax.servlet.http.Part file) {
		this.file = file;
	}

	public Sheet getSheet() {
		return sheet;
	}

	public void setSheet(Sheet sheet) {
		this.sheet = sheet;
	}

	public static Logger getLog() {
		return log;
	}

	public static String getPersistenceUnitName() {
		return PERSISTENCE_UNIT_NAME;
	}



	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
}
