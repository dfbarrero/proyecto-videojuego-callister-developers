/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combate;

import org.newdawn.slick.SlickException;

/**
 *
 * @author victo
 */
public class MagiaLuz1 extends Magia{
    public MagiaLuz1() throws SlickException{
        super(5, 20, new Luz(), "resources/Magia/Luz.png", 100, "Purificar", "resources/sonido/combate/Magia/magic_elect.ogg", 0);

    }
    
}
