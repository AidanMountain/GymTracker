import java.util.Scanner;
public class main {
    private static int choice, timeOfDay, time, section, population, cardioPopulation, benchPressPopulation, squatRackPopulation, freeWeightPopulation, backMachinePopulation;
    private static int sixAM, sevenAM, eightAM, nineAM, tenAM, elevenAM, twelvePM, onePM, twoPM, threePM, fourPM, fivePM, sixPM, sevenPM, eightPM, ninePM, tenPM, elevenPM;
    public static void main(String args[])
    {
        System.out.println("Welcome to the employee gym information center, which information would you like to enter:");
        System.out.println("1. Current gym population");
        System.out.println("2. Population of different sections");
        System.out.println("3. Estimated population of the gym during different times");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        // if statement for information update choice
        if (choice == 1)
        {
            System.out.println("Enter the current population of the gym: ");
            population = scan.nextInt();
            System.out.println("Information Updated. The current population of the gym is at " + population + " people.");
        }
        else if (choice == 2)
        {
            System.out.println("Which section population would you like to update?");
            System.out.println("1. Cardio section");
            System.out.println("2. Free weights and benches");
            System.out.println("3. Bench press");
            System.out.println("4. Squat racks");
            System.out.println("5. Back machines");
            section = scan.nextInt();
            if (section == 1)
            {
                System.out.println("Enter the current population of the cardio section: ");
                cardioPopulation = scan.nextInt();
                System.out.println("Information Updated. The current cardio section population of the gym is at " + cardioPopulation + " people.");
            }
            else if (section == 2)
            {
                System.out.println("Enter the current population of the free weight section: ");
                freeWeightPopulation = scan.nextInt();
                System.out.println("Information Updated. The current free weight section population of the gym is at " + freeWeightPopulation + " people.");
            }
            else if (section == 3)
            {
                System.out.println("Enter the current population of the bench press section: ");
                benchPressPopulation = scan.nextInt();
                System.out.println("Information Updated. The current bench press section population of the gym is at " + benchPressPopulation + " people.");
            }
            else if (section == 4)
            {
                System.out.println("Enter the current population of the squat rack section: ");
                squatRackPopulation = scan.nextInt();
                System.out.println("Information Updated. The current squat rack section population of the gym is at " + squatRackPopulation + " people.");
            }
            else if (section == 5)
            {
                System.out.println("Enter the current population of the back machine section: ");
                backMachinePopulation = scan.nextInt();
                System.out.println("Information Updated. The current back machine section population of the gym is at " + backMachinePopulation + " people.");
            }
            else 
            {
                System.out.println("Error, enter a correct section number: ");
                System.out.println("1. Cardio section");
                System.out.println("2. Free weights and benches");
                System.out.println("3. Bench press");
                System.out.println("4. Squat racks");
                System.out.println("5. Back machines");
                section = scan.nextInt();
                while (section != 1 || section != 2 || section != 3 || section != 4 || section != 5)
                {
                    System.out.println("Error, enter a correct section number: ");
                    System.out.println("1. Cardio section");
                    System.out.println("2. Free weights and benches");
                    System.out.println("3. Bench press");
                    System.out.println("4. Squat racks");
                    System.out.println("5. Back machines");
                    section = scan.nextInt();
                }
                    if (section == 1)
                    {
                        System.out.println("Enter the current population of the cardio section: ");
                        cardioPopulation = scan.nextInt();
                        System.out.println("Information Updated. The current cardio section population of the gym is at " + cardioPopulation + " people.");
                    }
                    else if (section == 2)
                    {
                        System.out.println("Enter the current population of the free weight section: ");
                        freeWeightPopulation = scan.nextInt();
                        System.out.println("Information Updated. The current free weight section population of the gym is at " + freeWeightPopulation + " people.");
                    }
                    else if (section == 3)
                    {
                        System.out.println("Enter the current population of the bench press section: ");
                        benchPressPopulation = scan.nextInt();
                        System.out.println("Information Updated. The current bench press section population of the gym is at " + benchPressPopulation + " people.");
                    }
                    else if (section == 4)
                    {
                        System.out.println("Enter the current population of the squat rack section: ");
                        squatRackPopulation = scan.nextInt();
                        System.out.println("Information Updated. The current squat rack section population of the gym is at " + squatRackPopulation + " people.");
                    }
                    else if (section == 5)
                    {
                        System.out.println("Enter the current population of the back machine section: ");
                        backMachinePopulation = scan.nextInt();
                        System.out.println("Information Updated. The current back machine section population of the gym is at " + backMachinePopulation + " people.");
                    }
                }
        }
        else if (choice == 3)
        {
            System.out.println("Enter whether the time you want to update is in the A.M or P.M: ");
            System.out.println("1. A.M.");
            System.out.println("2. P.M.");
            int timeOfDay = scan.nextInt();
            //if statement for time of day
            if (timeOfDay == 1)
            {
                System.out.println("Enter a time from 6 A.M. to 11 A.M. that you would like to update (enter a number from 6 to 11): ");
                if (time == 6)
                {
                    System.out.println("Enter the average population of the gym at 6 A.M.: ");
                    sixAM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 6 A.M. is " + sixAM + " people.");
                }
                else if (time == 7)
                {
                    System.out.println("Enter the average population of the gym at 7 A.M.: ");
                    sevenAM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 7 A.M. is " + sevenAM + " people.");    
                }
                else if (time == 8)
                {
                    System.out.println("Enter the average population of the gym at 8 A.M.: ");
                    eightAM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 8 A.M. is " + eightAM + " people.");
                }
                else if (time == 9)
                {
                    System.out.println("Enter the average population of the gym at 9 A.M.: ");
                    nineAM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 9 A.M. is " + nineAM + " people.");
                }
                else if (time == 10)
                {
                    System.out.println("Enter the average population of the gym at 10 A.M.: ");
                    tenAM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 10 A.M. is " + tenAM + " people.");
                }
                else if (time == 11)
                {
                    System.out.println("Enter the average population of the gym at 11 A.M.: ");
                    elevenAM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 11 A.M. is " + elevenAM + " people.");
                }
                else
                {
                    System.out.println("Error, enter a correct time from 6 to 11 A.M: ");
                    time = scan.nextInt();
                    while (time != 11 || time != 10 || time != 9 || time != 8 || time != 7 || time != 6)
                    {
                        System.out.println("Error, enter a correct time from 6 to 11 A.M: ");
                        time = scan.nextInt();
                    }

                    if (time == 6)
                    {
                        System.out.println("Enter the average population of the gym at 6 A.M.: ");
                        sixAM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 6 A.M. is " + sixAM + " people.");
                    }
                    else if (time == 7)
                    {
                        System.out.println("Enter the average population of the gym at 7 A.M.: ");
                        sevenAM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 7 A.M. is " + sevenAM + " people.");    
                    }
                    else if (time == 8)
                    {
                        System.out.println("Enter the average population of the gym at 8 A.M.: ");
                        eightAM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 8 A.M. is " + eightAM + " people.");
                    }
                    else if (time == 9)
                    {
                        System.out.println("Enter the average population of the gym at 9 A.M.: ");
                        nineAM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 9 A.M. is " + nineAM + " people.");
                    }
                    else if (time == 10)
                    {
                        System.out.println("Enter the average population of the gym at 10 A.M.: ");
                        tenAM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 10 A.M. is " + tenAM + " people.");
                    }
                    else if (time == 11)
                    {
                        System.out.println("Enter the average population of the gym at 11 A.M.: ");
                        elevenAM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 11 A.M. is " + elevenAM + " people.");
                    }
                }
            }
            else if (timeOfDay == 2)
            {
                System.out.println("Enter a time from 12 P.M. to 11 P.M. that you would like to update (enter a number from 12 to 11): ");
                if (time == 12)
                {
                    System.out.println("Enter the average population of the gym at 12 P.M.: ");
                    twelvePM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 12 P.M. is " + twelvePM + " people.");
                }
                else if (time == 1)
                {
                    System.out.println("Enter the average population of the gym at 1 P.M.: ");
                    onePM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 1 P.M. is " + onePM + " people.");    
                }
                else if (time == 2)
                {
                    System.out.println("Enter the average population of the gym at 2 P.M.: ");
                    twoPM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 2 P.M. is " + twoPM + " people.");
                }
                else if (time == 3)
                {
                    System.out.println("Enter the average population of the gym at 3 P.M.: ");
                    threePM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 3 P.M. is " + threePM + " people.");
                }
                else if (time == 4)
                {
                    System.out.println("Enter the average population of the gym at 4 P.M.: ");
                    fourPM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 4 P.M. is " + fourPM + " people.");
                }
                else if (time == 5)
                {
                    System.out.println("Enter the average population of the gym at 5 P.M.: ");
                    fivePM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 5 P.M. is " + fivePM + " people.");
                }
                else if (time == 6)
                {
                    System.out.println("Enter the average population of the gym at 6 P.M.: ");
                    sixPM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 6 P.M. is " + sixPM + " people.");
                }
                else if (time == 7)
                {
                    System.out.println("Enter the average population of the gym at 7 P.M.: ");
                    sevenPM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 7 P.M. is " + sevenPM + " people.");
                }
                else if (time == 8)
                {
                    System.out.println("Enter the average population of the gym at 8 P.M.: ");
                    eightPM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 8 P.M. is " + eightPM + " people.");
                }
                else if (time == 9)
                {
                    System.out.println("Enter the average population of the gym at 9 P.M.: ");
                    ninePM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 9 P.M. is " + ninePM + " people.");
                }
                else if (time == 10)
                {
                    System.out.println("Enter the average population of the gym at 10 P.M.: ");
                    tenPM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 10 P.M. is " + tenPM + " people.");
                }
                else if (time == 11)
                {
                    System.out.println("Enter the average population of the gym at 11 P.M.: ");
                    elevenPM = scan.nextInt();
                    System.out.println("Information Updated. The current average population of the gym at 11 P.M. is " + elevenPM + " people.");
                }
                else
                {
                    System.out.println("Error, enter a correct time from 12 to 11 P.M: ");
                    time = scan.nextInt();
                    while (time != 12 || time != 11 || time != 10 || time != 9 || time != 8 || time != 7 || time != 6 || time != 5 || time != 4 || time != 3 || time != 2 || time != 1)
                    {
                        System.out.println("Error, enter a correct time from 12 to P.M: ");
                        time = scan.nextInt();
                    }

                    if (time == 12)
                    {
                        System.out.println("Enter the average population of the gym at 12 P.M.: ");
                        twelvePM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 12 P.M. is " + twelvePM + " people.");
                    }
                    else if (time == 1)
                    {
                        System.out.println("Enter the average population of the gym at 1 P.M.: ");
                        onePM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 1 P.M. is " + onePM + " people.");    
                    }
                    else if (time == 2)
                    {
                        System.out.println("Enter the average population of the gym at 2 P.M.: ");
                        twoPM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 2 P.M. is " + twoPM + " people.");
                    }
                    else if (time == 3)
                    {
                        System.out.println("Enter the average population of the gym at 3 P.M.: ");
                        threePM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 3 P.M. is " + threePM + " people.");
                    }
                    else if (time == 4)
                    {
                        System.out.println("Enter the average population of the gym at 4 P.M.: ");
                        fourPM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 4 P.M. is " + fourPM + " people.");
                    }
                    else if (time == 5)
                    {
                        System.out.println("Enter the average population of the gym at 5 P.M.: ");
                        fivePM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 5 P.M. is " + fivePM + " people.");
                    }
                    else if (time == 6)
                    {
                        System.out.println("Enter the average population of the gym at 6 P.M.: ");
                        sixPM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 6 P.M. is " + sixPM + " people.");
                    }
                    else if (time == 7)
                    {
                        System.out.println("Enter the average population of the gym at 7 P.M.: ");
                        sevenPM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 7 P.M. is " + sevenPM + " people.");
                    }
                    else if (time == 8)
                    {
                        System.out.println("Enter the average population of the gym at 8 P.M.: ");
                        eightPM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 8 P.M. is " + eightPM + " people.");
                    }
                    else if (time == 9)
                    {
                        System.out.println("Enter the average population of the gym at 9 P.M.: ");
                        ninePM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 9 P.M. is " + ninePM + " people.");
                    }
                    else if (time == 10)
                    {
                        System.out.println("Enter the average population of the gym at 10 P.M.: ");
                        tenPM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 10 P.M. is " + tenPM + " people.");
                    }
                    else if (time == 11)
                    {
                        System.out.println("Enter the average population of the gym at 11 P.M.: ");
                        elevenPM = scan.nextInt();
                        System.out.println("Information Updated. The current average population of the gym at 11 P.M. is " + elevenPM + " people.");
                    }
                }
            }
        }
        else 
        {
            System.out.println("Error, please try again");
        }
    }
}
