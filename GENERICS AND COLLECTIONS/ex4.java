public class Utility {
    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] name ={"nimal","amal","kamal","namal",};

        Integer[] number = {2,3,4,5};

        //Utility.printArray(name);
        Utility.printArray(number);

    }
}
