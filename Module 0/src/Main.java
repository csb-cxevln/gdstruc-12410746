//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[] numbers;
    numbers = new int[5];

    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = -3;
    numbers[3] = 4;
    numbers[4] = 5;

    for (int i = 0; i < numbers.length; i++)
    {
        System.out.println(numbers[i]);
    }

    float[] meow;
    meow = new float[5];

    meow[0] = 4;
    meow[1] = 5;
    meow[2] = 6;
    meow[3] = 7;
    meow[4] = 8;

    System.out.println(meow[2]);
}
