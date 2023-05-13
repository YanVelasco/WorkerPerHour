package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter departament`s name: "); 
        String departament = entry.nextLine();
        System.out.println("Enter work data: ");
        System.out.println("Nmae: ");
        String workerName = entry.nextLine();
        System.out.println("Level: ");
        String workerLevel = entry.nextLine();
        System.err.println("Base salary: ");
        double baseSalary = entry.nextDouble();

        Worker work = new Worker(workerName, baseSalary, WorkerLevel.valueOf(workerLevel), new Department(departament));
        System.out.println(work);


        entry.close();
    }
}
