public class DrawTriangles 
{
    private int stars, lines, spaces;

    // TRIANGLE #1
    public void drawTriangle1(int choice)
    // 3 returns 3 lines. Last line has 3 stars.
    {
        // lines keep printing until "lines" is equal to "choice"
        for (lines = 1; lines <= choice; lines++)
        {
            // first line, 1. SO, draw one star:
            for (stars = 1; stars <= lines; stars++)
            {
                System.out.print('*');
                System.out.print(' ');  
                // why do we add spaces? so that there's a nice horizontal space inbetween the stars.

            }
            System.out.println();
        }
        System.out.println();
    }

    // TRIANGLE #2
    public void drawTriangle2(int choice)
    {
        // choice = 3. Instead of adding, we subtract from "lines"
        for (lines = choice; lines >= 1; lines--)
        {
            // choice is 3. So, we print 3 stars
            for (stars = 1; stars <= lines; stars++)
            {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }

    // TRIANGLE #3 (SIMILAR CODE TO TRIANGLE 1)
    public void drawTriangle3(int choice)
    {
        // choice = 3. Draw spaces first instead of stars.
        for (lines = 1; lines <= choice; lines++)
        {
            // we start off with two spaces and one star
            for (spaces = choice - lines; spaces >= 0; spaces--)
            {
                System.out.print("  ");
                // why do we add spaces? so that there's a nice horizontal space inbetween the stars.
            }

            for (stars = 1; stars <= lines; stars++)
            {
                // System.out.print(" ");
                System.out.print("* ");
                // why do we add spaces? so that there's a nice horizontal space inbetween the stars.
            }
            System.out.println();
        }
        System.out.println(); 
    }


    /*
     *  *  *
        *  *
           *
     */

    // TRIANGLE #4 (SIMILAR CODE TO TRIANGLE 2)
    public void drawTriangle4(int choice)
    {
        // 3, keep subbing til we reach 1.
        for (lines = choice; lines >= 1; lines--)
        {
            // we need to print spaces first
            for (spaces = lines; spaces <= choice - 1; spaces++)
            {
                //if (lines < choice)
                System.out.print("  ");
            }

            // choice is 3. So, we print 3 stars on line 1
            for (stars = lines; stars >= 1; stars--)
            {
                
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
