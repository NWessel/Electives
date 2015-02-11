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
@Table(name = "Runde1res")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Runde1res.findAll", query = "SELECT r FROM Runde1res r"),
    @NamedQuery(name = "Runde1res.findByEmail", query = "SELECT r FROM Runde1res r WHERE r.email = :email")})
public class Runde1res implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @JoinColumn(name = "p2b", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag p2b;
    @JoinColumn(name = "p1b", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag p1b;
    @JoinColumn(name = "p2a", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag p2a;
    @JoinColumn(name = "p1a", referencedColumnName = "valgfag_id")
    @ManyToOne(optional = false)
    private Valgfag p1a;
    @JoinColumn(name = "Email", referencedColumnName = "Email", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Studerende studerende;

    public Runde1res() {
    }

    public Runde1res(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Valgfag getP2b() {
        return p2b;
    }

    public void setP2b(Valgfag p2b) {
        this.p2b = p2b;
    }

    public Valgfag getP1b() {
        return p1b;
    }

    public void setP1b(Valgfag p1b) {
        this.p1b = p1b;
    }

    public Valgfag getP2a() {
        return p2a;
    }

    public void setP2a(Valgfag p2a) {
        this.p2a = p2a;
    }

    public Valgfag getP1a() {
        return p1a;
    }

    public void setP1a(Valgfag p1a) {
        this.p1a = p1a;
    }

    public Studerende getStuderende() {
        return studerende;
    }

    public void setStuderende(Studerende studerende) {
        this.studerende = studerende;
    }

    @Override
    public String toString() {
        return "electives.Runde1res[ email=" + email + " ]";
    }
    
}
