public class Image extends Media{
    private String size;
    public Image(String name, String amountMemoty, String size){
        super(name, amountMemoty);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name image: " + name);
        System.out.println("Amount memory of image: " + amountMemory);
        System.out.println("Size of image: " + size);
    }
}
