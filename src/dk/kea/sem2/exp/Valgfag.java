package dk.kea.sem2.exp;
// Generated Feb 11, 2015 8:14:29 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Valgfag generated by hbm2java
 */
@Entity
@Table(name="Valgfag"
    ,schema="dbo"
    ,catalog="Electives"
)
public class Valgfag  implements java.io.Serializable {


     private int valgfagId;
     private Serializable navn;
     private Serializable beskrivelse;
     private Serializable bpu;
     private Set<Runde1res> runde1resesForP1a = new HashSet<Runde1res>(0);
     private Set<Runde2res> runde2resesForAp2 = new HashSet<Runde2res>(0);
     private Set<Runde2> runde2s = new HashSet<Runde2>(0);
     private Set<Runde2res> runde2resesForBp1 = new HashSet<Runde2res>(0);
     private Set<Runde2res> runde2resesForBp2 = new HashSet<Runde2res>(0);
     private Set<Runde2res> runde2resesForAp1 = new HashSet<Runde2res>(0);
     private Set<Runde1> runde1s = new HashSet<Runde1>(0);
     private Set<Studerende> studerendes = new HashSet<Studerende>(0);
     private Set<Runde1res> runde1resesForP2a = new HashSet<Runde1res>(0);
     private Set<Runde1res> runde1resesForP1b = new HashSet<Runde1res>(0);
     private Set<Runde1res> runde1resesForP2b = new HashSet<Runde1res>(0);

    public Valgfag() {
    }

	
    public Valgfag(int valgfagId, Serializable navn, Serializable bpu) {
        this.valgfagId = valgfagId;
        this.navn = navn;
        this.bpu = bpu;
    }
    public Valgfag(int valgfagId, Serializable navn, Serializable beskrivelse, Serializable bpu, Set<Runde1res> runde1resesForP1a, Set<Runde2res> runde2resesForAp2, Set<Runde2> runde2s, Set<Runde2res> runde2resesForBp1, Set<Runde2res> runde2resesForBp2, Set<Runde2res> runde2resesForAp1, Set<Runde1> runde1s, Set<Studerende> studerendes, Set<Runde1res> runde1resesForP2a, Set<Runde1res> runde1resesForP1b, Set<Runde1res> runde1resesForP2b) {
       this.valgfagId = valgfagId;
       this.navn = navn;
       this.beskrivelse = beskrivelse;
       this.bpu = bpu;
       this.runde1resesForP1a = runde1resesForP1a;
       this.runde2resesForAp2 = runde2resesForAp2;
       this.runde2s = runde2s;
       this.runde2resesForBp1 = runde2resesForBp1;
       this.runde2resesForBp2 = runde2resesForBp2;
       this.runde2resesForAp1 = runde2resesForAp1;
       this.runde1s = runde1s;
       this.studerendes = studerendes;
       this.runde1resesForP2a = runde1resesForP2a;
       this.runde1resesForP1b = runde1resesForP1b;
       this.runde1resesForP2b = runde1resesForP2b;
    }
   
     @Id 
    
    @Column(name="valgfag_id", unique=true, nullable=false)
    public int getValgfagId() {
        return this.valgfagId;
    }
    
    public void setValgfagId(int valgfagId) {
        this.valgfagId = valgfagId;
    }
    
    @Column(name="Navn", nullable=false)
    public Serializable getNavn() {
        return this.navn;
    }
    
    public void setNavn(Serializable navn) {
        this.navn = navn;
    }
    
    @Column(name="Beskrivelse")
    public Serializable getBeskrivelse() {
        return this.beskrivelse;
    }
    
    public void setBeskrivelse(Serializable beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
    
    @Column(name="BPU", nullable=false)
    public Serializable getBpu() {
        return this.bpu;
    }
    
    public void setBpu(Serializable bpu) {
        this.bpu = bpu;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByP1a")
    public Set<Runde1res> getRunde1resesForP1a() {
        return this.runde1resesForP1a;
    }
    
    public void setRunde1resesForP1a(Set<Runde1res> runde1resesForP1a) {
        this.runde1resesForP1a = runde1resesForP1a;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByAp2")
    public Set<Runde2res> getRunde2resesForAp2() {
        return this.runde2resesForAp2;
    }
    
    public void setRunde2resesForAp2(Set<Runde2res> runde2resesForAp2) {
        this.runde2resesForAp2 = runde2resesForAp2;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfag")
    public Set<Runde2> getRunde2s() {
        return this.runde2s;
    }
    
    public void setRunde2s(Set<Runde2> runde2s) {
        this.runde2s = runde2s;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByBp1")
    public Set<Runde2res> getRunde2resesForBp1() {
        return this.runde2resesForBp1;
    }
    
    public void setRunde2resesForBp1(Set<Runde2res> runde2resesForBp1) {
        this.runde2resesForBp1 = runde2resesForBp1;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByBp2")
    public Set<Runde2res> getRunde2resesForBp2() {
        return this.runde2resesForBp2;
    }
    
    public void setRunde2resesForBp2(Set<Runde2res> runde2resesForBp2) {
        this.runde2resesForBp2 = runde2resesForBp2;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByAp1")
    public Set<Runde2res> getRunde2resesForAp1() {
        return this.runde2resesForAp1;
    }
    
    public void setRunde2resesForAp1(Set<Runde2res> runde2resesForAp1) {
        this.runde2resesForAp1 = runde2resesForAp1;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfag")
    public Set<Runde1> getRunde1s() {
        return this.runde1s;
    }
    
    public void setRunde1s(Set<Runde1> runde1s) {
        this.runde1s = runde1s;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfags")
    public Set<Studerende> getStuderendes() {
        return this.studerendes;
    }
    
    public void setStuderendes(Set<Studerende> studerendes) {
        this.studerendes = studerendes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByP2a")
    public Set<Runde1res> getRunde1resesForP2a() {
        return this.runde1resesForP2a;
    }
    
    public void setRunde1resesForP2a(Set<Runde1res> runde1resesForP2a) {
        this.runde1resesForP2a = runde1resesForP2a;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByP1b")
    public Set<Runde1res> getRunde1resesForP1b() {
        return this.runde1resesForP1b;
    }
    
    public void setRunde1resesForP1b(Set<Runde1res> runde1resesForP1b) {
        this.runde1resesForP1b = runde1resesForP1b;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="valgfagByP2b")
    public Set<Runde1res> getRunde1resesForP2b() {
        return this.runde1resesForP2b;
    }
    
    public void setRunde1resesForP2b(Set<Runde1res> runde1resesForP2b) {
        this.runde1resesForP2b = runde1resesForP2b;
    }




}


