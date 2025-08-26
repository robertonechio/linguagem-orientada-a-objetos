// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Bomba extends Actor
{
    private int tipoBomba;
    private int velocidade = 2;

    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        tipoBomba = Greenfoot.getRandomNumber(3);
        if (tipoBomba == 1) {
            if (getX() >= 599) {
                setLocation(0, Greenfoot.getRandomNumber(400));
                velocidade = velocidade + 1;
            }
            else {
                setLocation(getX() + velocidade, getY());
            }
        }
        if (tipoBomba == 2) {
            if (getY() >= 399) {
                setLocation(Greenfoot.getRandomNumber(399), 0);
            }
            else {
                setLocation(getX(), getY() + velocidade);
            }
        }
        if (isTouching(Personagem1.class)) {
        }
    }
}
