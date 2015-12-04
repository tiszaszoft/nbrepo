/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import pojos.City;
import pojos.Country;

/**
 *
 * @author z132446
 */
@ManagedBean
@SessionScoped
public class Listazo {

    private List<Country> orszagok;
    private List<City> varosok;
    private String aktOrszagCode;
    private Country aktOrszag;
    private City aktCity;
    private Map<String, Country> orszagMap;
    
    public Listazo() {
        orszagMap = new HashMap<>();
        Session session = hibernate.HibernateUtil.getSessionFactory().openSession();
        orszagok = session.createQuery("From Country").list();
        session.close();
        for (Country c : orszagok) {
            orszagMap.put(c.getCode(),c);            
        }
    }

    
    public void kivalaszt(){
       aktOrszag = orszagMap.get(aktOrszagCode);
       varosok = new ArrayList<>(aktOrszag.getCities());
    }
    
    public List<Country> getOrszagok() {
        return orszagok;
    }

    public void setOrszagok(List<Country> orszagok) {
        this.orszagok = orszagok;
    }

    public List<City> getVarosok() {
        return varosok;
    }

    public void setVarosok(List<City> varosok) {
        this.varosok = varosok;
    }

    public String getAktOrszagCode() {
        return aktOrszagCode;
    }

    public void setAktOrszagCode(String aktOrszagCode) {
        this.aktOrszagCode = aktOrszagCode;
    }

    public Country getAktOrszag() {
        return aktOrszag;
    }

    public void setAktOrszag(Country aktOrszag) {
        this.aktOrszag = aktOrszag;
    }

    public City getAktCity() {
        return aktCity;
    }

    public void setAktCity(City aktCity) {
        this.aktCity = aktCity;
    }

    public Map<String, Country> getOrszagMap() {
        return orszagMap;
    }

    public void setOrszagMap(Map<String, Country> orszagMap) {
        this.orszagMap = orszagMap;
    }
    
    
    
}
