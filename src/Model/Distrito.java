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
@Table(name = "distrito", catalog = "proyectAGCrrhh", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distrito.findAll", query = "SELECT d FROM Distrito d"),
    @NamedQuery(name = "Distrito.findByIdDISTRITO", query = "SELECT d FROM Distrito d WHERE d.idDISTRITO = :idDISTRITO"),
    @NamedQuery(name = "Distrito.findByIdPROVINCIA", query = "SELECT d FROM Distrito d WHERE d.idPROVINCIA = :idPROVINCIA"),
    @NamedQuery(name = "Distrito.findByNombreDistrito", query = "SELECT d FROM Distrito d WHERE d.nombreDistrito = :nombreDistrito"),
    @NamedQuery(name = "Distrito.findByCodigoPostal", query = "SELECT d FROM Distrito d WHERE d.codigoPostal = :codigoPostal")})
public class Distrito implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDISTRITO", nullable = false)
    private Integer idDISTRITO;
    @Basic(optional = false)
    @Column(name = "idPROVINCIA", nullable = false)
    private int idPROVINCIA;
    @Column(name = "Nombre_Distrito", length = 40)
    private String nombreDistrito;
    @Column(name = "Codigo_Postal", length = 40)
    private String codigoPostal;

    public Distrito() {
    }

    public Distrito(Integer idDISTRITO) {
        this.idDISTRITO = idDISTRITO;
    }

    public Distrito(Integer idDISTRITO, int idPROVINCIA) {
        this.idDISTRITO = idDISTRITO;
        this.idPROVINCIA = idPROVINCIA;
    }

    public Integer getIdDISTRITO() {
        return idDISTRITO;
    }

    public void setIdDISTRITO(Integer idDISTRITO) {
        Integer oldIdDISTRITO = this.idDISTRITO;
        this.idDISTRITO = idDISTRITO;
        changeSupport.firePropertyChange("idDISTRITO", oldIdDISTRITO, idDISTRITO);
    }

    public int getIdPROVINCIA() {
        return idPROVINCIA;
    }

    public void setIdPROVINCIA(int idPROVINCIA) {
        int oldIdPROVINCIA = this.idPROVINCIA;
        this.idPROVINCIA = idPROVINCIA;
        changeSupport.firePropertyChange("idPROVINCIA", oldIdPROVINCIA, idPROVINCIA);
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        String oldNombreDistrito = this.nombreDistrito;
        this.nombreDistrito = nombreDistrito;
        changeSupport.firePropertyChange("nombreDistrito", oldNombreDistrito, nombreDistrito);
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        String oldCodigoPostal = this.codigoPostal;
        this.codigoPostal = codigoPostal;
        changeSupport.firePropertyChange("codigoPostal", oldCodigoPostal, codigoPostal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDISTRITO != null ? idDISTRITO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distrito)) {
            return false;
        }
        Distrito other = (Distrito) object;
        if ((this.idDISTRITO == null && other.idDISTRITO != null) || (this.idDISTRITO != null && !this.idDISTRITO.equals(other.idDISTRITO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Distrito[ idDISTRITO=" + idDISTRITO + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
