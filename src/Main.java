//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        var i='*';
        for (int j = 1; j <= 10; j++) {
                System.out.println(i);
                for (int x = j; x >= 1; x--){
                    System.out.print(i);
                }
        }

    }
}