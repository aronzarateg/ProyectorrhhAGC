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
 * @author george
 */
@Entity
@Table(name = "perfil", catalog = "proyectagcrrhh", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p"),
    @NamedQuery(name = "Perfil.findByIdPERFIL", query = "SELECT p FROM Perfil p WHERE p.idPERFIL = :idPERFIL"),
    @NamedQuery(name = "Perfil.findByNombrePerfil", query = "SELECT p FROM Perfil p WHERE p.nombrePerfil = :nombrePerfil"),
    @NamedQuery(name = "Perfil.findByEstadoPerfil", query = "SELECT p FROM Perfil p WHERE p.estadoPerfil = :estadoPerfil")})
public class Perfil implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPERFIL", nullable = false)
    private Integer idPERFIL;
    @Column(name = "Nombre_Perfil", length = 40)
    private String nombrePerfil;
    @Column(name = "Estado_Perfil")
    private Character estadoPerfil;

    public Perfil() {
    }

    public Perfil(Integer idPERFIL) {
        this.idPERFIL = idPERFIL;
    }

    public Integer getIdPERFIL() {
        return idPERFIL;
    }

    public void setIdPERFIL(Integer idPERFIL) {
        Integer oldIdPERFIL = this.idPERFIL;
        this.idPERFIL = idPERFIL;
        changeSupport.firePropertyChange("idPERFIL", oldIdPERFIL, idPERFIL);
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        String oldNombrePerfil = this.nombrePerfil;
        this.nombrePerfil = nombrePerfil;
        changeSupport.firePropertyChange("nombrePerfil", oldNombrePerfil, nombrePerfil);
    }

    public Character getEstadoPerfil() {
        return estadoPerfil;
    }

    public void setEstadoPerfil(Character estadoPerfil) {
        Character oldEstadoPerfil = this.estadoPerfil;
        this.estadoPerfil = estadoPerfil;
        changeSupport.firePropertyChange("estadoPerfil", oldEstadoPerfil, estadoPerfil);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPERFIL != null ? idPERFIL.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.idPERFIL == null && other.idPERFIL != null) || (this.idPERFIL != null && !this.idPERFIL.equals(other.idPERFIL))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Perfil[ idPERFIL=" + idPERFIL + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
