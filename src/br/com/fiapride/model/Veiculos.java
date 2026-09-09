package br.com.fiapride.model;

public class Veiculos {
    private String individuo;
    private String pl;
    private double gas;
    
    // methods
    public void adicionar(double v) {
        this.setGas(this.gas + v);
    }
    
    public void gasta(double v) {
        if(this.gas < v) {
            System.out.println("[PERIGO]: Esta Consumindo mais que o disponível");
            return;
        }// Gasta mais que o tem no tanque
        
        this.setGas(this.gas - v);
    }
    
    public void printInformacao(){
        System.out.println("Dono: " + this.individuo + " | Placa: " + this.pl + " | Gasolina: " + this.gas);
    }
    
    // Set Methods
    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }
    
    public void setGas(double gas) {
        if(0 > gas) {
            System.out.println("[PERIGO]: gas não pode ser um numero negativo.");
            this.gas = 0;
            return;
        } // O gas não pode ser numero negativo, então retorna 0
        
        this.gas = gas;
    }
    
    public void setPl(String pl) {
        this.pl = pl;
    }
    
    // Get Methods
    
    public String getIndividuo() {
        return this.individuo;
    }
    
    public double getGas() {
        return this.gas;
    }
    
    public String getPl() {
        return this.pl;
    }
}

