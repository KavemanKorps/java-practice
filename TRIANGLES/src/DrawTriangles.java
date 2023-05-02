public class DrawTriangles 
{
    private int stars, lines, spaces;

    // TRIANGLE #1
    public void drawTriangle1(int choice)
    {
        // for every line, we print "stars" stars
        for (lines = 1; lines <= choice; lines++)
        {
            // we print 1 start on line 1 and move on to line 2:
            for (stars = 1; stars <= lines; stars++)
            {
                System.out.print('*');
                System.out.print(' ');

            }
            System.out.println();
        }
        System.out.println();
    }

    // TRIANGLE #2
    public void drawTriangle2(int choice)
    {
        for (lines = choice; lines >= 1; lines--)
        {
            for (stars = 1; stars <= lines; stars++)
            {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }

    public void drawTriangle3(int choice)
    {
        for (lines = 1; lines <= choice; lines++)
        {
            // for every line, we print "stars" stars
            for (stars = 1; stars <= lines; stars++)
            {
                System.out.print('*');
                System.out.print(' ');

            }
            System.out.println();
        }
        System.out.println();

        for (lines = 1; lines <= choice; lines++)
        {
            for (spaces = choice; spaces <= lines; spaces++)
            {
                System.out.print(' ' * choice);
                System.out.println('*');
            }
        }
        System.out.println();
        
    }
    public void drawTriangle4(int choice)
    {
        for (lines = choice; lines >= 1; lines--)
        {
            for (stars = 1; stars <= lines; stars++)
            {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
