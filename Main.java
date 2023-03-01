// codes run in Java must be inside a class
// the class is named as Main - start with an uppercase first letter 
// the name of the java file must match the class name 
public class Main{
    // code inside the main() method will be executed
    public static void main(String [] args){
        // final: constant (unable to change)
        final int NUM = 7;
        System.out.println("NUM: " + NUM);

        // print: does not print a new line
        System.out.print("BTS forever ");
        // println: print a new line 
        System.out.println("Till 2025");
        System.out.println(7);
        
        // String
        String name = "Park Jimin";
        System.out.println("Name: " + name);

        // Int
        int myNum = 7;
        System.out.println("myNum: " + myNum);

        // Float
        double myFloat = 7.0;
        System.out.println("myFloat: " + myFloat);

        // Char
        char myChar = 'J';
        System.out.println("myChar: " + myChar);

        // Boolean
        boolean myBool = true;
        System.out.println("myBool: " + myBool);

        int nameLength = name.length();
        System.out.println("Length of name: " + nameLength);

        // Use \ for escape characters: ", ', \
        String song = "Zero o\'clock";
        System.out.println("Song: " + song);

        int myMax = Math.max(0,7);
        System.out.println("myMax: " + myMax);

        // if..else..else if
        int person = 1;
        if (person < 5){
            System.out.println("This person is older than " + name);
        }
        else if (person > 5 && person <= 7){
            System.out.println("This person is younger than " + name);
        }
        else if (person == 5) {
            System.out.println("This person is " + name);
        }
        else{
            System.out.println("This person is not in BTS");
        }

        // Shorthand if..else
        // variab;e = (condition) ? expressionTrue : expressionFalse;
        boolean isJimin = (person == 5) ? true : false;

        // Switch: selects one of many code blocks to be executed
        // Reduce the use of if..else statements
        switch (person){
            case 1:
                System.out.println("This person is Kim Seokjin");
                break;
            case 2: 
                System.out.println("This person is Min Yoongi");
                break;
            case 3: 
                System.out.println("This person is Jung Hoseok");
                break;
            case 4: 
                System.out.println("This person is Kim Namjoon");
                break;
            case 5: 
                System.out.println("This person is " + name);
                break;
            case 6: 
                System.out.println("This person is Kim Taehyung");
                break;
            case 7: 
                System.out.println("This person is Jeon Jungkook");
                break;
            default:
                System.out.println("This person is not in BTS");
        }

        // Arrays
        String[] fanchant = {"KNJ", "KSJ", "MYG", "JHS", "PJM", "KTH", "JJK", "BTS"};
        // Looping through an array can use while loop, for loop, or for-each loop
        // For-each loop
        System.out.println("Fanchant: ");
        for (String f : fanchant){
            System.out.println(f);
        }

        // Multi-dimensional arrays
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println("1st row, 2ndd col in myNumbers: " + myNumbers[0][1]);
        
    }
}