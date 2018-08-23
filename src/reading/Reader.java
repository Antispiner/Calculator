package reading;

import java.util.Scanner;

public class Reader implements IReader {
    private String data;
    Scanner scanner = new Scanner(System.in);
    @Override
    public String getInput() {
        return scanner.nextLine();
    }

    public String getData() {
        return data;
    }

    @Override
    public void input_data(IReader input) {
        System.out.println("Please, enter a mathematical example:");
        this.data = input.getInput();
    }
}
