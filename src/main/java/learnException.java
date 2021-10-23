public class learnException {


    public static void main(String[] args) {

        String[][] array = new String[4][4];
        try {
            array[1][1] = "fd";
            createArray(array);


        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        } finally {
            System.out.println("конец");
        }
    }

    // Метод, в котором на входе подаётся двухмерный строковый массив размером 4х4
    public static void createArray(String[][] array) throws MyArraySizeException {
        int finalIndex = 4;
        System.out.println("Метод, в котором на входе подаётся двухмерный строковый массив размером 4х4");
        for (int i = 0; i < finalIndex; i++) {
            if (array[i].length > finalIndex | array.length > finalIndex) {
                throw new MyArraySizeException("Двухмерный массив не может быть размером больше чем 4х4");
            }
        }
        int sum = 0;

        for (String[] str : array) {
            for (String element : str) {
                if (element == null) {
                    element = "1";
                }
                if (isNumber(element)) {
                    sum += Integer.parseInt(element);
                }

            }
        }
        System.out.println(sum);
    }

    public static boolean isNumber(String s) throws MyArrayDataException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Эта строка из массива не может преобразоваться в число: " + s);
        }

    }
}


    








