package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args, HourContract HourContract) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner entry = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Enter departament`s name: "); 
        String departament = entry.nextLine();
        System.out.println("Enter work data: ");
        System.out.println("Nmae: ");
        String workerName = entry.nextLine();
        System.out.println("Level: ");
        String workerLevel = entry.nextLine();
        System.err.println("Base salary: ");
        double baseSalary = entry.nextDouble();

        Worker worker = new Worker(workerName, baseSalary, WorkerLevel.valueOf(workerLevel), new Department(departament));

        System.err.println("How many contracts to this worker? ");
        int n = entry.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(entry.next());
            System.err.println("Value per hour: ");
            double valuePerHour = entry.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = entry.nextInt();
            HourContract contract= new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        entry.close();
    }
}

