abstract class Media {
    protected String name;
    protected String amountMemory;
    public Media(String name, String amountMemory){
        this.name = name;
        this.amountMemory = amountMemory;
    }

    public String getName() {
        return name;
    }

    public String getAmountMemory() {
        return amountMemory;
    }

    public abstract void displayInfo();
}
