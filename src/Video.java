public class Video extends Media{
    private String duration;

    public Video(String name, String amountMemory, String duration){
        super(name, amountMemory);
        this.duration = duration;
    }
    public String getDuration() {
        return duration;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name video: " + name);
        System.out.println("Duration of video: " + duration);
        System.out.println("Amount memory of vide: " + amountMemory);
    }
}
