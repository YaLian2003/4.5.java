import java.util.Scanner;

public class QueueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new Queue<>();
        boolean continueFlag;

        do {
            System.out.print("Input a list of items to be placed into a queue: ");
            String input = scanner.nextLine();
            String[] items = input.split("\\s+");

            for (String item : items) {
                queue.enqueue(item);
            }

            System.out.print("Input the item that is to be moved to the back: ");
            String itemToMove = scanner.nextLine();
            queue.moveToBack(itemToMove);

            System.out.println("Items in queue after one item was moved to the back: " + queue);

            System.out.print("Do you want to continue (y/n): ");
            String answer = scanner.nextLine();
            continueFlag = answer.equalsIgnoreCase("y");

            // Clear the queue for the next iteration
            while (!queue.isEmpty()) {
                queue.dequeue();
            }
        } while (continueFlag);

        scanner.close();
    }
}
