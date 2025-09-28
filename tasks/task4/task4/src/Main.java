import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String notes_file = "notes.txt";

    public static void  addnotes(Scanner sc){
        System.out.println("Enter note");
        String note= sc.next();

        try( FileWriter fw= new FileWriter(notes_file)){
            fw.write(note);
            System.out.println("");
            System.out.println("Note added succesfully!");
        } catch (IOException e) {
            throw new RuntimeException("exception white writing note"+e.getMessage());
        }

    }
    public static void  viewnotes(Scanner sc){
        System.out.println("All Available note");
        String read;
        try(BufferedReader reader = new BufferedReader(new FileReader(notes_file))){
            boolean empty = true;
            while((read = reader.readLine())!= null){
                System.out.println(read);
                empty = false;
            }if(empty){
                System.out.println("no data to read ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }


    }

    public static void main(String[] args) {

        while(true){


        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to add notes");
        System.out.println("press 2 to view existing notes");
        System.out.println("press 3 to exit");

        int ch = sc.nextInt();



        switch (ch){
            case 1:
                addnotes(sc);
                break;
            case 2:
                viewnotes(sc);
                break;

            case 3:
                System.out.println("u r leaving byeeeeeeeeeeee");
                return;
            default:
                System.out.println("Enter correct choice");

        }
        }

    }
}