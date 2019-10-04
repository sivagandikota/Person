package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.metamodel.Metamodel;

import org.eclipse.persistence.internal.jpa.metamodel.EntityTypeImpl;
import org.eclipse.persistence.sessions.Session;
import org.eclipse.persistence.sessions.factories.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@ManagedBean(name = "db")
public class Db{
	@PersistenceContext(name="PERSONS")
	private String query;
	private String upload;
	private String output;
	private static EntityManager em;
	
	private static final Logger log = LoggerFactory.getLogger(Db.class);
	

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public String getOutput() {
		try{
			if(em==null) {
				em = Persistence.createEntityManagerFactory("PERSONS").createEntityManager();
			}
			
			
			Metamodel mm = em.getMetamodel();
			output = mm.toString();
			Set entities = mm.getEntities();
			Iterator iter = entities.iterator();
			output+="\n Entities:";
			while(iter.hasNext()) {output+="\n"+((EntityTypeImpl)iter.next()).getBindableJavaType().getCanonicalName();}
			//output+="\n Entities:"+mm.getEntities().toString();
			
			/*output+="\n Managed Entities:"+mm.getManagedTypes().toString();
			List resultList = em.createQuery(query).getResultList();
			output+= "\n"+resultList.toString();*/
		}catch(Exception e) {e.printStackTrace();}
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
	public void upload() {System.out.println("---->Upload called<----");}
	
	
}