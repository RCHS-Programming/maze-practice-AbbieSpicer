import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @Abbie Spicer
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        super(800, 600, 1); 
        
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge.png"), 25 + 50*i, 12);
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge2.png"), 12, 25 + 50*i);
        for(int i = 0; i < 16; i++)
            addObject(new Wall("edge2.png"), 787, 25 + 50*i);
        
        //Partial wall in the top left of the maze
        for(int i = 0; i < 7; i++)
            addObject(new Wall("edge.png"), 25 + 50*i, 150);
            
        //Partial wall in the bottom left of the maze
        for(int i = 0; i < 7; i++)
            addObject(new Wall("edge.png"), 25 + 50*i, 450);
            
        for(int i = 0; i < 7; i++)
            addObject(new Wall("edge2.png"), 500, 25 + 50*i);
        
        for(int i = 0; i < 7; i++)
            addObject(new Wall("edge2.png"), 675, 50*i + 25);
            
        for(int i = 0; i < 7; i++)
            addObject(new Wall("edge.png"), 25 + 50*i, 300);
    }
}
