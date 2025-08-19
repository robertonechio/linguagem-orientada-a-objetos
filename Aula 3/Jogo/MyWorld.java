// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Personagem1 personagem1 =  new  Personagem1();
        addObject(personagem1, 59, 203);
        personagem1.getWorld();
        Bomba bomba =  new  Bomba();
        addObject(bomba, 10, 10);
    }
}
