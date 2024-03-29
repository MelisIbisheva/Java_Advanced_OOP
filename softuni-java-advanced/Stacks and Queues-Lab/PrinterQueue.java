package stack_and_queues_lec;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String fileName = scanner.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        while (!fileName.equals("print")){

            if(fileName.equals("cancel")){
                if(printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    String firsInQueue = printerQueue.poll();
                    System.out.println("Canceled "+ firsInQueue);
                }

            }else {
                printerQueue.offer(fileName);
            }

            fileName = scanner.nextLine();
        }
        while (!printerQueue.isEmpty()){
            System.out.println(printerQueue.poll());
        }
    }
}
