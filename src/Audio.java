public class Audio extends Media{
    private String duration;
    public Audio(String name, String amountMemory, String duration){
        super(name, amountMemory);
        this.duration = duration;
    }
    public String getDuration() {
        return duration;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name audio: " + name);
        System.out.println("Duration of audio: " + duration);
        System.out.println("Amount memory of audio: " + amountMemory);
    }
}
