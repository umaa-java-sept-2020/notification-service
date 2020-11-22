package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        NotificationService notificationService = new NotificationService();
        notificationService.displayNotification();
    }
}
