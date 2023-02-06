public class Main {
    public static void main(String[] args) {
    double cardBalance = 5000;
    double interestRate = 0.17;
    double interestMonth1;
    double interestMonth2;
    interestMonth1 = cardBalance * interestRate;
    interestMonth2 = (interestMonth1 + cardBalance) * interestRate;
        System.out.println("The interest for the first month is " + interestMonth1 + " and the interest for the second month is " + interestMonth2 );




    }
}