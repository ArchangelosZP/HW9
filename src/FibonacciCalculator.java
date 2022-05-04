import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciCalculator {

        static Scanner scanner = new Scanner(System.in);

        public void calcM() {
            System.out.println("Введите порядковый номер в ряду Фибоначи или же введите exit для выхода");
            String text = scanner.nextLine();
            if ("exit".equals(text)) {
                return;
            }
            try {
                System.out.println("Числов в ряду Фибоначи с номером "+text+" равно: "+make(text));
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                calcM();
            }
            calcM();
        }

        public int make(String s) {
            int n;
            int i=0;
            ArrayList<Integer> arrFib = new ArrayList<>();
            n = Integer.parseInt(s);
            while (i<=n){
                if (i==0){arrFib.add(0);}
                if (i==1){arrFib.add(1);}
                if (i>1){arrFib.add(arrFib.get(i-1)+arrFib.get(i-2));}
                i++;
            }
            return arrFib.get(n);
        }
}
