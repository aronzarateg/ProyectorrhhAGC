/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dka
 */
@Entity
@Table(name = "region", catalog = "proyectAGCrrhh", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r"),
    @NamedQuery(name = "Region.findByIdREGION", query = "SELECT r FROM Region r WHERE r.idREGION = :idREGION"),
    @NamedQuery(name = "Region.findByNombreRegion", query = "SELECT r FROM Region r WHERE r.nombreRegion = :nombreRegion")})
public class Region implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idREGION", nullable = false)
    private Integer idREGION;
    @Column(name = "Nombre_Region", length = 40)
    private String nombreRegion;

    public Region() {
    }

    public Region(Integer idREGION) {
        this.idREGION = idREGION;
    }

    public Integer getIdREGION() {
        return idREGION;
    }

    public void setIdREGION(Integer idREGION) {
        Integer oldIdREGION = this.idREGION;
        this.idREGION = idREGION;
        changeSupport.firePropertyChange("idREGION", oldIdREGION, idREGION);
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        String oldNombreRegion = this.nombreRegion;
        this.nombreRegion = nombreRegion;
        changeSupport.firePropertyChange("nombreRegion", oldNombreRegion, nombreRegion);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idREGION != null ? idREGION.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.idREGION == null && other.idREGION != null) || (this.idREGION != null && !this.idREGION.equals(other.idREGION))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Region[ idREGION=" + idREGION + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
