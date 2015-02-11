/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.kea.sem2.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nicklas Wessel
 */
@Entity
@Table(name = "Studerende")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studerende.findAll", query = "SELECT s FROM Studerende s"),
    @NamedQuery(name = "Studerende.findByEmail", query = "SELECT s FROM Studerende s WHERE s.email = :email"),
    @NamedQuery(name = "Studerende.findByNavn", query = "SELECT s FROM Studerende s WHERE s.navn = :navn"),
    @NamedQuery(name = "Studerende.findByHarstemt1", query = "SELECT s FROM Studerende s WHERE s.harstemt1 = :harstemt1"),
    @NamedQuery(name = "Studerende.findByHarstem2", query = "SELECT s FROM Studerende s WHERE s.harstem2 = :harstem2")})
public class Studerende implements Serializable {
    @Column(name = "Harstemt1")
    private Integer harstemt1;
    @Column(name = "Harstem2")
    private Integer harstem2;
    @JoinTable(name = "Finalvalgfag", joinColumns = {
        @JoinColumn(name = "email", referencedColumnName = "Email")}, inverseJoinColumns = {
        @JoinColumn(name = "valgfag_id", referencedColumnName = "valgfag_id")})
    @ManyToMany
    private Collection<Valgfag> valgfagCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Navn")
    private String navn;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "studerende")
    private Runde1res runde1res;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "studerende")
    private Runde2res runde2res;

    public Studerende() {
    }

    public Studerende(String email) {
        this.email = email;
    }

    public Studerende(String email, String navn) {
        this.email = email;
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Runde1res getRunde1res() {
        return runde1res;
    }

    public void setRunde1res(Runde1res runde1res) {
        this.runde1res = runde1res;
    }

    public Runde2res getRunde2res() {
        return runde2res;
    }

    public void setRunde2res(Runde2res runde2res) {
        this.runde2res = runde2res;
    }

    @Override
    public String toString() {
        return "electives.Studerende[ email=" + email + " ]";
    }

    public Integer getHarstemt1() {
        return harstemt1;
    }

    public void setHarstemt1(Integer harstemt1) {
        this.harstemt1 = harstemt1;
    }

    public Integer getHarstem2() {
        return harstem2;
    }

    public void setHarstem2(Integer harstem2) {
        this.harstem2 = harstem2;
    }

    @XmlTransient
    public Collection<Valgfag> getValgfagCollection() {
        return valgfagCollection;
    }

    public void setValgfagCollection(Collection<Valgfag> valgfagCollection) {
        this.valgfagCollection = valgfagCollection;
    }
    
}
