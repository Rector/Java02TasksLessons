package taskLesson02;

public class WorkWithExceptions {

    private static int SIZE;
    private static String[][] matrix;

    static {
        SIZE = 4;
        matrix = new String[SIZE][SIZE];
    }

    private static String[][] fillingArray(String s) throws ArrayIndexOutOfBoundsException {
        String[] array = s.split("\n");
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = array[i].split(" ");
        }
        return matrix;
    }

    private static int sumAndDivisionArrayElements(String[][] array) throws NumberFormatException  {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result += Integer.parseInt(array[i][j]);
            }
        }
        result /= 2;
        return result;
    }

    public static void main(String[] args) {
//    1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)
//            10 3 1 2
//            2 3 2 2
//            5 6 7 1
//            300 3 1 0
//      Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
//   2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
//   3. Ваши методы должны бросить исключения в случаях:
//      Если размер матрицы, полученной из строки, не равен 4x4;
//      Если в одной из ячеек полученной матрицы не число; (например символ или слово)
//   4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
//   5. * Написать собственные классы исключений для каждого из случаев              + sumAndDivisionArrayElements(matrix));


        try{
            fillingArray("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0");
            System.out.println("The sum of the elements of the array and dividing the result by two: "
                    + sumAndDivisionArrayElements(matrix));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }


}
