public class HomeWork {

    public static void main(String[] args){
        Cat[] cats = {
                new Cat("Пушок", 100),
                new Cat("Дымок", 100),

        };

        Bowl bowl = new Bowl();
        bowl.putFood(1000);
        for (Cat cat : cats) {
            System.out.println(cat);
            cat.eat(bowl);
          

        }

        for (Cat cat : cats) {
           System.out.println(cat);  }
    }

}
