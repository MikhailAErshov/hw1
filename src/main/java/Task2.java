public class Task2 {
    public static void main(String[] args) {
        int x = 57;
        System.out.println("Двухзначное число " + x + " содержит " + x/10 + " десятков");
        System.out.println("Двухзначное число " + x + " содержит " + x%10 + " единиц");
        int s = x/10 + (x%10);
        System.out.println("Сумма цифр двухзначного числа " + x + " = " + s);
        int p = x/10 * (x%10);
        System.out.println("Произведение цифр двухзначного числа " + x + " = " + p);
    }
}
