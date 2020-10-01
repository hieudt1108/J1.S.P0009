
public class Main {

    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci");
        fibonanci.fibonnaciRecursive(0, 1, 0, 1);

    }



}

class fibonanci{
        public static int fibonnaciRecursive(int term, int lower, int higher, int count) {
        if (term == 45) {
            return 0;
        } else if (term == 44) {
            System.out.print("Stt" + count + " : ");
            System.out.print(higher);
            System.out.println("");
            return fibonnaciRecursive(term + 1, higher, higher + lower, count + 1);
        }
        System.out.print("Stt" + count + " : ");
        System.out.print(higher);
        System.out.println("");
//       ` System.out.print(",");
        return fibonnaciRecursive(term + 1, higher, higher + lower, count + 1);
    }
}