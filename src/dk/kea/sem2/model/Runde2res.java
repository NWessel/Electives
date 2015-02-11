/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.kea.sem2.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nicklas Wessel
 */
@Entity
@Table(name = "Runde2res")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Runde2res.findAll", query = "SELECT r FROM Runde2res r"),
    @NamedQuery(name = "Runde2res.findByEmail", query = "SELECT r FROM Runde2res r WHERE r.email = :email")})
public class Runde2res implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @JoinColumn(name = "bp2", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag bp2;
    @JoinColumn(name = "bp1", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag bp1;
    @JoinColumn(name = "ap2", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag ap2;
    @JoinColumn(name = "ap1", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag ap1;
    @JoinColumn(name = "Email", referencedColumnName = "Email", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Studerende studerende;

    public Runde2res() {
    }

    public Runde2res(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Valgfag getBp2() {
        return bp2;
    }

    public void setBp2(Valgfag bp2) {
        this.bp2 = bp2;
    }

    public Valgfag getBp1() {
        return bp1;
    }

    public void setBp1(Valgfag bp1) {
        this.bp1 = bp1;
    }

    public Valgfag getAp2() {
        return ap2;
    }

    public void setAp2(Valgfag ap2) {
        this.ap2 = ap2;
    }

    public Valgfag getAp1() {
        return ap1;
    }

    public void setAp1(Valgfag ap1) {
        this.ap1 = ap1;
    }

    public Studerende getStuderende() {
        return studerende;
    }

    public void setStuderende(Studerende studerende) {
        this.studerende = studerende;
    }

    @Override
    public String toString() {
        return "electives.Runde2res[ email=" + email + " ]";
    }
    
}
