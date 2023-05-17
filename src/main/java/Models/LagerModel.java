package Models;
import java.time.LocalDate;

public class LagerModel {
    private String varenummer;
    private double vareMaengde;
    private String enheder;
    private double maxLager;
    private double minLager;
    private double kostPris;
    private double salgsPris;
    private LocalDate sidste_Lagerbev_Dato;
    private LocalDate sidste_Bestillings_dato;
    private double bestiltAntal;
    private  LocalDate lagerOptaltDato;

    public LagerModel() {

    }

    public LagerModel(String varenummer, double vareMaengde, String enheder) {
        this.varenummer = varenummer;
        this.vareMaengde = vareMaengde;
        this.enheder = enheder;
    }

    public String getVarenummer() {
        return varenummer;
    }

    public void setVarenummer(String varenummer) {
        this.varenummer = varenummer;
    }

    public double getVareMaengde() {
        return vareMaengde;
    }

    public void setVareMaengde(double vareMaengde) {

        this.vareMaengde = vareMaengde;
        if (vareMaengde<=0){
            System.out.println("bemærk minus lagerbeholdning");
        }
    }

    public String getEnheder() {
        return enheder;
    }

    public void setEnheder(String enheder) {
        this.enheder = enheder;
    }

    public double getMaxLager() {
        return maxLager;
    }

    public void setMaxLager(double maxLager) {
        this.maxLager = maxLager;
    }

    public double getMinLager() {
        return minLager;
    }

    public void setMinLager(double minLager) {
        this.minLager = minLager;
    }

    public double getKostPris() {
        return kostPris;
    }

    public void setKostPris(double kostPris) {
        this.kostPris = kostPris;
    }

    public double getSalgsPris() {
        return salgsPris;
    }

    public void setSalgsPris(double salgsPris) {
        this.salgsPris = salgsPris;
    }

    public LocalDate getSidste_Lagerbev_Dato() {
        return sidste_Lagerbev_Dato;
    }

    public void setSidste_Lagerbev_Dato(LocalDate sidste_Lagerbev_Dato) {
        this.sidste_Lagerbev_Dato = sidste_Lagerbev_Dato;
    }

    public LocalDate getSidste_Bestillings_dato() {
        return sidste_Bestillings_dato;
    }

    public void setSidste_Bestillings_dato(LocalDate sidste_Bestillings_dato) {
        this.sidste_Bestillings_dato = sidste_Bestillings_dato;
    }

    public double getBestiltAntal() {
        return bestiltAntal;
    }

    public void setBestiltAntal(double bestiltAntal) {
        this.bestiltAntal = bestiltAntal;
    }

    public LocalDate getLagerOptaltDato() {
        return lagerOptaltDato;
    }

    public void setLagerOptaltDato(LocalDate lagerOptaltDato) {
        this.lagerOptaltDato = lagerOptaltDato;
    }

    @Override
    public String toString() {
        return "LagerModel{" +
                "varenummer='" + varenummer + '\'' +
                ", vareMaengde=" + vareMaengde +
                ", enheder='" + enheder + '\'' +
                ", maxLager=" + maxLager +
                ", minLager=" + minLager +
                ", kostPris=" + kostPris +
                ", salgsPris=" + salgsPris +
                ", sidste_Lagerbev_Dato=" + sidste_Lagerbev_Dato +
                ", sidste_Bestillings_dato=" + sidste_Bestillings_dato +
                ", bestiltAntal=" + bestiltAntal +
                ", lagerOptaltDato=" + lagerOptaltDato +
                '}';
    }

    public  void varenummerVisning(){
        System.out.println("Her kommer varenummer visning");
    }

    public  void  lagerTransaktioner(LagerModel trans, double forbrug1){

        trans.setVareMaengde(getVareMaengde()-forbrug1);
        trans.sidste_Lagerbev_Dato= LocalDate.now();
        // gem trans reguleret med forbrug  + regulerings dato
    }

    public  void lagerDataReguleringer(){

    }
}