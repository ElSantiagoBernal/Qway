/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author andre
 */
public class Sandwich implements Cocina {

    protected boolean panIntegral;
    protected boolean panGriego;
    protected boolean panNormal;
    protected boolean carne;
    protected boolean bbq;
    protected boolean cebolla;
    protected boolean jamon;
    protected boolean mayonesa;
    protected boolean pepinillos;
    protected boolean pollo;
    protected boolean queso;
    protected boolean salchicha;
    protected boolean tomate;
    protected boolean lechuga;
    protected boolean rosada;
    protected boolean mostaza;

    public Sandwich() {
        this.panIntegral = false;
        this.panGriego = false;
        this.panNormal = false;
        this.carne = false;
        this.bbq = false;
        this.cebolla = false;
        this.jamon = false;
        this.mayonesa = false;
        this.pepinillos = false;
        this.pollo = false;
        this.queso = false;
        this.salchicha = false;
        this.tomate = false;
        this.lechuga = false;
        this.rosada = false;
        this.mostaza = false;
    }

    @Override
    public boolean isPanIntegral() {
        return panIntegral;
    }

    @Override
    public boolean isPanGriego() {
        return panGriego;
    }

    @Override
    public boolean isPanNormal() {
        return panNormal;
    }

    @Override
    public boolean isCarne() {
        return carne;
    }

    @Override
    public boolean isBBQ() {
        return bbq;
    }

    @Override
    public boolean isCebolla() {
        return cebolla;
    }

    @Override
    public boolean isJamon() {
        return jamon;
    }

    @Override
    public boolean isMayonesa() {
        return mayonesa;
    }

    @Override
    public boolean isPepinillos() {
        return pepinillos;
    }

    @Override
    public boolean isPollo() {
        return pollo;
    }

    @Override
    public boolean isQueso() {
        return queso;
    }

    @Override
    public boolean isSalchicha() {
        return salchicha;
    }

    @Override
    public boolean isTomate() {
        return tomate;
    }

    @Override
    public boolean isLechuga() {
        return lechuga;
    }

    @Override
    public boolean isRosada() {
        return rosada;
    }

    @Override
    public boolean isMostaza() {
        return mostaza;
    }

    @Override
    public void agregarCarne() {
        carne = true;
    }

    @Override
    public void agregarBBQ() {
        bbq = true;
    }

    @Override
    public void agregarCebolla() {
        cebolla = true;
    }

    @Override
    public void agregarJamon() {
        jamon = true;
    }

    @Override
    public void agregarMayonesa() {
        mayonesa = true;
    }

    @Override
    public void agregarPepinillos() {
        pepinillos = true;
    }

    @Override
    public void agregarPollo() {
        pollo = true;
    }

    @Override
    public void agregarQueso() {
        queso = true;
    }

    @Override
    public void agregarSalchicha() {
        salchicha = true;
    }

    @Override
    public void agregarTomate() {
        tomate = true;
    }

    @Override
    public void agregarLechuga() {
        lechuga = true;
    }

    @Override
    public void agregarRosada() {
        rosada = true;
    }

    @Override
    public void agregarMostaza() {
        mostaza = true;
    }

    @Override
    public void agregarPanIntegral() {
        panIntegral = true;
    }

    @Override
    public void agregarPanGriego() {
        panGriego = true;
    }

    @Override
    public void agregarPanNormal() {
        panNormal = true;
    }

}
