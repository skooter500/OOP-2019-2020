package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }


    public int kill() { 
        this.setNumLives(this.getNumLives() - 1);


        if(this.numLives  == 0) {
            System.out.println("Dead");
        }
        else {
            System.out.println("Cat has " + this.numLives);
        }

        return numLives;
    }
}