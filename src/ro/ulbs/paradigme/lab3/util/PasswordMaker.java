package ro.ulbs.paradigme.lab3.util;
import java.util.Random;

public class PasswordMaker
{
    private static final int MAGIC_NUMBER = 7;
    private static final String magicString = StringRandomizer.generateRandomString(25);
    private static PasswordMaker instance;
    private static int accessCount = 0;
    private String name;

    private PasswordMaker(String name)
    {
        this.name = name;
    }

    public static PasswordMaker getInstance(String name)
    {
        if (instance == null)
        {
            instance = new PasswordMaker(name);
        }
        accessCount++;
        return instance;
    }

    public String getPassword()
    {
        StringBuilder password = new StringBuilder();
        String randomPart = StringRandomizer.generateRandomString(MAGIC_NUMBER);
        password.append(randomPart);

        Random random = new Random();
        StringBuilder magicPart = new StringBuilder();
        for (int i = 0; i < 10; i++)
        {
            int index = random.nextInt(magicString.length());
            magicPart.append(magicString.charAt(index));
        }
        password.append(magicPart);
        password.append(name.length());
        int randomNumber = random.nextInt(51);
        password.append(randomNumber);
        return password.toString();
    }

    public static int getAccessCount()
    {
        return accessCount;
    }

    public static void main(String[] args)
    {
        PasswordMaker passwordMaker = PasswordMaker.getInstance("JohnDoe");
        System.out.println("Generated Password: " + passwordMaker.getPassword());
        System.out.println("Access count: " + PasswordMaker.getAccessCount());
        PasswordMaker passwordMaker2 = PasswordMaker.getInstance("JaneDoe");
        System.out.println("Generated Password: " + passwordMaker2.getPassword());
        System.out.println("Access count: " + PasswordMaker.getAccessCount());
    }
}
