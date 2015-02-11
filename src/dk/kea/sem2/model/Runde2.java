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
@Table(name = "Runde2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Runde2.findAll", query = "SELECT r FROM Runde2 r"),
    @NamedQuery(name = "Runde2.findByValgfagId", query = "SELECT r FROM Runde2 r WHERE r.valgfagId = :valgfagId"),
    @NamedQuery(name = "Runde2.deleteAll", query = "DELETE FROM Runde2 r WHERE r.valgfagId >:tal"),
    @NamedQuery(name = "Runde2.findByPulje", query = "SELECT r FROM Runde2 r WHERE r.pulje = :pulje")})
public class Runde2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "valgfag_id")
    private Integer valgfagId;
    @Basic(optional = false)
    @Column(name = "pulje")
    private String pulje;
    @JoinColumn(name = "valgfag_id", referencedColumnName = "valgfag_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Valgfag valgfag;

    public Runde2() {
    }

    public Runde2(Integer valgfagId) {
        this.valgfagId = valgfagId;
    }

    public Runde2(Integer valgfagId, String pulje) {
        this.valgfagId = valgfagId;
        this.pulje = pulje;
    }

    public Integer getValgfagId() {
        return valgfagId;
    }

    public void setValgfagId(Integer valgfagId) {
        this.valgfagId = valgfagId;
    }

    public String getPulje() {
        return pulje;
    }

    public void setPulje(String pulje) {
        this.pulje = pulje;
    }

    public Valgfag getValgfag() {
        return valgfag;
    }

    public void setValgfag(Valgfag valgfag) {
        this.valgfag = valgfag;
    }

    @Override
    public String toString() {
        return "electives.Runde2[ valgfagId=" + valgfagId + " ]";
    }
    
}
