public class CardNum {
    // пришло только максимально тупое решение :(
    public static void main(String[] args) {
        String cardNumber = "1234 5678 9012 3456";
        String result = cardNumber.replace("1234 5678 9012", "**** **** **** ****");
        System.out.println(result);
    }
}
