import java.util.ArrayList;
import java.util.Scanner;

public class TodoList
{
    static ArrayList<String> items = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice;

        do
        {
            showMenu();

            System.out.println();
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1: addTask(); break;
                case 2: viewTask(); break;
                case 3: deleteTask(); break;
                case 4:
                    System.out.println("Exiting, Goodbye!!!!!"); break;
                default:
                    System.out.println("Invalid choice."); break;
            }
        }while (choice != 4);

        sc.close();
    }

    public static void showMenu()
    {
        System.out.println();
        System.out.println("-----Menu-----");
        System.out.println("1. Add task");
        System.out.println("2. View task");
        System.out.println("3. Delete task");
        System.out.println("4. Exit");
    }

    public static void addTask()
    {
        sc.nextLine();
        String task;
        System.out.println();
        System.out.print("Enter task name : ");
        task = sc.nextLine();

        items.add(task);
        System.out.println("Task added!!!!!");
        System.out.println("--------------------");
    }

    public static void viewTask()
    {
        if(items.isEmpty())
        {
            System.out.println("No tasks to display!!!!!");
            return;
        }
        else
        {
            System.out.println();
            for (int i = 0; i < items.size(); i++)
            {
                System.out.println((i+1) + ". " + items.get(i));
            }
        }
        System.out.println("--------------------");
    }

    public static void deleteTask()
    {
        if(items.isEmpty())
        {
            System.out.println("No tasks to remove!!!!!");
            return;
        }
        int removeIndex;
        viewTask();
        System.out.print("Enter the task to remove : ");
        removeIndex = sc.nextInt();

        if(removeIndex > 0 && removeIndex <= items.size())
        {
            items.remove(removeIndex - 1);
            System.out.println("Task removed!!!!!");
        }
        else
        {
            System.out.println("Invalid task number!!!!!");
        }
        System.out.println("--------------------");

    }
}
