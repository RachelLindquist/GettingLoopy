public class Main {
    public static void main(String[] args) {
        //1.	A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        System.out.println("Task 1");
        for (int i = 0; i <= 30; i++){
            System.out.println(i);
        }

        //2.	A loop that counts down by 1 from 30 to 0
        System.out.println("Task 2");
        for (int i = 30; i >= 0; i--){
            System.out.println(i);
        }

        //3.	A loop that counts up by 3 from 0 to 18
        System.out.println("Task 3");
        for (int i = 0; i <= 18; i+=3){
            System.out.println(i);
        }

        //4.	A loop that counts down by 2 from 10 to 0
        System.out.println("Task 4");
        for (int i = 10; i >= 0; i-=2){
            System.out.println(i);
        }

        //Part B: Output for loops (2 points each)
        //Use nested for loops to do these. Again, paste the output copy or screen shot after each one.
        //5.	A nested loop that creates this figure (there are no blank lines)
                //*
                //**
                //***
                //****
                //*****
        System.out.println("Task 5");
        for (int i = 1; i <= 5; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        //6.	A nested loop that creates this figure (there are no blank lines)
                //*****
                //****
                //***
                //**
                //*
        System.out.println("Task 6");
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        //7.	A nested loop that creates this figure (there are no blank lines)
                //*****
                //*****
                //*****
                //*****
                //*****
        System.out.println("Task 7");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}