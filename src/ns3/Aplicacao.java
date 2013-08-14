/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ns3;

import java.awt.Component;

/**
 *
 * @author labteluser
 */
public class Aplicacao {
    private static int qtde = 0;
    private int idAplicacao;
    private String nome;
    private Component no1;
    private Component no2;
    private String tipo;

    private String maxPackets = "0";
    private String interval = "0.1";
    private String packetSize = "0.0";
    private String porta = "1";
    private String iniciar = "0.0";
    private String parar = "0.1";
    private float dataRate;
    
    public Aplicacao(Component no1, Component no2, String tipo){
        setIdAplicacao(Aplicacao.qtde);
        setNome(tipo+"_"+getIdAplicacao());
        setNo1(no1);
        setNo2(no2);
        setTipo(tipo);
        Aplicacao.upQtde();
    }

    public static int getQtde() {
        return qtde;
    }

    public static void setQtde(int cont) {
        Aplicacao.qtde = cont;
    }
    private static void upQtde() {
        Aplicacao.qtde++;
    }

    public String getInterval() {
        return interval;
    }


    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getMaxPackets() {
        return maxPackets;
    }

    public void setMaxPackets(String maxPackets) {
        this.maxPackets = maxPackets;
    }

    public String getPacketSize() {
        return packetSize;
    }

    public void setPacketSize(String packetSize) {
        float ps = Float.parseFloat(packetSize) * 1000;
        this.packetSize = String.valueOf(ps); 
    }

    public int getIdAplicacao() {
        return idAplicacao;
    }

    public void setIdAplicacao(int idAplicacao) {
        this.idAplicacao = idAplicacao;
    }

    public Component getNo1() {
        return no1;
    }

    public void setNo1(Component no1) {
        this.no1 = no1;
    }

    public Component getNo2() {
        return no2;
    }

    public void setNo2(Component no2) {
        this.no2 = no2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIniciar() {
        return iniciar;
    }

    public void setIniciar(String iniciar) {
        this.iniciar = iniciar;
    }

    public String getParar() {
        return parar;
    }

    public void setParar(String parar) {
        this.parar = parar;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public void setDataRate() {       
        dataRate = (Float.parseFloat(maxPackets)/Float.parseFloat(interval))*Float.parseFloat(packetSize);
    }

    public float getDataRate() {
        return dataRate;
    }
    
    
}
