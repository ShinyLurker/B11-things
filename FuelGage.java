public class FuelGage
{
    private double fuelAmount;
    private final double FUEL_USAGE = 0.1;
    private double FUEL_CAPACITY;
    private double LOW_FUEL;
    
    public FuelGage(double capacity){
        FUEL_CAPACITY = capacity;
        fuelAmount  = capacity;
        LOW_FUEL = capacity/10;
    }
    
    public double getFuelAmount(){
        return fuelAmount;
    }
    
    public void drive()
    {
        fuelAmount = fuelAmount - FUEL_USAGE;
    }
    
    public boolean isLowFuel(){
        return fuelAmount < LOW_FUEL;
    }
    
    public boolean isEmpty(){
        return fuelAmount <= 0;
    }
    
    public static void main(String[] args)
    {
        FuelGage myGage = new FuelGage(12);
        
        while (!myGage.isEmpty())
        {
            if (myGage.isLowFuel())
                System.out.println("red");
            else
                System.out.println("green");
           
            myGage.drive();
        }
    }
}