public class MainClass {
    public static String[][] str = {
            {"1", "1", "1", "1"},
            {"2", "2", "2", "2"},
            {"3", "3", "3", "3"},
            //{"4", "4", "4", "4"},
            {"5", "5", "5", "5"}
            //{"r", "5", "5", "5"}
    };

   public static void myStringFunc (String[][] str) throws MyArraySizeException, MyArrayDataException {
       int sum = 0;
       if (str.length!=4||str[0].length!=4) throw new MyArraySizeException();

           for (int i = 0; i< 4; i++) {
               for (int j = 0; j < 4; j++) {
                   try {
                       sum += Integer.parseInt(str[i][j]);
                   } catch (NumberFormatException e){
                       throw new MyArrayDataException(i, j);
                   }
               }
           }
           System.out.println("Сумма всех элементов массива = " + sum);

   }


    public static void main(String[] args) {
       try {
           myStringFunc(str);
       } catch (MyArraySizeException e){
           System.out.println("Не корректный размер массива");
       } catch (MyArrayDataException e){
           System.out.println("Неверный формат данных в ячейке [" + e.i + "] " + "[" + e.j + "]");
       } catch (Exception e){
           System.out.println("Еще какая-то ошибка");
       }

    }

}
