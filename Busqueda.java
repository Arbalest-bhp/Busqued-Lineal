public class Busqueda{

    //Search list
    public static int searchList(int[] numbers, int targetNumber){
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == targetNumber) {
                return index;
            }
        }
        return -1;
    }

}