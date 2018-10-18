
package mx.edu.cecyt9.ipn.edusite.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;



public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
  
    private Integer iddata;

 
    private String nombre;


    private String aPaterno;

    private String aMaterno;

    private String escuela;

    private String mFavorita;

    private String dFavorito;

    public Data() {
    }

    public Data(Integer iddata) {
        this.iddata = iddata;
    }

    public Integer getIddata() {
        return iddata;
    }

    public void setIddata(Integer iddata) {
        this.iddata = iddata;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAPaterno() {
        return aPaterno;
    }

    public void setAPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getAMaterno() {
        return aMaterno;
    }

    public void setAMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getMFavorita() {
        return mFavorita;
    }

    public void setMFavorita(String mFavorita) {
        this.mFavorita = mFavorita;
    }

    public String getDFavorito() {
        return dFavorito;
    }

    public void setDFavorito(String dFavorito) {
        this.dFavorito = dFavorito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddata != null ? iddata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.iddata == null && other.iddata != null) || (this.iddata != null && !this.iddata.equals(other.iddata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.cecyt9.ipn.edusite.model.Data[ iddata=" + iddata + " ]";
    }
    
}
