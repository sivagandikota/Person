package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceUnit;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.olingo.odata2.api.annotation.edm.*;




/**
 * Class holding information on a person.
 */
@Entity
@Table(name="Person")
@PersistenceUnit(name="PERSONS")
@NamedQueries({
	@NamedQuery(name="findPersons", query="SELECT p FROM Person p")
})
@Resources ({
	@Resource(name="jdbc/DefaultDB")
    })


@XmlRootElement(name="Person")
@EdmEntityType
@EdmEntitySet
@XmlType

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5083845619493983853L;
	@Id
    @Column(name = "id")
    @GeneratedValue
    @EdmKey
    @EdmProperty
    private String id;
	@EdmProperty
    private String firstName;
	@EdmProperty
    private String lastName;
    //@Version
    //@Column(name = "version")
    //private Date version;

    /*public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}
*/
	public String getId() {
        return id;
    }

	
    public void setId(String newId) {
        this.id = newId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    @Override
    public String toString() {
    	return "{["+firstName+"],["+lastName+"]}";
    }
}
