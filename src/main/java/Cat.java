public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    public void eat(Bowl bowl) {
        bowl.decreaseFood(appetite);
        System.out.printf("- Кот  %s съел %d грамм еды------\n", name, appetite);
        satiety = !bowl.decreaseFood(appetite);

    }

    public boolean isHungry() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Кот по имени: " + name + '\'' + ", его аппетит: " + appetite + ", голодный: " + satiety + '!';
    }}