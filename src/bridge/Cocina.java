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
public interface Cocina {
    
    boolean isPanIntegral();
    boolean isPanGriego();
    boolean isPanNormal();
    boolean isCarne();
    boolean isBBQ();
    boolean isCebolla();
    boolean isJamon();
    boolean isMayonesa();
    boolean isPepinillos();
    boolean isPollo();
    boolean isQueso();
    boolean isSalchicha();
    boolean isTomate();
    boolean isLechuga();
    boolean isRosada();
    boolean isMostaza();
    
    void agregarPanIntegral();
    
    void agregarPanGriego();
    
    void agregarPanNormal();

    void agregarCarne();
    
    void agregarBBQ();
    
    void agregarCebolla();
    
    void agregarJamon();
    
    void agregarMayonesa();
    
    void agregarPepinillos();
    
    void agregarPollo();
    
    void agregarQueso();
    
    void agregarSalchicha();
    
    void agregarTomate();
    
    void agregarLechuga();
    
    void agregarRosada();
    
    void agregarMostaza();  

}
