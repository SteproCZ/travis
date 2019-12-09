/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

/**
 *
 * @author st52565
 */
public class Osoba {
    int vek;
    double vaha;
    int iq;
    String jmeno;

    public Osoba(int vek, double vaha, int iq, String jmeno) {
        this.vek = vek;
        this.vaha = vaha;
        this.iq = iq;
        this.jmeno = jmeno;
    }

    public int getVek() {
        return vek;
    }

    public double getVaha() {
        return vaha;
    }

    public int getIq() {
        return iq;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "Osoba{" + "vek=" + vek + ", vaha=" + vaha + ", iq=" + iq + ", jmeno=" + jmeno + '}';
    }
    
    
    
}
