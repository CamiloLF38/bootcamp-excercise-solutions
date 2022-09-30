public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(greetings());
        System.out.println(greet("World"));
        System.out.println(greet("Java"));
    }

    public static String greetings(){
        return "Hello World!";
    }

    public static String greet(String who){
        return String.format("Hello %s!", who);
    }
}
