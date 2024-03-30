package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {
        //examples of tab
        System.out.println("This is a sentence");
        System.out.println(" This is a sentence");
        System.out.println("  This is a sentence");
        System.out.println("   This is a sentence");
        System.out.println("    This is a sentence");

        System.out.println("\tThis is a sentence"); //1 tab is equal to 4 spaces

        //Lets put 2 tabs
        System.out.println("\t\tThis is a sentence");

        //examples of NEW LINE
        System.out.println("1) Go to store");
        System.out.println("2) Grab a bread");
        System.out.println("3) Pay cashier");

        System.out.println();
        System.out.println("1) Go to store \n2) Grab a bread \n3) Pay cashier");

        System.out.println("\nweek \n\tmonday \n\ttuesday \n\twednesday \n\tthursday \n\tfriday \n\tsaturday \n\tsunday");

    }
}
