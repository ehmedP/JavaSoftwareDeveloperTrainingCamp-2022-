package tasks.Section_37.BasecrediManager;

public class BasecrediManager {

    private int crediLimit = 5000;
    
    public void Hesabla() {
        System.out.println(this.crediLimit);
        System.out.println("Kredit hesablandi.");
    }

    public int getCrediLimit() { return this.crediLimit; }
    public void setCrediLimit(int crediLimit) { this.crediLimit = crediLimit; }

}
