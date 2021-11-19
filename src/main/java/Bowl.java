public class Bowl {

    private int foodAmount;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("В миску положили %d грамм корма, теперь его %d грамм\n", amount, foodAmount);
    }

    public boolean decreaseFood(int amount) {
        this.foodAmount -= amount;
        //public boolean decreaseFood ( int amount){
        if (foodAmount < amount) {
            System.out.printf("корм уменьшился на %d, теперь его %d грамм\n", amount, foodAmount);
            return false;
        }
        {

            System.out.printf("Исчезло %d грамм корма, осталось %d грамм\n", amount, foodAmount);
            return true;
        }}


        public int getFoodAmount () {
          return foodAmount;}

    }
