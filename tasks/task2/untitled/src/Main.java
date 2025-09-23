import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while(true){
            System.out.println("To add Student data press 1");
            System.out.println("To view data press 2");
            System.out.println("To update data press 3");
            System.out.println("To delete data press 4");
            System.out.println("To Exit press 5");
            System.out.println();
            System.out.println("What Operation you want to Perform");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter Student id");
                    int id  =sc.nextInt();
                    System.out.println("Enter Student Name");
                    String name =sc.next();
                    System.out.println("Enter Student Marks");
                    Double marks  =sc.nextDouble();
                    list.add(new Student(id, name, marks));
                    System.out.println("Student data added succesfully");
                    System.out.println();
                    break;
                case 2:
                    System.out.println(" Available Student List");
                    System.out.println();
                    if(list.isEmpty()){
                        System.out.println("No data available to show");
                    }else{
                        for(Student s: list){
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    System.out.println(" Enter the Student id you want to update");
                    int updateId = sc.nextInt();
                    boolean found = false;
                    for(Student s : list){
                        if(s.getId() == updateId){
                            System.out.println(" Enter the updated Student Name ");
                             s.setName(sc.next());
                            System.out.println(" Enter the updated Student Marks ");
                            s.setMarks(sc.nextDouble());
                             found = true;
                            System.out.println(" Student data updated successfully");
                            System.out.println();
                            break;
                        }

                    }
                    if(!found){
                        System.err.println(" No such id Available");
                    }
                    break;


                case 4:
                    System.out.println(" Enter the Student id you want to delete");
                    int deleteId = sc.nextInt();
                    Student todel = null;
                    for(Student s : list){
                        if(s.getId() == deleteId){
                          todel = s;
                          break;
                        }
                    }
                    if(todel != null){
                        list.remove(todel);
                        System.out.println("Data deleted succesfully");
                    }else{
                        System.err.println("Error while deleting the Student data");
                    }
                    break;
                case 5:
                    System.err.println("You are leaving the site");
                   return;


                default:
                    System.err.println("Enter the correct choice");

            }


        }

    }
}