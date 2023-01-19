import java.util.Scanner;
import java.util.ArrayList;

public class Duke {
    public static void main(String[] args) {
//        String logo = " ____        _        \n"
//                + "|  _ \\ _   _| | _____ \n"
//                + "| | | | | | | |/ / _ \\\n"
//                + "| |_| | |_| |   <  __/\n"
//                + "|____/ \\__,_|_|\\_\\___|\n";
//        System.out.println("Hello from\n" + logo);
          System.out.println("Hello! I'm Duke\nWhat can I do for you?");
          Scanner userInputObj = new Scanner(System.in);
          ArrayList<Task> storage = new ArrayList<Task>();
          String userInput = "";
          while (!userInput.equals("bye")) {
              userInput = userInputObj.nextLine();
              if (userInput.equals("list")) {
                  for (int i = 0; i < storage.size(); i++) {
                      System.out.println((i + 1) + ".[" + storage.get(i).getStatusIcon() + "] " + storage.get(i).description);
                  }
              } else if (userInput.contains("mark") && userInput.substring(0,4).equals("mark")) {
                  int position = Integer.valueOf(userInput.substring(5));
                  storage.get(position - 1).markAsDone();
                  System.out.println("Nice! I've marked this task as done:\n" + "[" + storage.get(position - 1).getStatusIcon() + "] " + storage.get(position - 1).description);
              } else if (userInput.contains("unmark") && userInput.substring(0,6).equals("unmark")) {
                  int position = Integer.valueOf(userInput.substring(7));
                  storage.get(position - 1).markAsNotDone();
                  System.out.println("OK, I've marked this task as not done yet:\n" + "[" + storage.get(position - 1).getStatusIcon() + "] " + storage.get(position - 1).description);
              } else {
                  Task userInputTask = new Task(userInput);
                  storage.add(userInputTask);
                  System.out.println("added: " + userInput);
              }
          }
          System.out.println("Bye. Hope to see you again soon!");
    }
}
