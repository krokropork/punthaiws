package th.co.ptg.punthai.entities;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by user on 24/4/2560.
 */
@Entity
@Immutable
@Embeddable
@Table(name = "V_GL001_PUN_INTERFACE_COST", schema = "POS_HQ_PROD")
public class VGl001PunInterfaceCostEntity implements Serializable {

    private Long id;
    private Long no;
    private String bukrs;
    private String blart;
    private String bldat;
    private String budat;
    private String waers;
    private String xblnr;
    private String bktxt;
    private String shopId;
    private String bschl;
    private String gkont;
    private Long wsl;
    private Long hsl;
    private Long ksl;
    private String rbusa;
    private Long lbkum;
    private String runit;
    private String zuonr;
    private String sgtxt;
    private String kokrs;
    private String compCode;
    private String gsber;
    private String artnr;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NO", nullable = true, precision = 0)
    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    @Basic
    @Column(name = "BUKRS", nullable = true, length = 4)
    public String getBukrs() {
        return bukrs;
    }

    public void setBukrs(String bukrs) {
        this.bukrs = bukrs;
    }

    @Basic
    @Column(name = "BLART", nullable = true, length = 4)
    public String getBlart() {
        return blart;
    }

    public void setBlart(String blart) {
        this.blart = blart;
    }

    @Basic
    @Column(name = "BLDAT", nullable = true, length = 10)
    public String getBldat() {
        return bldat;
    }

    public void setBldat(String bldat) {
        this.bldat = bldat;
    }

    @Basic
    @Column(name = "BUDAT", nullable = true, length = 10)
    public String getBudat() {
        return budat;
    }

    public void setBudat(String budat) {
        this.budat = budat;
    }

    @Basic
    @Column(name = "WAERS", nullable = true, length = 5)
    public String getWaers() {
        return waers;
    }

    public void setWaers(String waers) {
        this.waers = waers;
    }

    @Basic
    @Column(name = "XBLNR", nullable = true, length = 16)
    public String getXblnr() {
        return xblnr;
    }

    public void setXblnr(String xblnr) {
        this.xblnr = xblnr;
    }

    @Basic
    @Column(name = "BKTXT", nullable = true, length = 25)
    public String getBktxt() {
        return bktxt;
    }

    public void setBktxt(String bktxt) {
        this.bktxt = bktxt;
    }

