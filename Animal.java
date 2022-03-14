public class Animal {
    public static String getBirdGreeting(){
        return "tweet";
    }

    public static String getDefaultGreeting(){
        return "Hello";
    }
<<<<<<< HEAD
=======

>>>>>>> bird
    public static String getCatGreeting(){
        return "meow!";
    }
    public static void main(String[] args) {
        String firstArgument = args[0];
        String output = "";
<<<<<<< HEAD
       /* if(firstArgument.equalsIgnoreCase("bird"))
            output = getBirdGreeting();*/
        if(firstArgument.equalsIgnoreCase("cat"))
=======
       if(firstArgument.equalsIgnoreCase("bird"))
            output = getBirdGreeting();
        else if(firstArgument.equalsIgnoreCase("cat"))
>>>>>>> bird
            output = getCatGreeting();
        else output = getDefaultGreeting();

        System.out.println(output);

    }
}
