import java.io.*;
import java.util.*;




public class Project {
    public static void main(String[] args){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Email:- sudhanshulokhande786@gamil.com     -> Coded By Sudhanshu Lokhande  <-   ");

        System.out.println("                 ** Welcome To The LockersMe.com **                  ");
        System.out.println("---------------------------------------------------------------------");
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Main Menu ");
            System.out.println("");
            System.out.println("1.List all Files \n2.Business Level Operations \n3.Close Application");
            System.out.println("");
            try {
                System.out.print("Enter the choice : ");
                choice = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Please Enter Numeric value!!!");
            }
            switch (choice) {
                case 1: {
                    System.out.println("----------------------------------------------------");
                    File rep = new File("C:\\Users\\ACER");
                    System.out.println("Showing all files in directory ");
                    System.out.println("");
                    File directory[] = rep.listFiles();
                    Arrays.sort(directory);
                    for (File f : directory) {
                        if (f.isFile()) {
                            System.out.println("File : " + f.getName());
                        } else if (f.isDirectory()) {
                            System.out.println("Directory : " + f.getName());
                        } else {
                            System.out.println("Unkown : " + f.getName());
                        }

                    }

                    System.out.println("----------------------------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("----------------------------------------------------");
                    int input=0;
                    do {
                        System.out.println("1.Add File \n2.Delete File \n3.Search File \n4.Return to Main Menu");
                        System.out.println("");
                        try {
                            System.out.print("Enter the choice : ");
                            input = sc.nextInt();
                        }catch (InputMismatchException e){
                            System.out.println("Please Enter Numeric value!!!");
                        }
                        switch (input){
                            case 1: {
                                System.out.println("----------------------------------------------------");
                                System.out.print("Enter the file name : ");
                                String s = sc.next();
                                File Myfile = new File("C:\\Users\\ACER\\" + s);
                                try {
                                    if (Myfile.isFile()) {
                                        System.out.println("File already exist");
                                    } else {
                                        Myfile.createNewFile();
                                        System.out.println("File Saved");
                                    }

                                } catch (Exception e) {
                                    System.out.println("Unable to create a file");
                                    e.printStackTrace();
                                }
                                System.out.println("----------------------------------------------------");
                                break;
                            }
                            case 2: {
                                System.out.println("----------------------------------------------------");
                                try {
                                    System.out.print("Enter file name for deletion : ");
                                    String S = sc.next();
                                    File s = new File("C:\\Users\\ACER\\" + S);
                                    if (s.delete()) {
                                        System.out.println("File deleted successfully");
                                    } else {
                                        System.out.println("Error occurred during deletion");
                                    }
                                    System.out.println("----------------------------------------------------");
                                } catch (Exception e) {
                                    System.out.println("Error occurred");
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("----------------------------------------------------");
                                File s = new File("C:\\Users\\ACER\\");
                                System.out.print("Enter file name to search : ");
                                Scanner se = new Scanner(System.in);
                                String S = se.next();
                                String[] flist = s.list();
                                int flag = 0;
                                if (flist == null) {
                                    System.out.println("Empty directory");
                                } else {
                                    for (int i = 0; i < flist.length; i++) {
                                        String filename = flist[i];
                                        if (filename.equalsIgnoreCase(S)) {
                                            System.out.println(filename + " found");
                                            flag = 1;
                                        }
                                    }
                                    if (flag == 0) {
                                        System.out.println("File Not Found");
                                    }
                                    System.out.println("----------------------------------------------------");
                                    break;
                                }
                            }
                            case 4: {
                                break;
                            }
                            default:
                                System.out.println("----------------------------------------------------");
                                System.out.println("Invalid Input");
                                System.out.println("----------------------------------------------------");

                        }


                    } while (input != 4);
                }
                case 3: {
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }


        }while(choice != 3);

    }
}