    @Basic
    @Column(name = "SHOP_ID", nullable = true, length = 50)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "BSCHL", nullable = true, length = 2)
    public String getBschl() {
        return bschl;
    }

    public void setBschl(String bschl) {
        this.bschl = bschl;
    }

    @Basic
    @Column(name = "GKONT", nullable = true, length = 10)
    public String getGkont() {
        return gkont;
    }

    public void setGkont(String gkont) {
        this.gkont = gkont;
    }

    @Basic
    @Column(name = "WSL", nullable = true, precision = 2)
    public Long getWsl() {
        return wsl;
    }

    public void setWsl(Long wsl) {
        this.wsl = wsl;
    }

    @Basic
    @Column(name = "HSL", nullable = true, precision = 2)
    public Long getHsl() {
        return hsl;
    }

    public void setHsl(Long hsl) {
        this.hsl = hsl;
    }

    @Basic
    @Column(name = "KSL", nullable = true, precision = 2)
    public Long getKsl() {
        return ksl;
    }

    public void setKsl(Long ksl) {
        this.ksl = ksl;
    }

    @Basic
    @Column(name = "RBUSA", nullable = true, length = 4)
    public String getRbusa() {
        return rbusa;
    }

    public void setRbusa(String rbusa) {
        this.rbusa = rbusa;
    }

    @Basic
    @Column(name = "LBKUM", nullable = true, precision = 2)
    public Long getLbkum() {
        return lbkum;
    }

    public void setLbkum(Long lbkum) {
        this.lbkum = lbkum;
    }

    @Basic
    @Column(name = "RUNIT", nullable = true, length = 50)
    public String getRunit() {
        return runit;
    }

    public void setRunit(String runit) {
        this.runit = runit;
    }

    @Basic
    @Column(name = "ZUONR", nullable = true, length = 10)
    public String getZuonr() {
        return zuonr;
    }

    public void setZuonr(String zuonr) {
        this.zuonr = zuonr;
    }

    @Basic
    @Column(name = "SGTXT", nullable = true, length = 50)
    public String getSgtxt() {
        return sgtxt;
    }

    public void setSgtxt(String sgtxt) {
        this.sgtxt = sgtxt;
    }

    @Basic
    @Column(name = "KOKRS", nullable = true, length = 4)
    public String getKokrs() {
        return kokrs;
    }

    public void setKokrs(String kokrs) {
        this.kokrs = kokrs;
    }

    @Basic
    @Column(name = "COMP_CODE", nullable = true, length = 4)
    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    @Basic
    @Column(name = "GSBER", nullable = true, length = 4)
    public String getGsber() {
        return gsber;
    }

    public void setGsber(String gsber) {
        this.gsber = gsber;
    }

    @Basic
    @Column(name = "ARTNR", nullable = true, length = 50)
    public String getArtnr() {
        return artnr;
    }

    public void setArtnr(String artnr) {
        this.artnr = artnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VGl001PunInterfaceCostEntity that = (VGl001PunInterfaceCostEntity) o;

        if (no != null ? !no.equals(that.no) : that.no != null) return false;
        if (bukrs != null ? !bukrs.equals(that.bukrs) : that.bukrs != null) return false;
        if (blart != null ? !blart.equals(that.blart) : that.blart != null) return false;
        if (bldat != null ? !bldat.equals(that.bldat) : that.bldat != null) return false;
        if (budat != null ? !budat.equals(that.budat) : that.budat != null) return false;
        if (waers != null ? !waers.equals(that.waers) : that.waers != null) return false;
        if (xblnr != null ? !xblnr.equals(that.xblnr) : that.xblnr != null) return false;
        if (bktxt != null ? !bktxt.equals(that.bktxt) : that.bktxt != null) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (bschl != null ? !bschl.equals(that.bschl) : that.bschl != null) return false;
        if (gkont != null ? !gkont.equals(that.gkont) : that.gkont != null) return false;
        if (wsl != null ? !wsl.equals(that.wsl) : that.wsl != null) return false;
        if (hsl != null ? !hsl.equals(that.hsl) : that.hsl != null) return false;
        if (ksl != null ? !ksl.equals(that.ksl) : that.ksl != null) return false;
        if (rbusa != null ? !rbusa.equals(that.rbusa) : that.rbusa != null) return false;
        if (lbkum != null ? !lbkum.equals(that.lbkum) : that.lbkum != null) return false;
        if (runit != null ? !runit.equals(that.runit) : that.runit != null) return false;
        if (zuonr != null ? !zuonr.equals(that.zuonr) : that.zuonr != null) return false;
        if (sgtxt != null ? !sgtxt.equals(that.sgtxt) : that.sgtxt != null) return false;
        if (kokrs != null ? !kokrs.equals(that.kokrs) : that.kokrs != null) return false;
        if (compCode != null ? !compCode.equals(that.compCode) : that.compCode != null) return false;
        if (gsber != null ? !gsber.equals(that.gsber) : that.gsber != null) return false;
        if (artnr != null ? !artnr.equals(that.artnr) : that.artnr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = no != null ? no.hashCode() : 0;
        result = 31 * result + (bukrs != null ? bukrs.hashCode() : 0);
        result = 31 * result + (blart != null ? blart.hashCode() : 0);
        result = 31 * result + (bldat != null ? bldat.hashCode() : 0);
        result = 31 * result + (budat != null ? budat.hashCode() : 0);
        result = 31 * result + (waers != null ? waers.hashCode() : 0);
        result = 31 * result + (xblnr != null ? xblnr.hashCode() : 0);
        result = 31 * result + (bktxt != null ? bktxt.hashCode() : 0);
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (bschl != null ? bschl.hashCode() : 0);
        result = 31 * result + (gkont != null ? gkont.hashCode() : 0);
        result = 31 * result + (wsl != null ? wsl.hashCode() : 0);
        result = 31 * result + (hsl != null ? hsl.hashCode() : 0);
        result = 31 * result + (ksl != null ? ksl.hashCode() : 0);
        result = 31 * result + (rbusa != null ? rbusa.hashCode() : 0);
        result = 31 * result + (lbkum != null ? lbkum.hashCode() : 0);
        result = 31 * result + (runit != null ? runit.hashCode() : 0);
        result = 31 * result + (zuonr != null ? zuonr.hashCode() : 0);
        result = 31 * result + (sgtxt != null ? sgtxt.hashCode() : 0);
        result = 31 * result + (kokrs != null ? kokrs.hashCode() : 0);
        result = 31 * result + (compCode != null ? compCode.hashCode() : 0);
        result = 31 * result + (gsber != null ? gsber.hashCode() : 0);
        result = 31 * result + (artnr != null ? artnr.hashCode() : 0);
        return result;
    }


}
