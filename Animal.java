public class Animal {
    /*public static String getBirdGreeting(){
        return "tweet";
    }
*/
    public static String getDefaultGreeting(){
        return "Hello";
    }
/*
    public static String getCatGreeting(){
        return "meow!";
    }*/
    public static void main(String[] args) {
        String firstArgument = args[0];
        String output = "";
       /* if(firstArgument.equalsIgnoreCase("bird"))
            output = getBirdGreeting();
        else if(firstArgument.equalsIgnoreCase("cat"))
            output = getCatGreeting();*/
        output = getDefaultGreeting();

        System.out.println(output);

    }
}
