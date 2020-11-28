package ca.durhamcollege;
import  java.util.Random;

public class RandomVector
{
    private Random m_rand;
    //step1: private static instance
    private static RandomVector m_instance = null;

    //step:2 default constructor private
    private RandomVector()
    {
        m_rand = new Random();
    }

    //step3: create a public instance method that acts as portal
    public  static RandomVector Instance()
    {
        if(m_instance == null)
        {
            m_instance = new RandomVector();
        }
        return  m_instance;
    }


    public static Vector2D createVector2D(Vector2D start, Vector2D end)
    {
        Random rand = new Random();

        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float randomX = (rand.nextFloat() * maxX - minX) + minX;

        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());
        float randomY = (rand.nextFloat() * maxY - minY) + minY;

        return  new Vector2D(randomX, randomY);

    }
}
