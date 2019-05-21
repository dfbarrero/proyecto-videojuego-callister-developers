/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.enemigos;

import Combate.Agua;
import Combate.MagiaAgua1;
import Combate.MagiaRayo1;
import Combate.Rayo;
import chaoschild.Punto;
import org.newdawn.slick.SlickException;

/**
 *
 * @author victo
 */
public class SlimeRayo extends Slime{
    
    public SlimeRayo(int x, int y) throws SlickException {
        super("resources/Enemigos/Slimes/Slime electrico.png", "resources/Pantalla de Batalla/Slimes/Slime rayo.png", "Slime Electrico");
        super.setPosicion(new Punto(x, y));
        super.genHitboxes(new Punto(super.getPosicion().getX()+4, super.getPosicion().getY()+(40)), 40, 14);
        aprenderMagia(new MagiaRayo1());
        setElemento(new Rayo());
    }
    
    
    
}
