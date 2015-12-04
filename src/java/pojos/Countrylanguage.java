package pojos;
// Generated Dec 4, 2015 4:12:22 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Countrylanguage generated by hbm2java
 */
@Entity
@Table(name="countrylanguage"
    ,catalog="world"
)
public class Countrylanguage  implements java.io.Serializable {


     private CountrylanguageId id;
     private Country country;
     private String isOfficial;
     private float percentage;

    public Countrylanguage() {
    }

    public Countrylanguage(CountrylanguageId id, Country country, String isOfficial, float percentage) {
       this.id = id;
       this.country = country;
       this.isOfficial = isOfficial;
       this.percentage = percentage;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="countryCode", column=@Column(name="CountryCode", nullable=false, length=3) ), 
        @AttributeOverride(name="language", column=@Column(name="Language", nullable=false, length=30) ) } )
    public CountrylanguageId getId() {
        return this.id;
    }
    
    public void setId(CountrylanguageId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CountryCode", nullable=false, insertable=false, updatable=false)
    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }

    
    @Column(name="IsOfficial", nullable=false, length=2)
    public String getIsOfficial() {
        return this.isOfficial;
    }
    
    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    
    @Column(name="Percentage", nullable=false, precision=4, scale=1)
    public float getPercentage() {
        return this.percentage;
    }
    
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }




}


