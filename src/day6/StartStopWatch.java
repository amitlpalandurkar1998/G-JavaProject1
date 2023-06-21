package day6;

import java.util.Scanner;

public class StartStopWatch {
    private long START_STOPWATCH ;
    private long END_STOPWATCH ;
    private boolean IS_RUNNING;

    public void Start() {

        //Use to Start the StopWatch.
        START_STOPWATCH=  System.currentTimeMillis();
        IS_RUNNING=true;

        System.out.println("Stopwatch started.");
    }
    public void End(){
        //Use to Stop the StopWatch.
        if (IS_RUNNING){

            END_STOPWATCH = System.currentTimeMillis();
            IS_RUNNING=false;

            //Logic
            long time = ((END_STOPWATCH-START_STOPWATCH)/1000);

            System.out.println("Stopwatch stopped.");
            System.out.println("Elapsed time: " + time + " seconds");
        }
    }

    public static void main(String[] args) {
        StartStopWatch startStopWatch =new StartStopWatch();
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (i<=1){

            //Get the input From User.Store in inputForStrat variable.
            System.out.print("Press 's' to start the stopwatch : ");
            char inputForStrat = scanner.next().toLowerCase().charAt(0);

            if (inputForStrat=='s'){

                startStopWatch.Start();

                while (true){

                    //Get the input From User.Store in inputEnd variable.
                    System.out.print("Press 'e' to Stop the stopwatch And Watch The Time. : ");
                    char inputEnd = scanner.next().toLowerCase().charAt(0);

                    if (inputEnd=='e'){
                        startStopWatch.End();
                        break;
                    }else {
                        System.out.println("Invalid Input .......!");
                    }
                }
                i++;
            }else {
                System.out.println("Invalid Input .......!");
            }

        }

    }
}
