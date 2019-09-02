public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int takeDrink(){
        return (volume - 10);
    }
    public int empty(){
        return (volume = 0);
    }

    public int refill(){
        return (volume = 100);
    }
}
