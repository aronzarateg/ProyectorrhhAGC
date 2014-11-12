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
@Table(name = "provincia", catalog = "proyectAGCrrhh", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provincia.findAll", query = "SELECT p FROM Provincia p"),
    @NamedQuery(name = "Provincia.findByIdPROVINCIA", query = "SELECT p FROM Provincia p WHERE p.idPROVINCIA = :idPROVINCIA"),
    @NamedQuery(name = "Provincia.findByIdREGION", query = "SELECT p FROM Provincia p WHERE p.idREGION = :idREGION"),
    @NamedQuery(name = "Provincia.findByNombreProvincia", query = "SELECT p FROM Provincia p WHERE p.nombreProvincia = :nombreProvincia")})
public class Provincia implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPROVINCIA", nullable = false)
    private Integer idPROVINCIA;
    @Basic(optional = false)
    @Column(name = "idREGION", nullable = false)
    private int idREGION;
    @Column(name = "Nombre_Provincia", length = 40)
    private String nombreProvincia;

    public Provincia() {
    }

    public Provincia(Integer idPROVINCIA) {
        this.idPROVINCIA = idPROVINCIA;
    }

    public Provincia(Integer idPROVINCIA, int idREGION) {
        this.idPROVINCIA = idPROVINCIA;
        this.idREGION = idREGION;
    }

    public Integer getIdPROVINCIA() {
        return idPROVINCIA;
    }

    public void setIdPROVINCIA(Integer idPROVINCIA) {
        Integer oldIdPROVINCIA = this.idPROVINCIA;
        this.idPROVINCIA = idPROVINCIA;
        changeSupport.firePropertyChange("idPROVINCIA", oldIdPROVINCIA, idPROVINCIA);
    }

    public int getIdREGION() {
        return idREGION;
    }

    public void setIdREGION(int idREGION) {
        int oldIdREGION = this.idREGION;
        this.idREGION = idREGION;
        changeSupport.firePropertyChange("idREGION", oldIdREGION, idREGION);
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        String oldNombreProvincia = this.nombreProvincia;
        this.nombreProvincia = nombreProvincia;
        changeSupport.firePropertyChange("nombreProvincia", oldNombreProvincia, nombreProvincia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPROVINCIA != null ? idPROVINCIA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
        if ((this.idPROVINCIA == null && other.idPROVINCIA != null) || (this.idPROVINCIA != null && !this.idPROVINCIA.equals(other.idPROVINCIA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Provincia[ idPROVINCIA=" + idPROVINCIA + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
