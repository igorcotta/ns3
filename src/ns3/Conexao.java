/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ns3;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author João
 */
public final class Conexao {
    private static int qtde = 0;
    private int idConexao;
    private String nome;
    private Component no1;
    private Component no2;
    private String tipo;
    private Color cor = Color.BLACK;
    
    private float dataRate=0;
    private float delay=0;
    private String ip;
    private String mascara="255.255.255.0";
    private int metrica = 0;
    
    public Conexao(Component no1, Component no2, String tipo){
        setIdConexao(Conexao.qtde);
        setNome(tipo+"_"+getIdConexao());
        //setNome("Conexão "+tipo+" ("+getIdConexao()+")");
        setNo1(no1);
        setNo2(no2);
        setIp("10.1."+getIdConexao()+".0");
        setTipo(tipo);

        Conexao.upQtde();
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
    public static void upQtde(){
        Conexao.qtde++;
    }
    public static void downQtde(){
        Conexao.qtde--;
    }

    public int getIdConexao() {
        return idConexao;
    }

    public void setIdConexao(int cont) {
        idConexao = cont;
    }
    static int getQtde() {
        return qtde;
    }


    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public float getDataRate() {
        return dataRate;
    }

    public void setDataRate(float bitRate) {
        this.dataRate = bitRate;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public int getMetrica() {
        return metrica;
    }

    public void setMetrica(int metrica) {
        this.metrica = metrica;
    }    
    
    
    public int getCsmaIndex(Conexao conexoes[], String ip) {
        int index = 0;
        
        for(int i=0;i<conexoes.length;i++){
            
            if(ip.equals(conexoes[i].getIp())){
                index = i;
                break;
            }
        }

        return index;
    }
    
}
