// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Abelha extends Actor
{
    private int tipoAbelha = Greenfoot.getRandomNumber(2);
    private int velocidade = 2;

    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (tipoAbelha == 0) {
            if (getX() >= 599) {
                setLocation(0, Greenfoot.getRandomNumber(599));
            }
            else {
                setLocation(getX() + velocidade, getY());
            }
        }
        if (tipoAbelha == 1) {
            if (getY() >= 399) {
                setLocation(Greenfoot.getRandomNumber(399), 0);
            }
            else {
                setLocation(getX(), getY() + velocidade);
            }
            if (getRotation() == 0) {
                turn(90);
            }
        }
        if (isTouching(Personagem1.class)) {
            if (tipoAbelha == 0) {
                setLocation(0, Greenfoot.getRandomNumber(599));
            }
            if (tipoAbelha == 1) {
                setLocation(Greenfoot.getRandomNumber(399), 0);
            }
        }
    }
}
