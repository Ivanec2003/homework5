public class SearchObject<T> implements Search<T> {
    @Override
    public void search(Object[] array, Object search) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == search){
                System.out.println("Element was searched, his index: " + i);
            }
        }
    }
}
