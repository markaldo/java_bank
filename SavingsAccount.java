import java.time.LocalTime;

public class SavingsAccount implements Interest{
    protected double sbalance = 0.00;
    private double interest = 0.20;
    LocalTime tx = LocalTime.now();
    

    @Override
    public void saveMoney(double amnt) {
        this.sbalance += amnt;
    }
    public void saveMoney(int amount){
        double amnt = amount;
        this.sbalance += amnt;
    }

    @Override
    public double takeSavings(double amnt) {
        if(sbalance < amnt){
            savingsMsg2();
            System.out.println("New savings account balance\n"+sbalance);
            double zero = 0.0;
            return zero;
        }
        else{
        this.sbalance -= amnt;
        savingsMsg1();
        return amnt;
        }
    }
    public double takeSavings(int amount){
        double amnt = amount;
        if(sbalance < amnt){
            savingsMsg2();
            System.out.println("New savings account balance\n"+sbalance);
            double zero = 0.0;
            return zero;
        }
        else{
        this.sbalance -= amnt;
        savingsMsg1();
        return amnt;
        }
    }

    public void savingsMsg1(){
        System.out.println("\nSuccessfully transfered to main account...!");
    }
    public void savingsMsg2(){
        System.out.println("\nInsufficient balance in savings account...!");
    }

    @Override
    public double getBonus() {
        LocalTime ty = LocalTime.now();
        if(tx!=ty){
            tx = ty;
            double inst = sbalance * interest;
            sbalance += inst;
            return sbalance;
        }
        else{ 
            return sbalance;
        }
    }
}