/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TV;

import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class TV {
    private String marca;
    private Boolean ligada;
    private Integer volume;
    private Integer canal;

    public TV() {
    this.marca = "";
    this.ligada = false;
    this.volume = 10;
    this.canal = 1;
    }
    
    public TV(String marca, Boolean ligada, Integer volume, Integer canal) {
        this.marca = marca;
        this.ligada = ligada;
        this.volume = volume;
        this.canal = canal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getLigada() {
        return ligada;
    }

    public void setLigada(Boolean ligada) {
        this.ligada = ligada;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }
    
    public void aumentar_vol(){
        if (getLigada()){
            if ((this.volume + 5) <= 100 && (this.volume + 5) >= 0){
                setVolume(this.volume + 5);
                System.out.println("Volume atual: " + this.volume);
            } else {
                System.out.println("Volume máximo atingido");
            }
        }
    }

    public void diminuir_vol(){
        if (getLigada()){
            if ((this.volume - 5) <= 100 && (this.volume - 5) >= 0){
                setVolume(this.volume - 5);
                System.out.println("Volume atual: " + this.volume);
            } else {
                System.out.println("Volume mínimo atingido");
            }
        }
    }
    
    public void aumentar_canal(){
        if (getLigada()){
            if ((this.canal + 3) <= 250 && (this.canal + 3) >= 1){
                setCanal(this.canal + 3);
                System.out.println("Canal atual: " + this.canal);    
            } else {
                System.out.println("Canal máximo atingido");
            }
        }
    }
    
    public void diminuir_canal(){
        if (getLigada()){
            if ((this.canal - 3) <= 250 && (this.canal - 3) >= 1){
            setCanal(this.canal - 3);
            System.out.println("Canal atual: " + this.canal);    
            } else {
                System.out.println("Canal mínimo atingido");
            }
        }
    }
    
    public void ligar_desligar(){
        setLigada(!getLigada());
        if(getLigada()){
            System.out.println("TV Ligada!");
        } else {
            System.out.println("TV Desligada!");
        }
    }
}
